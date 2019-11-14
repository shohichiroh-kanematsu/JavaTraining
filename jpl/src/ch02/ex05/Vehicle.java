class Vehicle {
	public int speed;
	public int direction;
	public String name;
	public static int number;
	public int carID;
	
	public static void main(String args[]){
		Vehicle car1 = new Vehicle();
		car1.speed = 40;
		car1.direction = 60;
		car1.name = "A";
		car1.number = 2;
		car1.carID = 1;
		
		Vehicle car2 = new Vehicle();
		car2.speed = 50;
		car2.direction = 90;
		car2.name = "B";
		car2.number = 3;
		car2.carID = 2;
		
		System.out.println("car1");
		car1.print();
		System.out.println("car2");
		car2.print();	
	}

	public void print(){
		System.out.println("speed: " + speed);
		System.out.println("direction: " + direction);
		System.out.println("name: " + name);
		System.out.println("carID: " + carID);
	}
}