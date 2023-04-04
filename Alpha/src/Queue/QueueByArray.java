package Queue;



public class QueueByArray {

	static class Queue{
		static int arr[];
		static int size;
		static int rear;
		static int front;
		Queue(int n){
			arr=new int[n];
			size=n;
			rear=-1;
			front=-1;
			
		}
		public static boolean isEmpty() {
			return rear==-1;
		}
		//add
		public static void add(int data) {
			if(rear==size-1) {
				System.out.println("QUEUE IS FULL");
				return;
			}
			rear+=1;
			arr[rear]=data;
		}
		
		//delete 
		public static int remove() {
			if(rear==-1) {
				return -1;
			}
			int front=arr[0];
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
			}
			rear-=1;
			return front;
		}
		
		
		//peek
		public static int peek() {
			if(rear==-1) {
				return -1;
			}
			int front=arr[0];
			return front;
		}
		public static void print() {
			for(int i=0;i<size;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue(5);
		q.add(67);
		q.add(6);
		q.add(7);
		q.add(9);
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
		
		
		

	}

}
/* enqueue O(1)---> rear
 * dequeue O(n)----> front
 * peek O(1) remove value of front
 */