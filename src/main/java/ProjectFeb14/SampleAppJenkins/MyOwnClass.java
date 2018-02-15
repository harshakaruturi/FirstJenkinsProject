package ProjectFeb14.SampleAppJenkins;

public class MyOwnClass {

	static int empID;
	static int age;
	static double salary;
	static double vpay;

	public static void main(String[] args) {

		MyOwnClass o = new MyOwnClass();
		MyOwnClass.empID = 1002;
		o.age = 32;
		o.salary = 1234.45;
		o.vpay = 123.21;
		System.out.println("Employee ID is " + empID);
		System.out.println("Employee age is " + age);
		System.out.println("Employee salary is " + salary);
		System.out.println("Employee variable pay is " + vpay);
	}

}
