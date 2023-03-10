package HW2;
//5f

public interface SaleableItem {
    public void sellCopy();
}

class Magazine implements SaleableItem {
    public Magazine() {
    }

    public void sellCopy() {
        System.out.println("Magazine sold");
    }
}

class Ticket implements SaleableItem {
    public Ticket() {
    }
    public void sellCopy() {
        System.out.println("Ticket sold");
    }
}
