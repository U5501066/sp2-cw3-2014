import java.util.Random;
import java.util.Scanner;

/**
 * @author Adriano Da Cruz
 *@author  Adekoyejo Atewologun
 */
public class DrivingProgram {

	/**
	 * Main method
	 */
	public static void main(String[] args) {
		Scanner keyBoard =new Scanner(System.in);
		int numOfFloors=-1;
		int numberCustomers=-1;
		
		//In your main method of the driving program, at the beginning ask the user for the number of floors and
		while(numOfFloors<1 || numOfFloors>13){
			try{
				System.out.print("Enter the number of floors: ");
				numOfFloors=keyBoard.nextInt();
			}catch(Exception ex){
				System.out.print("Enter correct number of floors>1.\n");
				numOfFloors=-1;
				keyBoard.next();
			}
		}
		
		//Your program should have error checking to make sure the user inputs are valid. For example,
		//if a user gives non-integer inputs, notify the user that the inputs are incorrect and prompt again.
		//the number of customers 
		while(numberCustomers<1 || numberCustomers>10000){
			try{
				System.out.print("Enter the number of customers: ");
				numberCustomers=keyBoard.nextInt();
			}catch(Exception ex){
				System.out.print("Enter correct number of customers>1.\n");
				numberCustomers=-1;
				keyBoard.next();
			}
		}
		
		//which can be used to create an instance of Building. Then we only need to
		Building building=new Building();
		building.setNumOfFloors(numOfFloors);
		//call the method to start the elevator and method to output information, repeatedly in a loop.
		Elevator elevator=new Elevator();
		elevator.setNUM_OF_FLOORS(numOfFloors);
		building.setElevator(elevator);
		//Randomly select the floors (to and from) for each customer. Use the appropriate method(s) from the
		//Random class (look it up in the Java documentation)
		//add customer to biulding
		System.out.println("List of customers:");
		for(int i=0;i<numberCustomers;i++){
			//Each customer starts from a random floor, and has a random destination floor.
			int currentFloor=new Random().nextInt(numOfFloors);
			int destinationFloor=currentFloor;
			while(destinationFloor==currentFloor){
				destinationFloor=new Random().nextInt(numOfFloors);
			}
			String ID="C0000"+i;
			boolean inElevator=false;
			boolean finished=false;
			Customer newCustomer=new Customer(currentFloor, destinationFloor, ID, inElevator, finished);
			building.addCustomer(newCustomer);
			
			System.out.println(building.getCustomerList().get(i).getID()+" customer current floor: "+building.getCustomerList().get(i).getCurrentFloor()+
					", destination floor: "+building.getCustomerList().get(i).getDestinationFloor());
		}
		
		int counter=0;
		while(counter<numOfFloors*2+1){//When all customers have reached their destination floor, the simulation is finished.
			System.out.println("\nElevator current floor: "+building.getElevator().getCurrentFloor()+
					", elevator direction: "+building.getElevator().getDirection());
			//customer Joins
			for(int i=0;i<building.getCustomerList().size();i++){
				if(!building.getCustomerList().get(i).isInElevator()){
					//Each customer will use the elevator only once, i.e., when a customer leaves the elevator, he/she
					//will never use it again.
					building.getCustomerList().get(i).setInElevator(building.getElevator().customerJoins(building.getCustomerList().get(i)));
				}
			}
			//customer Leaves
			for(int i=0;i<building.getCustomerList().size();i++){
				if(building.getCustomerList().get(i).isInElevator()){
					building.getElevator().customerLeaves(building.getCustomerList().get(i));
				}
			}
			building.getElevator().move();
			counter++;
		}	
	}
}
