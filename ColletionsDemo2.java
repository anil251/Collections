import java.util.*;

class Student
{
	int rollno;
	String name;
	String address;
	
	Student(int rollno,String name,String address)
	{
		this.rollno=rollno;
		this.name=name;
		this.address=address;
	}
}



public class ColletionsDemo2 {
	
	public static void main(String[] args) {		
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student(1,"Anil","Warangal");
		Student s2 = new Student(2,"Sunil","Hanamkonda");
		Student s3 = new Student(3,"Ranjith","Kazipet");
		Student s4= new Student(4,"Raju","Narsampet");
		
	    list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4); 
		
		for (Student student : list) {	
			
		System.out.println(student.rollno+"  "+student.name+"   "+student.address);
//		System.out.println(list2.rollno+"  "+list2.name+"   "+list2.address);
//		System.out.println(list3.rollno+"  "+list3.name+"   "+list3.address);
//		System.out.println(list4.rollno+"  "+list4.name+"   "+list4.address);
		}
		
	}

}
