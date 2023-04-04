package LinkedList;
import java.util.LinkedList; //java collection framework
public class import_linkedlist_from_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll=new LinkedList<>();
		ll.addLast(12);
		ll.addFirst(122);
		ll.addLast(78);
		System.out.println(ll);
		ll.removeLast();
		ll.removeFirst();
		System.out.println(ll);

	}

}
