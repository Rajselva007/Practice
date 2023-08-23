package day1;

public class Method_Overrid2 extends Method_Overriding

{

	public void Library_Details(int Roomno, String Floor, long BookID, char Section) {
		System.out.println(Roomno+" "+Floor+" "+BookID+" "+Section);
	}

	public void Library_Details2(int BookID, String Bookname, int Bar) {
		Library_Details2(BookID, Bookname, Bar);
	}

	public void Library_Details3(String LibName, char Section, long BookID, int Floor) {
		Library_Details3(LibName, Section, BookID, Floor);
	}

	public void Library_Details4(double BookPrice, int RackNo, long BookID, char Section) {
		Library_Details4(BookPrice, RackNo, BookID, Section);
	}

	public void Library_Details5(double BookPrice, int RackNo, long BookID) {
		Library_Details5(BookPrice, RackNo, BookID);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_Overrid2 MO = new Method_Overrid2();

		MO.Library_Details(1223, "Second", 12361, 'A');
		MO.Library_Details2(1234, "JAVA", 12456);
		MO.Library_Details3("Selva", 'B', 1245862, 2);
		MO.Library_Details4(99.99, 24, 7859656, 'C');
		MO.Library_Details5(59.99, 52, 4568562);
		
	}

}
