package trainig;

public class Keyword {

	int c; // Global Variable

	void One(int a, int b) {
		int c = 20; // Local Variable
		System.out.println(a + b + c); // this C get local variables only
	}

	void Two(int a, int b) {
		
		System.out.println(a + b + this.c); // Using this keyword its always catch value in within the class (Global variable only)
	}
	
	void Three() {
		
		System.out.println(c); // without passing parameters C get Global parameter value
	}

	void Four(int a) {
		
		System.out.println(a+this.c); 
	}
	
	public static void main(String args[]) {
		Keyword k = new Keyword();
		k.One(5, 10);
		k.Two(1, 2);
		k.Three();
		k.Four(5);
	}
}
