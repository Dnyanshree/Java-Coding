
public class TestMyStack {

	public static void main(String[] args) {

		ArrayStack testStack = new ArrayStack(3);		
		int size = testStack.size();
		boolean isEmpty = testStack.isEmpty();
		//testStack.pop();
		testStack.push(10);
		testStack.push("ABC");
		testStack.push(210);
		testStack.push("C");
		
		System.out.println("Size of Stack is: " + size);
		System.out.println("Is the stack empty? " + isEmpty);
		
		Object topElement = testStack.top();		
		System.out.println("Top Element is: " + topElement);
		
	}

}
