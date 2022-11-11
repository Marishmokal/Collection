package list.methods;//methods of List

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class ListMethods {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(10);
	al.add(12.5);
	al.add("marish");
	al.add(1000);
	
	
//	System.out.println(al);//add
//	System.out.println(al.get(2));//get()
//	System.out.println(al.set(2,"mokal"));//set()
//	System.out.println(al);

//	System.out.println(al.indexOf("mokal"));//indexOf()
//	
//	System.out.println(al.lastIndexOf(1000));//lastIndexOf()

//	System.out.println(al.subList(0,2));//sublist()
	
	//methods of list iterator
	List a=new ArrayList();
	a.add("sham");
	a.add(15);
	a.add(45.4);
	a.add('c');
	a.add("bhagwan");
//	System.out.println(a);
	
	ListIterator aIterator=a.listIterator(2);
//	while(aIterator.hasNext())//hasNext and next
//	{
//		System.out.println(aIterator.next());
//	}
//	
	System.out.println("............................................................");
//	while(aIterator.hasPrevious())//hasPrevious and previous
//	{
//		System.out.println(aIterator.previous());
//	}
	
	
//	while(aIterator.hasNext())//nextIndex
//	{
//		System.out.println(aIterator.next());
//	}
	
	
//	while(aIterator.hasPrevious())//previous index
//	{
//		System.out.println(aIterator.previous());
//	}
	aIterator.next();// 1st next for 1st index
	aIterator.next();
	aIterator.remove();
	System.out.println(a);//remove() based on index
	
	
	
	
}
}
