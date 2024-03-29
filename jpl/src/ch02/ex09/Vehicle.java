public class Vehicle {
	public double speed;
	public double angle;
	private String owner;
	private long VehicleID;
	private static long NextVehicleID=0;

	Vehicle(){
		VehicleID = NextVehicleID;
		NextVehicleID++;
	}
	
	Vehicle(String owner){
		this();
		this.owner = owner;
	}

	public void print(){
		System.out.println("ID : " + VehicleID);
		System.out.println("速度 : " + speed);
		System.out.println("方向 : " + angle);
		System.out.println("所有者 : " + owner);
	}

	public static long getMaxID(){
		return NextVehicleID - 1;
	}
	
	public static void main(String args[]){
		Vehicle car1 = new Vehicle("A");
		Vehicle car2 = new Vehicle("B");
		Vehicle car3 = new Vehicle("C");
		
		System.out.println("MaxVehicleID ： " + Vehicle.getMaxID());
	}
}