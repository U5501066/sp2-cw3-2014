/**
 * @author Adriano Da Cruz
 *@author  Adekoyejo Atewologun
 */
/**
 * 
 *Class Customer
 */
public class Customer {
	private int currentFloor;// The current floor of the elevator
	private int destinationFloor;// The destination floor of the elevator
	private String ID;// The customer’s ID
	private boolean inElevator;// The flag to denote whether he/she is in the elevator
	private boolean finished;// The flag to denote whether he/she has reached their floor
	/**
	 * Customer constructor
	 */
	public Customer(){}
	/**
	 * Customer constructor
	 * @param currentFloor
	 * @param destinationFloor
	 * @param ID
	 * @param inElevator
	 * @param finished
	 */
	public Customer(int currentFloor,int destinationFloor,String ID,boolean inElevator,boolean finished){
		this.currentFloor=currentFloor;
		this.destinationFloor=destinationFloor;
		this.ID=ID;
		this.inElevator=inElevator;
		this.finished=finished;	
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
	 * set DestinationFloor
	 * @param destinationFloor
	 */
	public void setDestinationFloor(int destinationFloor) {
		this.destinationFloor = destinationFloor;
	}
	/**
	 * get DestinationFloor
	 * @return
	 */
	public int getDestinationFloor() {
		return destinationFloor;
	}
	/**
	 * set ID
	 * @param iD
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * get ID
	 * @return
	 */
	public String getID() {
		return ID;
	}
	/**
	 * set In Elevator
	 * @param inElevator
	 */
	public void setInElevator(boolean inElevator) {
		this.inElevator = inElevator;
	}
	/**
	 * is In Elevator
	 * @return
	 */
	public boolean isInElevator() {
		return inElevator;
	}
	/***
	 * set Finished
	 * @param finished
	 */
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	/**
	 * is Finished
	 * @return
	 */
	public boolean isFinished() {
		return finished;
	}
}
