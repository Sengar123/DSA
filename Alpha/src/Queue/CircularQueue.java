package Queue;

import Queue.QueueByArray.Queue;

public class CircularQueue {
	static class Queue{
		static int arr[];
		static int front;
		static int rear;
		static int size;
		Queue(int n){
			size=n;
			arr=new int[n];
			rear=front=-1;
		}
		
		public static boolean isEmpty() {
			return front==-1 && rear==-1;
		}
		public static boolean isFull() {
			return (rear+1)%size==front;
		}
		
		public static void add(int data) {
			if(isFull()) {
				System.out.println("Queue is full");
				return ;
			}
			if(front==-1) {
				front=0;
			}
			rear=(rear+1)%size;
			arr[rear]=data;
		}
		
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			int f=arr[front];
			if(rear==front) {
				rear=front=-1;
			}
			else {
			front=(front+1)%size;
			}
			return f;
		}
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is Empty");
				return -1;
			}
			return arr[front];
		}
	}
	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.remove());
		q.add(4);
		System.out.println(q.remove());
		q.add(5);
		while(!q.isEmpty()) {
			System.out.print(q.peek()+" ");
			q.remove();
		}
	}

}

/* enqueue O(1)---> rear
 * dequeue O(1)----> front
 * peek O(1) remove value of front
 */
