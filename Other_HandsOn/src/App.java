
public class App {

	public static void main(String[] args) {
/*		
		//Calling Static nested class
		OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass("Hello");
		
		//Calling Inner Class
		OuterClass oc = new OuterClass();
		oc.new InnerClass();
*/
		//Anonymous Class using Interface
		new IPrinter() {			
			@Override
			public void print(String text) {
				System.out.println(text);				
			}
		}.print("Checking Anonymous Class");
		
		//Anonymous Class using Abstract Class
		new Printer() {			
			@Override
			void print(String text) {
				System.out.println(text);				
			}
		}.print("Checking Anonymous Class using Abstract Class  !!");
				
		//Exception Handling
		int x, y = 6, z = 0;
		try {
			x = y / z;
		} catch (ArithmeticException ae) {
			System.out.println("Arithematic Exception Caught!");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		//Below line gets printed only if we use try catch block
		System.out.println("After Division Message");
	}

}
