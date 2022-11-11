package navigableset.methods;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NevigableDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();

		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		
	//	System.out.println(t);
	//	System.out.println(t.lower(50));//lower()
		
		//System.out.println(t.higher(20));//higher()
		
//		System.out.println(t.ceiling(39));//ceiling()
//		
//		System.out.println(t.floor(21));//floor()
		
//		System.out.println(t.pollFirst());//pollFirst()
//		System.out.println(t);
//		
//		System.out.println(t.pollLast());//pollLast()
//		System.out.println(t);
//		
		
//		Iterator itr=t.iterator();//iterator()
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		
//		NavigableSet n=t.descendingSet();//descendingSet()
//		Iterator it=n.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
//		Iterator itr=t.descendingIterator();//descending iterator()
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
		System.out.println(t.headSet(30,true));
		}
}
