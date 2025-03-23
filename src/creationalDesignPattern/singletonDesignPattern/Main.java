package creationalDesignPattern.singletonDesignPattern;

public class Main
{
    public static void main(String[] args)
    {
        DBConnection dbConnection = DBConnection.getInstance();

        // Get the only instance of PrinterSpooler
        PrinterSpooler spooler = PrinterSpooler.getInstance();

        // Add print jobs
        spooler.addPrintJob("Document1.pdf");
        spooler.addPrintJob("Document2.pdf");

        // Print all jobs
        spooler.printJobs();

        // Try to create another instance (will return the same instance)
        PrinterSpooler anotherSpooler = PrinterSpooler.getInstance();
        System.out.println("Are both instances the same? " + (spooler == anotherSpooler));
    }
}
