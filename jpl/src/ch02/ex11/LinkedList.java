public class LinkedList {
	public Object Obj;
	public LinkedList nextNode;
	
	public LinkedList(Object Obj,LinkedList nextNode) {
		this.Obj = Obj;
		this.nextNode = nextNode;
	}
	
	public LinkedList(Object Obj) {
		this(Obj,null);
	}
	
	public void show(){
		System.out.println(Obj.getClass());
		if (Obj instanceof Vehicle) {
			Vehicle tmpVehicle = (Vehicle) Obj;
			tmpVehicle.print();
		}
		if(nextNode!=null)
			nextNode.show();
	}
	
	public String toString(){
		if (Obj instanceof Vehicle) {
			String tmpv;
			Vehicle tmpVehicle = (Vehicle) Obj;
			tmpv = tmpVehicle.toString();
			if(nextNode!=null)
				tmpv += nextNode.toString();
			return tmpv;
		}
		return null;
	}
	
	public static void main(String args[]){
		Vehicle car1 = new Vehicle("Taro");
		car1.speed = 60.0;
		car1.angle = Math.PI * 1/6;
		
		Vehicle car2 = new Vehicle("Hanako");
		car2.speed = 80.0;
		car2.angle = Math.PI * 1/3;
		
		LinkedList node2 = new LinkedList(car2);
		LinkedList node1 = new LinkedList(car1,node2);
		
		System.out.println(node1);
	}
}