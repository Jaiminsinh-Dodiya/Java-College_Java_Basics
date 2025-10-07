import java.util.Scanner;

class Animal {
    int id;
    String name;
    int price;
    String location;
    String size;

    Animal(int id, String name, int price, String location, String size) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.location = location;
        this.size = size;
    }
}

class Cat extends Animal {

    void show() {
        System.out.println("\n--- Cat Details ---");
        System.out.println("Cat ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Country: " + location);
        System.out.println("Size: " + size);

        double gst = price * 9 / 100.0;
        double totalPrice = price + gst;

        System.out.println("GST (9%): " + gst);
        System.out.println("Total Price with GST: " + totalPrice);
    }
}

class Temp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cats: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Cat[] cats = new Cat[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Cat " + (i + 1) + ":");

            System.out.print("Enter Cat ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Cat Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Cat Price: ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Country: ");
            String location = sc.nextLine();

            System.out.print("Enter Size: ");
            String size = sc.nextLine();

            cats[i] = new Cat(id, name, price, location, size);
        }

        System.out.println("\nDisplaying Cat Information:");
        for (int i = 0; i < n; i++) 
	{
            cats[i].show();
        }
    }
}
