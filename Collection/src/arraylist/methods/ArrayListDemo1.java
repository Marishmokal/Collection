package arraylist.methods;// arrayList problem

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {

		ArrayList<ArrayList> al = new ArrayList();

		ArrayList<Integer> al1 = new ArrayList();
		ArrayList<Integer> al2 = new ArrayList();
		ArrayList<Integer> al3 = new ArrayList();
		
		Integer b1[] = { 1, 2, 5, 7 };
		Integer b2[] = { 3, 4, 5, 9 };
		Integer b3[] = { 8, 5, 6, 10 };
		for (int i = 0; i < b1.length; i++) {
			al1.add(b1[i]);
			al2.add(b2[i]);
			al3.add(b3[i]);
		}
		al.add(al1);
		al.add(al2);
		al.add(al3);

		System.out.println(al);
		al1.retainAll(al2);
		al1.retainAll(al3);
		al2.retainAll(al3);
		
		
		
		System.out.println(al1+" "+al2);

	}

}
