package trainig;

public class Method_Oload {

	public void Student_Details(String Name, int Age) {
		System.out.println("Student Name is " + Name + "  Age is " + Age);
	}

	public void Student_Details(char Section, String Floor) {
		System.out.println("Student Section is " + Section + "Floor is " + Floor);

	}

	public void Student_Details(double CPA, boolean Pass_Status) {

		System.out.println("Student CPA is " + CPA + " Student Pass " + Pass_Status);
	}

	
	public static void main(String args[])
	{
		Method_Oload MO = new Method_Oload();
		
		MO.Student_Details("Selvaraj", 32);
		MO.Student_Details('A', "Second");
		MO.Student_Details(78.63, true);
		
				
	}
}
