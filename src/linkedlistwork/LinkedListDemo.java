package linkedlistwork;

public class LinkedListDemo {
	
	@SuppressWarnings("rawtypes")
	Node head, currentNode;
	
	@SuppressWarnings({ "unused", "rawtypes" })
	public void add (){
		Node nnode = new Node();
		
	}
	
	@SuppressWarnings("rawtypes")
	public void display(){
		Node temp = head;
		while (temp!=null){
			System.out.println(temp.element);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		

	}

}