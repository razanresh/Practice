package collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("Enter your command :\n|  add  |  get  |  exit  |");
            String command = scanner.nextLine();
            switch (command) {
                case "add":
                    System.out.println("Enter last name:");
                    String lastName = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.add(lastName, phoneNumber);
                    System.out.println("Added " + phoneNumber + " for " + lastName);
                    break;
                case "get":
                    System.out.println("Enter last name:");
                    lastName = scanner.nextLine();
                    List<String> numbers = phoneBook.get(lastName);
                    if (numbers.isEmpty()) {
                        System.out.println("No phone numbers found for " + lastName);
                    } else {
                        System.out.println("Phone numbers for " + lastName + ": " + numbers);
                    }
                    break;
                case "exit":
                    running = false;
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }
        scanner.close();
    }
}
