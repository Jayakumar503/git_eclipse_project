package src;
public class TestSample1 {

	public static void main(String[] args) {
	
		System.out.println("This is the TestSample1 class");
		int c = 10;
		if(c%2 == 0) {
			System.out.println("C is even");
		}else {
			System.out.println("C is odd");
		}
		
		int a = 10;
		int b = a + c;
		System.out.println("b is "+ b);
	}

}
