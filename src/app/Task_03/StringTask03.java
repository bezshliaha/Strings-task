package app.Task_03;

import java.util.Scanner;

public class StringTask03 {
    public static void main(String[] args) {
        String names = "Bob, Alice, Tom, Lucy, Bob, Lisa";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String search = sc.nextLine();

        int count = search(names, search);
        displayResult(search, count);
    }

    private static int search(String items, String word) {
        String[] nameArray = items.split(",");
        int count = 0;
        for (String name : nameArray) {
            if (name.toLowerCase().trim().equals(word.toLowerCase().trim())) {
                count++;
            }
        }
        return count;
    }

    private static void displayResult(String search, int count) {
        if (count > 0) {
            System.out.println(
                    new StringBuilder()
                            .append("Found name: ")
                            .append(search).append("\n")
                            .append("Quantity of names: ").append(count)
            );
        } else {
            System.out.println(new StringBuilder().append("Name not found: ").append(search));
        }
    }
}