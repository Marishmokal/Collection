package Hashset.methods;

import java.util.LinkedHashSet;

public class HashMapDemo {
public static void main(String[] args) {
	Student s1=new Student(10,"AAA");
	Student s2=new Student(20,"BBB");
	Student s3=new Student(30,"CCC");
	Student s4=new Student(10,"AAA");
	Student s5=new Student(40,"DDD");
	
	LinkedHashSet h=new LinkedHashSet();
	h.add(s1);
	h.add(s2);
	h.add(s3);
	h.add(s4);
	h.add(s5);
	
	
	System.out.println(h);
}
}
