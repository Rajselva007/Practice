package day1;

public class Inheritance_Child extends Inheritance_Parent {

	public void Student_Gender() {
		System.out.println("Male");
	}

	public static void main(String[] args) {
		Inheritance_Child Stu = new Inheritance_Child();
		Stu.Studend_Name();
		Stu.Student_Gender();
		Stu.Studend_Age();
		Stu.Studend_Class();
	}
}
