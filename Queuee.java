class Queuee{
	private int capacity;
	private int arr[];
	private int front;
	private int rear;
	private int size;
	
	Queuee(int capacity){
		arr = new int[capacity];
		this.capacity=capacity;
		front=0;
		rear=-1;
		size=0;
	}
	
	public void enqueue(int item){
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}else{
			rear=(rear+1)%capacity;
			arr[rear]=item;
			System.out.println("enqueued item is :"+item);
			size++;
		}
	}
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}else{
			int Removeditem=arr[front];
			front =(front+1)%capacity;
			size--;
			return Removeditem;
		}
	}
		public boolean isFull() {
	    	return size == capacity;
		}

		public boolean isEmpty() {
	   	 return size == 0;
		}

	public static void main(String[] args){
		Queuee obj=new Queuee(5);
		obj.enqueue(30);
		obj.enqueue(40);
		System.out.println("dequeue "+obj.dequeue());
	}
}
