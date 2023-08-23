package trainig;

public class Method_Oride extends Method_Oload {

	public void Student_Details(String Name, int Age) {
		System.out.println("Student Name is " + Name + "  Age is " + Age);
	}

	public class M_Or extends Method_Oride {

		public void Student_Details(String Class, int ID) {
			System.out.println("Student Class is " + Class + "  ID is " + ID);
		}
	}

	public static void main(String args[]) {
		Method_Oride MO = new Method_Oride();

		MO.Student_Details("Selva", 32);
		MO.Student_Details("BCA", 12345);
	}
}
