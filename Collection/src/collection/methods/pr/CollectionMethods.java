package collection.methods.pr;//methods of collection

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionMethods{
public static void main(String[] args) {
	   ArrayList al1 = new ArrayList();

       al1.add(10);
       al1.add(20);
       al1.add(10);
       al1.add(20);
       al1.add(10);
       al1.add(20);
       al1.add("marish");
       
      // System.out.println(al1);//add();
//       System.out.println(Collections.addAll(al1,"mokal","manish"));//addAll();
//     System.out.println(al1);
 //      System.out.println(al1.remove(2));//remove
//    System.out.println(al1);
     //  System.out.println(al1.removeAll(al1));//removeAll
     // System.out.println(al1);
       
   //   System.out.println(al1.contains("marish"));//Contains
 //     System.out.println(al1.containsAll(al1));//containsAll
//       
       ArrayList al2 = new ArrayList();
       al2.add("marish");
       al2.add(30);
       al2.add(5.72);
      // System.out.println(al2);
//       System.out.println(al1.retainAll(al2));//retainAll()
//       System.out.println(al1);
//       
//   System.out.println(al1.hashCode());//hashCode()
//       
//     System.out.println(al1.equals(al2));//equals()
//       
//      System.out.println(al2.size());//size()
//       
//      System.out.println(al2.isEmpty());//isEmpty()
//       
//       
//      al2.clear();
//      System.out.println(al2);//clear()
      
     ArrayList al3=new ArrayList();//hasNext()//Next()
     al3.add(10);
     al3.add("vaibhav");
     al3.add("mukund");
     Iterator it=al3.iterator();
//     while(it.hasNext())
//     {
//    	  System.out.println(it.next());
//     }
      
//     while(it.hasNext()) {//remove() of iterator in string
//    	 if(it.next()=="vaibhav") {
//    		 it.remove();
//    		 
//    	 }
//    	 System.out.println(al3);
//     }
  
     
     while(it.hasNext()) {//remove method to remove integer
    	 if(it.next()==Integer.valueOf(10)) {
    		 it.remove();
    	 	 System.out.println(al3);
    	 }
   
     }
     
     
     
    
//     
//     Object[] objects = al3.toArray();  //toArray
//     for(Object obj:objects)
//     {
//    	 System.out.println(obj);
//     }
     
    
}
  
 }