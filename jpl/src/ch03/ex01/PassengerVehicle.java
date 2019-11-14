public class PassengerVehicle extends Vehicle{
	private int seatNumber;
	private int seatedPerson;
	
	public PassengerVehicle(String owner) {
		super(owner);
	}
		
	public void setSeatNumber(int seatNumber){ this.seatNumber=seatNumber;}
	public int getSeatNumber(){ return seatNumber; }
	
	public void setSeatedPerson(int seatedPerson){ this.seatedPerson = seatedPerson; }
	public int getSeatesPerson(){ return seatedPerson; }
	
	public void addSeatedPerson(){ seatedPerson = getSeatesPerson() + 1; }
	
	public String toString(){
		return super.toString() + 
			"ÀÈ” : " + seatNumber +"\n" +
			"æÔl” : " + seatedPerson + "\n";
	}
	
	public static void main(String args[]){
		PassengerVehicle taxi = new PassengerVehicle("Taro");
		taxi.setSeatNumber(4);
		taxi.addSeatedPerson();
		System.out.println(taxi);
	}
}