package practice.comparable.wings;

import java.util.TreeSet;

public class TestClass  {
public static void main(String[] args) {
	Student s=new Student(105,"rambhau");
	Student s2=new Student(115,"shambhau");
	Student s3=new Student(11,"sham");
	TreeSet st=new TreeSet();
	st.add(s);
	st.add(s3);
	st.add(s2);
	System.out.println(st);
	
	
}

}
