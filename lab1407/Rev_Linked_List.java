
/*
 * Q.3.Accept a linkedlist add data in first poition last position 
 	and then reverse the linkedlist content 
 */

package lab1407;
import java.util.LinkedList;

public class Rev_Linked_List {
	
public static void main(String[] args) {
		
	LinkedList<Integer> ll1=new LinkedList<Integer>();
	ll1.add(2);
	ll1.add(3);
	ll1.add(4);
	
	System.out.println(ll1);
	
	ll1.addFirst(1);
	ll1.addLast(5);
	
	System.out.println("After Adding first and last element "+ll1);
	
	
	LinkedList<Integer> ll2=new LinkedList<Integer>();
	for(int i=ll1.size()-1; i>=0 ;i--) {
		ll2.add(ll1.get(i));
	}
	System.out.println("After Reversing =  "+ll2);
	
}
}
