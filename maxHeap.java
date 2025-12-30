import java.util.Arrays;
import java.util.Scanner;
class MaxHeap{
	int maxSize,heapSize;
	int []arr;
	MaxHeap(int maxSize){
		this.maxSize=maxSize;
		heapSize=0;
		arr=new int[maxSize];
	}
	int parent(int x){
		return (x-1)/2;
	}
	int lchild(int x){
		return 2*(x+1)/2;
	}
	int rchild(int x){
		return 2*(x+2)/2;
	}
	
	//insert method 
	int insert(int x){
		if(heapSize==maxSize){
			System.out.Println("overflow");
			return;
		}
		int i=heapSize;
		arr[i]=x;
		heapSize++;
		while (i!=0 && arr[parent(i)]<arr(i)){
			int temp=arr[parent(i)];
			arr[parent(i)]=arr[i];
			arr[i]=temp;
			i=parent(i);
		}
		}
		//to get max element
		int getMax(){
			return arr[0];
		}
		int cursize(){
			return heapSize;
		}
		//to remove a element
		void remove(){
			if(maxSize==0){
				System.out.println("no element in heap to delete");
				return;
			}
			if(heapSize==1){
				heapsize--;
			}
			arr[0]=arr[heapSize-1];
			heapSize--;
			heapify(0);
		}
		//Heapify method
		void heapify(int i){
			int l=lchild(i);
			int r=rchild(i);
			int largest=i;
			if(heapSize>l && arr[l]>arr[largest]){
				largest=l;
			}
			if(heapSize>r && arr[r]>arr[largest]){
				largest=r;
			}
			if(largest!=i){
				int temp=arr[i];
				arr[i]=arr[largest];
				arr[largest]=temp;
				heapify(largest);
			}
		}
		public static void main(String []args){
			MaxHeap objj=new MaxHeap(10);
			int arr[]={1,2,3,4,5,6};
			for(int i:arr){
				insert(i);
			}
			System.out.println("The current size of the heap is " + h.curSize());
			System.out.println("The current maximum element is " + h.getMax());
			objj.removeMax();
			System.out.println("The current size of the heap is " + h.curSize());
			// Inserting 2 new keys into the heap.
			objj.insertKey(15);
			objj.insertKey(5);
			System.out.println("The current size of the heap is " + h.curSize());
			System.out.println("The current maximum element is " + h.getMax());
		}
	}
