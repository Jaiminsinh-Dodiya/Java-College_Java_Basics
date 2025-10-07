// Create a class Book with title and author. Take input from the user using Scanner and display the book details.

import java.util.Scanner;
class Book
{
	String title;
	String author;
	
	Book()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Book Title: ");
		title = sc.nextLine();
		
		System.out.print("Enter Book Author: ");
		author = sc.nextLine();
	}
	
	void display()
	{
		System.out.println("Book Title: " + title);
		System.out.println("Book Author: " + author);
	}	
}

class T8_Q06
{
	public static void main(String s[])
	{
		Book b1 = new Book();
		
		b1.display();
	}

}