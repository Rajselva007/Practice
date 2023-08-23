package day1;

public class Inheritance_Multi_Level {

	
	public void Batch()
	{
		System.out.println("9 PM Batch");
	}


public static void main(String[] args)
{
	Inheritance_Child Ch = new Inheritance_Child();
	
	Ch.Studend_Name();
	Ch.Student_Gender();
	
	Inheritance_Multi_Level ML = new Inheritance_Multi_Level();
	
	ML.Batch();
}
}
