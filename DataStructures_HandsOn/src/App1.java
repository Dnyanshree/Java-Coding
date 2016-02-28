import java.util.HashMap;

public class App1 {

	public static void main(String[] args) {
		
		HashMap<String, Student> studentMap = new HashMap<String, Student>();
		
		studentMap.put("00000", new Student("Julia Roberts", "CS", "00000", 21));
		studentMap.put("11111", new Student("Jim Cary", "CS", "11111", 27));
		studentMap.put("22222", new Student("Tom Cruise", "ECE", "22222", 23));
		studentMap.put("33333", new Student("Channing Tatum", "ECE", "33333", 25));
		
		Student s = studentMap.get("00000");
		
		if(s!=null){
			System.out.println(s.toString());
		}
		else
			System.out.println("null");

	}

}
