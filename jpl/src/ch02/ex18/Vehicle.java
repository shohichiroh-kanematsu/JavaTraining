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
		if( args.length != 1) {
			System.out.println("Usage : java Vehicle <所有者名>");
			System.exit(1);
		}
		Vehicle car1 = new Vehicle(args[0]);
		car1.print();
	}
}