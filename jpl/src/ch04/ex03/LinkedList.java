public interface LinkedList<E> {
	void show();
	String toString();
	Object getObj();
	void setObj(Object Obj);
	E getNextNode();
	void setNextNode(E nextNode);
	int countList();
}