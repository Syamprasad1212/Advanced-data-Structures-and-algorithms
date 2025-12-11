//Stack using java
class stackk{
    private int maxLength;
    private int[] arr;
    private int top;
	stackk(int size){
		maxLength=size;
		arr= new int[maxLength];
		top=-1;	
	}
	
	void push(int value){
		if(top==maxLength-1){
			System.out.println("Stack overflow");
			return;
		}
		else{
			arr[++top]=value;
			System.out.println("value of pushed element"+value);
		}
	}
	
	void pop(){
		if(top==-1){
			System.out.println("Stack is underflow");
		}
		else{
			int poppedElement=arr[top--];
			System.out.println("popping element is "+poppedElement);
		}
	}
	public int top(){
		if(top==-1){
			System.out.println("stack is empty");
			return -1;
		}
		return arr[top];
	}
	
	public static void main(String[] args){
		stackk obj=new stackk(5);
		obj.push(20);
		obj.push(30);
		obj.pop();
		System.out.println("Top element of stack"+obj.top());
		obj.push(50);
		System.out.println("Top element of stack"+obj.top());
	}
}
