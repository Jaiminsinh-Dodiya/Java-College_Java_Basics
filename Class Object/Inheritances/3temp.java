// Write a class name is animal, second is cat and 3rd class name is kitty perform the multi-level inheritance print cat id, cat name and cat price. and please use the scanner class for user input


import java.util.Scanner;

class Animal {
    int id;
    String name;
    int price;

    Animal(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("This is an Animal");
    }
}

class Cat extends Animal {
    Cat(int id, String name, int price) {
        super(id, name, price); 
    }

    
    void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Price: " + price);
    }
}

class Kitties extends Cat {
    Kitties(int id, String name, int price) {
        super(id, name, price);
    }


    void display() {
        System.out.println("Kitties details:");
        super.display(); 
    }
}

public class multilevelinheritance2 {
    public static void main(String[] h) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int ID = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Name: ");
        String nm = sc.nextLine();

        System.out.print("Enter Price: ");
        int pr = sc.nextInt();

        Kitties c1 = new Kitties(ID, nm, pr);

        
        c1.display();
    }
}