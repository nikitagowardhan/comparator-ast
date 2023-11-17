import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class TestData {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(new Student(101, "Vijay", 27));
		a.add(new Student(102, "Ajay", 24));
		a.add(new Student(103, "Nil", 25));
		
		Collections.sort(a, new AgeComparator());
		
		Iterator i = a.iterator();
		
		while(i.hasNext())
		{
			Student st=(Student)i.next();  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}
		
   Collections.sort(a, new NameComparator());
   
   Iterator itr = a.iterator();
   
   while(itr.hasNext())
   {
	   Student st1 = (Student)itr.next();
	   System.out.println(st1.rollno+" "+st1.name+" "+st1.age); 
   }
		
	}

}
