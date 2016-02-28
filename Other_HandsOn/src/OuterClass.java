
public class OuterClass {
	
	String msg;
	
	class InnerClass{
		String innerMsg;
		public InnerClass() {
			this.innerMsg = OuterClass.this.msg;
		}
		
	}
	
	static class StaticNestedClass{
		String snMsg;
		public StaticNestedClass(String msg){
			this.snMsg = msg;
		}
	}

}
