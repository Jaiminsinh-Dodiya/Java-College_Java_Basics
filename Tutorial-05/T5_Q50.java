// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q50 
{

    public static void main(String f[]) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter word to search:");
        String word = sc.nextLine();

        if (sentence.contains(word)) {
            System.out.println("The word is present in the sentence.");
        } 
        else {
            System.out.println("The word is not present.");
        }
    }
}
