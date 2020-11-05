
//import java.List;
import java.lang.*;
import java.sql.Driver;
import java.util.*;
import java.util.ArrayList;



public class CollectionsDemo1 {	
	public static void main(String[] args) throws InterruptedException {		
		//ArrayList<String> al = new ArrayList<>(); 
	List<String> al = new ArrayList<>();	
	 al.add("Anil");
	 al.add("Sunil");
	 al.add("Ranjith");
	 al.add("Raju");
	 al.add("Ravi");
	 al.add("Sai");
	 al.add("Ramu");
	// al.add(2,"Prashanth");
	 // al.sort(String.CASE_INSENSITIVE_ORDER);
	 
	 System.out.println(al);
	 System.out.println(al.subList(2, 6));
//		 
//	for (String string : al) 
//	{
//		System.out.println(string);
//		
//	}
	
	
	
	
	List<String> al1 = new ArrayList<>();
	
	al1.add("Radha");
	al1.add("Sunitha");
	//al1.clear();
	al1.add("Rajitha");
	al1.add("Rama");
	al1.add("Ravalika");	
	
	

	
	al1.addAll(2, al);
	al.clear();
	
//	al1.clear();
	
	System.out.println(al1);
		 
//	for (String string1 : al1)
//	{
//		System.out.println(string1);
//		
//	}
	 
		//System.out.println(al.equals(al1));
		
	}
	
	

}


