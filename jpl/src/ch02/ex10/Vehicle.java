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
		System.out.println("���x : " + speed);
		System.out.println("���� : " + angle);
		System.out.println("���L�� : " + owner);
	}

	public static long getMaxID(){
		return NextVehicleID - 1;
	}
	
	public String toString(){
		String vehicle = 
			"ID : " + VehicleID + "\n" +
			"���x : " + speed + "\n" +
			"���� : " + angle + "\n" +
			"���L�� : " + owner + "\n";
		return vehicle;
	}
	
	public static void main(String args[]){
		Vehicle car1 = new Vehicle("A");
		car1.speed = 60.0;
		car1.angle = Math.PI * 1/6;
		
		System.out.println(car1);
	}
}