import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;

public class App {

	public static void main(String[] args) {


		//ArrayList<Student> students = new ArrayList<Student>();
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("Julia Roberts", "CS", "00000", 21));
		students.add(new Student("Jim Cary", "CS", "11111", 27));
		students.add(new Student("Tom Cruise", "ECE", "22222", 23));
		students.add(new Student("Channing Tatum", "ECE", "33333", 25));
		
		
		students.add(new Student("Anjalina Jolie", "uSC", "22222", 3));
		students.add(new Student("Jenna Dewan", "ABC", "33333", 5));
		
		for (Student s : students) {
			System.out.println(s.toString());
		}
		
		System.out.println(students.contains(new Student("Jenna Dewan", "ABC", "33333", 5)));
		//Collections.sort(students);
//		Collections.sort(students, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.age > o2.age){
//					return -1;					
//				}else if(o1.age < o2.age){
//					return 1;
//				}else
//				return 0;
//			}
//		});
//		for(int i=0; i< students.size();i++){
//			Student s = students.get(i);
//			System.out.println(s.toString());
//		}
//		
		
	}

}
