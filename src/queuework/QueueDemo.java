package queuework;

public class QueueDemo <E>{ //First in first out
	
	E queue[];
	int size, filledstatus = 0, index;
	
	@SuppressWarnings("unchecked")
	public QueueDemo (int size){
		this.size = size;
		queue = (E[]) new Object[size];
	}
	
	public void Enque (E value){
		if (filledstatus == size)
			System.out.println("[[[[[[[[[[ The queue is full. ]]]]]]]]]]");
		else{
			queue[filledstatus] = value;
			filledstatus++;
		}
	}
	
	public int filledStatus (){
		return filledstatus;
	}
	
	public int Search (E value){
		for (int i = 0; i<filledstatus; i++)
			if (queue[i] == value){
				index = i;
				break;
			}
			else index = -1;
		return index;
				
	}
	
	public void Deque (){
		filledstatus--;
		for (int i = 0; i<filledstatus; i++)
			queue[i] = queue[i+1];
	}
	
	public void display (){
		System.out.print("[");
		for (int i = 0; i<filledstatus; i++)
			System.out.print(queue[i]+", ");
		System.out.print("\b\b]\n");
	}
	
	public boolean isEmpty() {  
        return queue.length == 0;  
    }  

	public static void main(String[] args) {
		QueueDemo<Integer> myqueue = new QueueDemo<Integer>(7);
		myqueue.Enque(19);
		myqueue.Enque(8);
		myqueue.Enque(10);
		myqueue.Enque(0);
		myqueue.Enque(90);
		System.out.print("The queue is: "); myqueue.display();
		System.out.println("The queue is empty: "+myqueue.isEmpty());
		System.out.println("The element is present at "+ myqueue.Search(0)+" index of queue.");
		myqueue.Deque();
		System.out.print("The queue after dequing is: "); myqueue.display();
	}

}
