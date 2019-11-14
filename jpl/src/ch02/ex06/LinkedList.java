public class LinkedList {
	public Object Obj;
	public LinkedList nextNode;
	
	public void show(){
		System.out.println(Obj.getClass());
		if (Obj instanceof Vehicle) {
			Vehicle tmpVehicle = (Vehicle) Obj;
			tmpVehicle.print();
		}
		if(nextNode!=null)
			nextNode.show();
	}
	
	public static void main(String args[]){
		Vehicle car1 = new Vehicle();
		car1.speed = 60.0;
		car1.angle = Math.PI * 1/6;
		car1.owner = "Taro";
		car1.VehicleID=Vehicle.NextVehicleID;
		Vehicle.NextVehicleID++;
		
		Vehicle car2 = new Vehicle();
		car2.speed = 80.0;
		car2.angle = Math.PI * 1/3;
		car2.owner = "Hanako";
		car2.VehicleID=Vehicle.NextVehicleID;
		Vehicle.NextVehicleID++;

		Vehicle car3 = new Vehicle();
		car3.speed = 100.0;
		car3.angle = Math.PI * 1/4;
		car3.owner = "Hayato";
		car3.VehicleID=Vehicle.NextVehicleID;
		Vehicle.NextVehicleID++;

		LinkedList node1 = new LinkedList();
		LinkedList node2 = new LinkedList();
		LinkedList node3 = new LinkedList();
		
		node1.Obj = car1;
		node1.nextNode=node2;
		
		node2.Obj = car2;
		node2.nextNode=node3;

		node3.Obj = car3;
		node3.nextNode=null;
		
		node1.show();
		
	}
}