package task6;

import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBookService service = new PhoneBookService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Phone Book");
        while (true) {
            System.out.println("Available commands: add, delete, list, save, load, search, edit, stats, exit");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            switch (command.toLowerCase()) {

                case "add":
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter date of birth (yyyy-mm-dd): ");
                    String date = scanner.nextLine();

                    try {
                        LocalDate dateOfBirth = LocalDate.parse(date);
                        service.addRecord(name, phone, email, address, dateOfBirth);
                    } catch (DateTimeParseException e) {
                        System.out.println("Invalid date format. Record not added");
                    }


                    break;

                case "search":
                    System.out.print("Enter name for search: ");
                    String nameSearch = scanner.nextLine();
                    PhoneBookRecord record = service.search(nameSearch);
                    if (record ==null) {
                        System.out.println("Record not found");
                    } else {
                        System.out.println(record);
                    }

                    break;

                case "edit":
                    System.out.println("Enter name to edit: ");
                    String targetName = scanner.nextLine();
                    System.out.println("Enter new phone number: ");
                    String newPhone = scanner.nextLine();
                    service.edit(targetName, newPhone);
                    break;

                case "delete":
                    System.out.print("Enter name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    service.deleteRecord(nameToDelete);
                    break;

                case "list":
                    List<PhoneBookRecord> records = service.listRecords();
                    if (records.isEmpty()) {
                        System.out.println("The phone book is empty");
                    } else {
                        records.forEach(System.out::println);
                    }

                    break;

                case "save":
                    List<PhoneBookRecord> phoneBookRecords = service.listRecords();
                    try {
                        service.saveToFile(phoneBookRecords);
                        System.out.println("Phone book successfully saved to file");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case "load":
                    try {
                        List<PhoneBookRecord> phoneBook = service.loadFromFile();
                        for (PhoneBookRecord phoneBookRecord : phoneBook) {
                            service.addRecord(phoneBookRecord.getName(), phoneBookRecord.getPhoneNumber(), phoneBookRecord.getEmail(), phoneBookRecord.getAddress(), phoneBookRecord.getDateOfBirth());
                        }
                        System.out.println("Phone book successfully loaded from file");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;

                case "stats":
                    String text = service.showStatistics();
                    System.out.println(text);
                    break;

                case "exit":
                    System.out.println("Exiting the phone book. Goodbye");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
