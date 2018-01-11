package collectionclassesjava;

import java.util.ArrayList;

public class JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListExample();

	}
	
	//Set-->
	public static void setExample() {
		
	}
	
	//List-->ArrayList, LinkedList, Vector and Stack
	//ArrayList: implements List and RandomAccess(MarkerInterface) interfaces
		//Quick access in search and slow when we delete and insert compared to LinkedList
	public static void arrayListExample() {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mobile");
		al.add("SIM");
		al.add("Mobile");
		al.add("Laptop");
		al.add("Desktop");
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(4));
		
		
		
	}

}
