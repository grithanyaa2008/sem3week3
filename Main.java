class IdCard {
    String name;
    int booksIssued;

    public IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
// Class definition for PlacementRecord
class PlacementRecord {
    // Fields
    String studentName;
    String company;
    double packageLpa;

    // Constructor to initialize all three fields
    public PlacementRecord(String studentName, String company, double packageLpa) {
        this.studentName = studentName;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    // Instance method to print formatted record
    public void printRecord() {
        System.out.println(studentName + " -> " + company + " @ " + packageLpa + " LPA");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create one IdCard object for Ravi
        IdCard ravi = new IdCard("Ravi", 0);

        // Assign a second variable to point at the same object (reference copy)
        IdCard duplicate = ravi;

        // Through the second variable, change booksIssued
        duplicate.booksIssued = 3;

        // Create a third, separate IdCard object with identical field values
        IdCard separate = new IdCard("Ravi", 3);

        // Print output as specified
        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));
        System.out.println("separate == ravi: " + (separate == ravi));
        // Create an array of PlacementRecord objects
        PlacementRecord[] records = new PlacementRecord[3];

        // Instantiate PlacementRecord objects for different students
        records[0] = new PlacementRecord("Ravi", "TCS", 4.5);
        records[1] = new PlacementRecord("Anitha", "Zoho", 6.2);
        records[2] = new PlacementRecord("Karthik", "Infosys", 4.0);

        // Print each object in a loop
        for (PlacementRecord record : records) {
            record.printRecord();
        }
    }
}