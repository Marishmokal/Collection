package arraylist.methods;

import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add("marish");
	al.add(10);
	al.add(5.55);
	al.add('j');
//	System.out.println(al); 
	
//		al.trimToSize();
//	System.out.println(al.size());//trimToSize();
//	
	
	al.ensureCapacity(10);//ensureCapacity();
	for(Object o:al)
	{
		System.out.println(o);
	}
	
	
	
}
}
