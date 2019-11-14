public class LinkedList {
	private Object Obj;
	private LinkedList nextNode;
	
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
	
	public Object getObj(){
		return Obj;
	}
	
	public LinkedList getNextNode(){
		return nextNode;
	}
	
	public int countList(){
		if(nextNode==null){
			return 1;
		}else{
			return 1 + nextNode.countList();
		}
	}
	
	public static void main(String args[]){
		Vehicle car1 = new Vehicle("A");
		Vehicle car2 = new Vehicle("B");
		Vehicle car3 = new Vehicle("C");

		LinkedList node3 = new LinkedList(car2);
		LinkedList node2 = new LinkedList(car2,node3);
		LinkedList node1 = new LinkedList(car1,node2);
		
		System.out.println(node1.countList());
		System.out.println(node2.countList());
		System.out.println(node3.countList());
	}
}