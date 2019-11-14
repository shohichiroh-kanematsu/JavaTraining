public class Vehicle {
	private double speed;
	private double angle;
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
	
	public double getSpeed(){
		return speed;
	}
	
	public double getAngle(){
		return angle;
	}
	
	public String getOwner(){
		return owner;
	}
	
	public void changeSpeed(double speed){
		this.speed = speed;
	}
	
	public void stop(){
		speed = 0.0;
	}
	
	public static void main(String args[]){
		Vehicle car1 = new Vehicle("Taro");

		car1.changeSpeed(60.0);
		System.out.println(car1.getSpeed());
		car1.stop();
		System.out.println(car1.getSpeed());
	}
}