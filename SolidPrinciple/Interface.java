package SolidPrinciple;

interface Printer {
    void print();
}
interface Scanner {
    void scan();
}
interface Fax {
    void fax();
}

class BasicPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing document... in bascic printer" );
    }
}

class AllComponentPrinter implements Printer, Scanner, Fax {
    @Override
    public void print() {
        System.out.println("Printing document... in all-in-one printer");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document... in all-in-one printer");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document... in all-in-one printer");
    }
}
public class Interface {
    public static void main(String[] args) {
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print();

        AllComponentPrinter allInOne = new AllComponentPrinter();
        allInOne.print();
        allInOne.scan();
        allInOne.fax();
    }
}
