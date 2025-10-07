// Create a class Student with id and name. Use a parameterized constructor to initialize these values and display the student details.
class Student
{
    int id;
    String name;
    
    Student(int i, String n)
    {
        id = i;
        name = n;
    }
    
    void display()
    {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }	
}
class T8_Q09
{
    public static void main(String s[])
    {
        Student stu = new Student(101, "John Doe");
        
        stu.display();
    }

}
