package arraylist.methods;

import java.util.ArrayList;

public class CustomArrayList {
int size=5;


class Product
{
	int pId;
	String pName;
	char pAvail;
	double pPrice;
	float pRating;
	public Product(int pId, String pName, char pAvail, double pPrice, float pRating) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAvail = pAvail;
		this.pPrice = pPrice;
		this.pRating = pRating;
	}
	
	
}
public static void main(String[] args) {
	CustomArrayList ca=new CustomArrayList();
	int pId[]= {15464,78452,14526,6358,1272};
	String pName[]= {"Iphone14","SamsungZ4","One+t3","MotoG","Redmi5A"};
	char pAvail[]= {'Y','Y','N','Y','N'};
	double pPrice[]= {150000,85000,37000,17000,9000};
	float pRating[]= {4.5f,4.3f,4.7f,4.1f,3.7f};
	ca.addElement(pId,pName,pAvail,pPrice,pRating);
	
}
public void addElement(int pId[],String pName[],char pAvail[],double pPrice[],float pRating[])
{
	ArrayList<Product>al=new ArrayList<>();
	for(int i=0;i<size;i++)
	{
		al.add(new Product(pId[i],pName[i],pAvail[i],pPrice[i],pRating[i]));
	}
	displayElements(al);
}
public void displayElements(ArrayList<Product> al) {
	System.out.println("Product id" + "\tProduct Name" + "\tProduct Avail" + "\tProduct Price" + "\tProduct Rating");
	System.out.println("-----------------------------------------------------------------------------------------------");
	for(int i=0;i<size;i++)
	{
		Product pr=al.get(i);
		System.out.println(pr.pId+"\t\t"+pr.pName+"\t"+pr.pAvail+"\t\t\t"+pr.pPrice+"\t"+pr.pRating+"\t");
	}
	
}

}
