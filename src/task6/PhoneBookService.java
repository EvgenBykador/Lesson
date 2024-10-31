package task6;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PhoneBookService {
    private List<PhoneBookRecord> phoneBook;

    private static final String FILE_NAME = "phonebook.txt";

    public PhoneBookService () {
        phoneBook = new ArrayList<>();
    }



    public void addRecord(String name, String phoneNumber, String email, String address, LocalDate dateOfBirth) {
        PhoneBookRecord phoneBookRecord = new PhoneBookRecord(name, phoneNumber, email, address, dateOfBirth);
        phoneBook.add(phoneBookRecord);
    }

    public void deleteRecord(String nameToDelete) {
        boolean isDeleted = false;
        for(int i = 0; i < phoneBook.size(); i++) {
            PhoneBookRecord record = phoneBook.get(i);
            if (record.getName().equalsIgnoreCase(nameToDelete)) {
                phoneBook.remove(record);
                isDeleted = true;
            }
        }
        String message = isDeleted ? "Record deleted: " + nameToDelete : "Name not found: " + nameToDelete;
        System.out.println(message);
    }

    public List<PhoneBookRecord> listRecords() {
        return phoneBook;
    }

    public void saveToFile(List<PhoneBookRecord> phoneBookRecords) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (PhoneBookRecord phoneBookRecord : phoneBookRecords) {
//                String text = phoneBookRecord.getName() + "," + phoneBookRecord.getPhoneNumber();
                String text = String.format("%s,%s,%s,%s,%s",
                        phoneBookRecord.getName(), phoneBookRecord.getPhoneNumber(), phoneBookRecord.getEmail(), phoneBookRecord.getAddress(), phoneBookRecord.getDateOfBirth());
                writer.println(text);
            }
        }
    }
    public List<PhoneBookRecord> loadFromFile() throws IOException {
        List<PhoneBookRecord> result = new ArrayList<>();
       try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
           String line;
           while ((line = reader.readLine()) !=null) {
               String[] parts = line.split(",");
               LocalDate dateOfBirth = LocalDate.parse(parts[4]);
               result.add(new PhoneBookRecord(parts[0], parts[1], parts[2], parts[3], dateOfBirth));
           }
       }
       return result;
    }
    public String showStatistics() {
        int size = phoneBook.size();
        long uniqueName = phoneBook.stream().map(record -> record.getName()).distinct().count();
        long duplicates = size - uniqueName;
        return String.format("Total records: %d%nUnique names: %d%nDuplicates name: %d",
                size, uniqueName, duplicates);
    }


    //******************************************** DZ
    //найти запись по имени
    public PhoneBookRecord search(String name) {
        PhoneBookRecord result = null;
        for(PhoneBookRecord record : phoneBook) {
            String name1 = record.getName();
            if(name.equals(name1)) {
                result = record;
            }
        }
        return result;
    }

    public void edit(String name, String newPhone) {
        PhoneBookRecord record = search(name);
        if (record == null) {
            System.out.println("Record nor found");
        } else {
            record.setPhoneNumber(newPhone);
            System.out.println("Record updated: " + name);
        }


    }

}
