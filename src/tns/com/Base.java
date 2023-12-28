package tns.com;


public class Base {

	
	//types of data members
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	
	//declare methods
	void methodDefault() {
		System.out.println("this is default method");
		System.out.println("varDefault"+ varDefault);
	}
	public void methodPublic() {
		System.out.println("this is public method");
		System.out.println("varPublic" + varPublic);
	}
	private void methodPrivate() {
		System.out.println("this is private method");
		System.out.println("varPrivate" + varPrivate);
		
	}
	protected void methodProtected() {
		System.out.println("this is protected method");
		System.out.println("varProtected" + varProtected);
	}
	
	
	public static void main(String[] args) {
		Base b = new Base();
		b.methodDefault();
		b.methodPrivate();
		b.methodProtected();
		b.methodPublic();
	}
	
}
