package tns.com;


public class Loops {

	public static void main(String[] args) {
		
		
		//forloop
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		
		//whileloop
		
//		char i = 'a';
//		while(i<='z') {
//			System.out.print(i);
//			i++;
//		}
		
		
		
		//dowhileloop
		
//		int i = 2;
//		do {
//			System.out.println(i);
//			i=i+2;
//		}
//		while(i<10);
		
		
		//foreachloop
		
//		int a[]= {10,20,40,50};
//		
//		for(int i : a) {
//			System.out.println(i);
//		}
//		System.out.println();
//		
//		char ch[] = { 's', 'u', 's', 'h', 'm', 'a'};
//		for(char ch1:ch) {
//			System.out.print(ch1);
//		}
		
		
		//Nestedloop
		
		int beg = 10;
		int end = 20;
		for (int i =beg; i<=end; i++) {
			for(int j = 1; j<=10; j++) {
				
			
			System.out.println(i + " * " + " "+ i *j );
		}
			System.out.println();
		}

	}

}
