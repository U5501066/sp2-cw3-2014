import java.util.ArrayList;
/**
 * @author Adriano Da Cruz
 *@author  Adekoyejo Atewologun
 */
/***
 * class Building
 *
 */
public class Building {
	private int numOfFloors;// The number of floors
	private ArrayList<Customer> customerList;// The list of customers
	private Elevator elevator;// The elevator equipped in the building
	/**
	 * Building constructor
	 */
	public Building(){
		customerList=new ArrayList<Customer>();
		elevator=new Elevator();
	}
	/***
	 * add Customer
	 * @param customer
	 */
	public void addCustomer(Customer customer){
		customerList.add(customer);
	}
	/**
	 * set NumOfFloors
	 * @param numOfFloors
	 */
	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}
	/**
	 * get NumOfFloors
	 * @return
	 */
	public int getNumOfFloors() {
		return numOfFloors;
	}
	/**
	 * set Elevator
	 * @param elevator
	 */
	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}
	/**
	 * get Elevator
	 * @return
	 */
	public Elevator getElevator() {
		return elevator;
	}
	/**
	 * set CustomerList
	 * @param customerList
	 */
	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}
	/***
	 * get CustomerList
	 * @return
	 */
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
}
