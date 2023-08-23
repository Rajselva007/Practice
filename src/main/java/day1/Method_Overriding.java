package day1;

public class Method_Overriding {

	public void Library_Details(int Roomno, String Floor, long BookID, char Section) {
		System.out.println(Roomno+" "+Floor+" "+BookID+" "+Section);
	}

	public void Library_Details2(int BookID, String Bookname, int Bar) {
		System.out.println(BookID+" "+Bookname+" "+Bar);
	}

	public void Library_Details3(String LibName, char Section, long BookID, int Floor) {
		System.out.println(LibName+" "+Section+" "+BookID+" "+Floor);
	}

	public void Library_Details4(double BookPrice, int RackNo, long BookID, char Section) {
		System.out.println(BookPrice+" "+RackNo+" "+BookID+" "+Section);
	}
	
	public void Library_Details5(double BookPrice, int RackNo, long BookID) {
		System.out.println(BookPrice+" "+RackNo+" "+BookID);
	}
	

}