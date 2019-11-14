public class Vehicle {
	private double speed;
	private double angle;
	private String owner;
	private long VehicleID;
	private static long NextVehicleID=0;
	public static final int TURN_LEFT=0;
	public static final int TURN_RIGHT=1;
	
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
	
	public double getSpeed(){return speed;}
	
	public double getAngle(){return angle;}
	
	public String getOwner(){return owner;}
	
	public void changeSpeed(double speed){this.speed = speed;}
	public void stop(){speed = 0.0;}
	
	public void turn(double angle){
		this.angle += angle;
	}
	
	public void turn(int turn){
		switch(turn){
		case TURN_LEFT: turn(-Math.PI/2);break;
		case TURN_RIGHT: turn(Math.PI/3);break;
		}
	}
	
	public static void main(String args[]){
		Vehicle car1 = new Vehicle("Taro");

		car1.turn(Math.PI/4);
		System.out.println(car1.getAngle());
		car1.turn(TURN_LEFT);
		System.out.println(car1.getAngle());
		car1.turn(TURN_RIGHT);
		System.out.println(car1.getAngle());
	}
}