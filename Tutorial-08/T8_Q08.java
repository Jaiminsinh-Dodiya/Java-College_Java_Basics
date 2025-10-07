import java.util.Scanner;
class EmployeeSalary
{
	String employeeName;
	double salary;
	
	EmployeeSalary()
	{
		employeeName = "Alice";
		salary = 50000.0;
	}
	
	void updateSalary()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter updated salary for " + employeeName + ": ");
		salary = sc.nextDouble();
	}
	
	void display()
	{
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Salary: " + salary);
	}	
}
class T8_Q08
{
	public static void main(String s[])
	{
		EmployeeSalary emp = new EmployeeSalary();
		
		emp.updateSalary();
		emp.display();
	}

}
