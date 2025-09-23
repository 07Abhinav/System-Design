package SolidPrinciple;

class BreadBakery {
    public void bakeBread() {
        System.err.println("Baking bread...");
    }
}

class InventoryManager{
    public void manageInventory() {
        System.err.println("Managing inventory...");
    }
}

class SalesManager{
    public void manageSales() {
        System.err.println("Managing sales...");
    }
}

class BakeryCleaner{
    public void cleanBakery() {
        System.err.println("Cleaning bakery...");
    }
}
public class SimpleResponsibility {
    public static void main(String []args){
        BreadBakery breadBakery = new BreadBakery();
        breadBakery.bakeBread();

        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.manageInventory();

        SalesManager salesManager = new SalesManager();
        salesManager.manageSales();

        BakeryCleaner bakeryCleaner = new BakeryCleaner();
        bakeryCleaner.cleanBakery();
    }
}
