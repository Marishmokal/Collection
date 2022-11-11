package sortedset.methods;//methods of sorted set

import java.util.TreeSet;

public class SortedSetMethods {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(11);
	t.add(22);
	t.add(33);
	t.add(11);
	t.add(44);
	t.add(44);
	t.add(55);
	System.out.println(t);
	
	System.out.println(t.first());//First()
	
	System.out.println(t.last());//Last()
	
	
	System.out.println(t.headSet(33));//headSet()
	
	System.out.println(t.tailSet(33));//tailSet()
	
	
	System.out.println(t.subSet(22,55));//subSet()
	
	System.out.println(t.comparator());//comparator()
	
}
}
