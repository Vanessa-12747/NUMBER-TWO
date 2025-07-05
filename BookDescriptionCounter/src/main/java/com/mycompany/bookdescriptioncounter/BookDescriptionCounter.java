package com.mycompany.bookdescriptioncounter;
import java.util.Scanner;

public class BookDescriptionCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book description: ");
        String description = scanner.nextLine();

        int count = countUgandaOccurrences(description);
        System.out.println("The word 'Uganda' appears " + count + " times in the description.");
        scanner.close();
    }

    public static int countUgandaOccurrences(String text) {
        String lowercaseText = text.toLowerCase();
        String target = "uganda";
//Target word in lowercase
        int count = 0;
        int index = 0;
        while ((index = lowercaseText.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }
        return count;
    }
}
