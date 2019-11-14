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
	
	public String toString(){
		String vehicle = 
			"ID : " + VehicleID + "\n" +
			"速度 : " + speed + "\n" +
			"方向 : " + angle + "\n" +
			"所有者 : " + owner + "\n";
		return vehicle;
	}
	
	public static void main(String args[]){
		Vehicle car1 = new Vehicle("A");
		car1.speed = 60.0;
		car1.angle = Math.PI * 1/6;
		
		System.out.println(car1);
	}
}