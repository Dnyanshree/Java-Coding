
public class ArrayStack implements StackInterface{
	/*
	public boolean isEmpty();
	public int size();
	public Object top() throws StackEmptyException;
	public void push(Object element);
	public void pop()throws StackEmptyException;
	*/
	private int index = -1; //Represents ArrayIndex. Array is Empty if -1
	private Object[] S;
	private final static int DEFAULT_CAPACITY = 1024; //Default capacity of Stack
	private int MAXIMUM_CAPACITY; //Maximum capacity of Stack	
	
	public ArrayStack(){//Constructor to Initialize Stack with default capacity
		this(DEFAULT_CAPACITY);
	}	
	public ArrayStack(int capacity){//Constructor to initialize Stack with given capacity
		MAXIMUM_CAPACITY = capacity;
		S = new Object[MAXIMUM_CAPACITY];		
	}
 	public boolean isEmpty(){
		return (index < 0); //Returns true if number of elements in stack is less than zero 
							//and false if number of elements is greater than or equal to zero
	}
	public int size(){		
		return (index + 1);// Size is array index plus one
	}	
	public Object top() throws StackEmptyException{		
		if(isEmpty()){
			throw new StackEmptyException("Stack is Empty");			
		}
		return S[index];		
	}	
	public void push(Object element) throws StackFullException{
		if(size() == MAXIMUM_CAPACITY){
			throw new StackFullException("Stack Overflow!!");
		}
		S[++index] = element;
	}
	public Object pop() throws StackEmptyException{
		Object removedElement;
		if(isEmpty()){
			throw new StackEmptyException("Stack is Empty.");
		}
		removedElement = S[index];
		S[index] = null;
		index--;		
		return removedElement;
	}
}
