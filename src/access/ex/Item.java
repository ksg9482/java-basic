package access.ex;

public class Item {
    private String name;
    private int price = 0;
    private int quantity = 0;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    String getName() {
        return name;
    }
    int getTotal() {
        return price * quantity;
    }
}
