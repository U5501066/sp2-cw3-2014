import java.util.ArrayList;
/**
 * @author Adriano Da Cruz
 *@author  Adekoyejo Atewologun
 */

/**
 * 
 * class Elevator
 *
 */
public class Elevator {
	private int NUM_OF_FLOORS;// The number of floors
	private ArrayList<Customer> registerList;//The list of customers in the elevator
	private int currentFloor;// The current floor of the elevator
	private String direction;// The direction of the elevator
	private int acc=1;
	/**
	 * Elevator
	 */
	public Elevator(){
		registerList=new ArrayList<Customer>();
		currentFloor=0;
		direction="UP";
	}
	/**
	 *  The method to move the elevator by 1 floor
	 */
	public void move(){
		//tart at the bottom, go to the
		//top, then go to the bottom
		if(currentFloor==NUM_OF_FLOORS){
			acc=-1;
			direction="DOWN";
		}
		if(currentFloor==0){
			acc=1;
			direction="UP";
		}
		currentFloor+=acc;
		
	}
	/**
	 * A customer goes into the elevator
	 * @param customer
	 */
	public boolean customerJoins(Customer customer){
		if(customer.getCurrentFloor()==currentFloor){
			if(customer.getCurrentFloor()==currentFloor){
			    this.registerList.add(customer);
			    System.out.println("Cusomer "+customer.getID()+" goes into the elevator");
			    return true;
			}
		}
		return false;
	}
	/***
	 * (customer) A customer goes out of the elevator
	 * @param customer
	 */
	public void customerLeaves(Customer customer){
		
		for(int i=0;i<getRegisterList().size();i++){
			if(registerList.get(i).getDestinationFloor()==currentFloor){
				System.out.println("Customer "+getRegisterList().get(i).getID()+" goes out of the elevator");
				getRegisterList().remove(i);
			}
		}
		
	}
	/**
	 * set CurrentFloor
	 * @param currentFloor
	 */
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	/**
	 * get CurrentFloor
	 * @return
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}
	/**
	 * set Direction
	 * @param direction
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	/**
	 * get Direction
	 * @return
	 */
	public String getDirection() {
		return direction;
	}
	/**
	 * get NUM_OF_FLOORS
	 * @return
	 */
	public int getNUM_OF_FLOORS() {
		return NUM_OF_FLOORS;
	}
	/**
	 * set NUM_OF_FLOORS
	 * @param nUM_OF_FLOORS
	 */
	public void setNUM_OF_FLOORS(int nUM_OF_FLOORS) {
		NUM_OF_FLOORS = nUM_OF_FLOORS;
	}
	public ArrayList<Customer> getRegisterList() {
		return registerList;
	}
}
