import java.util.Scanner;

//abstraction

abstract class LibraryService{
    abstract void issueBook(String bookTitle);
    abstract void returnBook(String bookTitle);
}

//inheritance + encapsulation

class User {
    private String name;
    private int userId;

    public User(String name, int userId){
        this.name = name;
        this.userId = userId;
    }

    public String getName(){
        return name;
    }

    public int getUserId(){
        return userId;
    }
}

//student ( polymorphism - overriding)
class StudentMember extends User{
    public StudentMember(String name, int userId){
        super (name, userId);
    }

    public double calculateFine(int daysLate){
        return daysLate * 2.0;
    }
}

// Faculty (Polymorphism - Overriding)
class FacultyMember extends User {

    public FacultyMember(String name, int userId) {
        super(name, userId);
    }

    public double calculateFine(int daysLate) {
        return daysLate * 1.0;
    }
}

// Main Library Class
class Library extends LibraryService {

    private String[] books = {
        "Psychology of Money",
        "Atomic Habit",
        " The Alchimsit",
        "Rich Dad Poor Dad",
    };

    // Method Overloading
    public void searchBook(String title) {
        System.out.println("Searching by Title: " + title);
    }

    public void searchBook(String title, String author) {
        System.out.println("Searching by Title + Author: "
                + title + ", " + author);
    }

    public void searchBook(int isbn) {
        System.out.println("Searching by ISBN: " + isbn);
    }

    // Abstraction implementation
    @Override
    void issueBook(String bookTitle) {
        System.out.println("Book issued: " + bookTitle);
    }

    @Override
    void returnBook(String bookTitle) {
        System.out.println("Book returned: " + bookTitle);
    }

    public void showBooks() {
        System.out.println("\nAvailable Books:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }
}

// Main Class (WITH USER INPUT)
public class SmartLibrary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // Show books
        library.showBooks();

        // User input for issuing book
        System.out.print("\nEnter book name to issue: ");
        String issueBook = sc.nextLine();
        library.issueBook(issueBook);

        // User input for returning book
        System.out.print("\nEnter book name to return: ");
        String returnBook = sc.nextLine();
        library.returnBook(returnBook);

        // Search examples (overloading)
        System.out.print("\nEnter book title to search: ");
        String title = sc.nextLine();
        library.searchBook(title);

        System.out.print("Enter author name: ");
        String author = sc.nextLine();
        library.searchBook(title, author);

        System.out.print("Enter ISBN number: ");
        int isbn = sc.nextInt();
        library.searchBook(isbn);

        sc.nextLine(); // clear buffer

        // User creation
        System.out.print("\nEnter Student name: ");
        String sName = sc.nextLine();

        System.out.print("Enter Student ID: ");
        int sId = sc.nextInt();

        StudentMember student = new StudentMember(sName, sId);

        System.out.print("Enter days late for student: ");
        int sDays = sc.nextInt();

        System.out.println("Student Fine: "
                + student.calculateFine(sDays));

        sc.nextLine(); // clear buffer

        System.out.print("\nEnter Faculty name: ");
        String fName = sc.nextLine();

        System.out.print("Enter Faculty ID: ");
        int fId = sc.nextInt();

        FacultyMember faculty = new FacultyMember(fName, fId);

        System.out.print("Enter days late for faculty: ");
        int fDays = sc.nextInt();

        System.out.println("Faculty Fine: "
                + faculty.calculateFine(fDays));

        sc.close();
    }
}