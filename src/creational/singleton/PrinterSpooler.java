package creational.singleton;

public class PrinterSpooler
{
    // Private static instance of the class
    private static PrinterSpooler instance;

    // Private constructor to prevent instantiation from outside
    private PrinterSpooler()
    {
        System.out.println("Printer Spooler initialized.");
    }

    // Public static method to get the single instance of the class
    public static PrinterSpooler getInstance()
    {
        if (instance == null)
        {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    // Method to add a print job
    public void addPrintJob(String document)
    {
        System.out.println("Added print job: " + document);
    }

    // Method to print all jobs
    public void printJobs()
    {
        System.out.println("Printing all jobs...");
    }
}