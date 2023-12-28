package tns.com;


public class Excutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b = new Base();
		b.methodDefault();
		//b.methodPrivate();
		b.methodProtected();
		b.methodPublic();
		
		System.out.println();
		System.out.println();
		
		b.varDefault= 15;
		b.varProtected = 25;
		b.varPublic = 35;
		System.out.println();
		System.out.println("");
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
		
		
		b.methodDefault();
		b.methodProtected();
		b.methodPublic();
	}

}

