package cursors.java;//Methods of 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorDemo {
public static void main(String[] args) {
  Vector v=new Vector();
  v.add("shree");
  v.add(10);
  v.add(20.5);
  v.add('c');
 // System.out.println(v);
  Enumeration e=v.elements();//Enumeration cursor();
//  while(e.hasMoreElements())
//  {
//	  System.out.println(e.nextElement());//failsafe/nonFailFast
//	  v.add(33);
//  }
  
  
  
  ArrayList al=new ArrayList();
  al.add("marish");
  al.add(15);
  al.add("pranav");
  al.add('j');
  
  System.out.println(al);
  Iterator itr=al.iterator();
//  while(itr.hasNext())//hasnext and next();
//  {
//	  System.out.println(itr.next());
//  }
//  while(itr.hasNext())//remove();
//  {
//	  if(itr.next()=="pranav")
//	  { 
//		  itr.remove();
//	  }
//	  }
//	  System.out.println(al);
//	  
	 
	  ListIterator it=al.listIterator();//listIterator
	  										//hasNext and Next();
//	  while(it.hasNext())
//	  {
//		  System.out.println(it.next());
//	  }
//	  
//	  while(it.hasPrevious())//hasPrevious and Previous
//	  {
//		  System.out.println(it.previous());
//	  }
//	  
//	  while(it.hasNext())//remove()
//	  {
//		  System.out.println(it.next());
//		  it.remove();
//	  }
//	  System.out.println(al);
//	  
	
	  
//	  while(it.hasNext())//add();
//	  {
//		  if(it.next()=="pranav")
//		  it.add(33);
//	  }
//	 for(Object o:al)
//	 {
//		 System.out.println("");
//	 }
//	 System.out.println(al);
//	
	 
	 
	 while(it.hasNext())//set();
	 {
	 System.out.println(it.next());	
	 }
	 it.set(44);
	 for(Object o:al)
	 {
		 System.out.println("");
	 }
	 System.out.println(al);
	  }



} 



