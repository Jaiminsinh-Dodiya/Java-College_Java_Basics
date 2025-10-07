// Create a class Book with title, author, and price. Use a parameterized constructor to initialize all data members and display the book details.

class Book
{
	String title;
	String author;
	double price;
	
	Book(String t, String a, double p)
	{
		title = t;
		author = a;
		price = p;
	}
	
	void display()
	{
		System.out.println("Book Title: " + title);
		System.out.println("Book Author: " + author);
		System.out.println("Book Price: " + price);
	}	
}

class T8_Q11
{
	public static void main(String s[])
	{
		Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
		
		b1.display();
	}

}