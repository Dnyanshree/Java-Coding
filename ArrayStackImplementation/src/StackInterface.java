
public interface StackInterface {
	
	public boolean isEmpty();
	public int size();
	public Object top() throws StackEmptyException;
	public void push(Object element) throws StackFullException;
	public Object pop() throws StackEmptyException;

}
