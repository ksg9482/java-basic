package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder2[] orders = new ProductOrder2[3];

        orders[0] = createOrder("투구", 2000, 2);;
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 2000, 2);

        int totalAmount = getTotalAmount(orders);

        printOrder(orders);
        System.out.println(totalAmount);
    }
    static public ProductOrder2 createOrder(String productName, int price, int quantity) {
        ProductOrder2 productOrder = new ProductOrder2();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static public void printOrder(ProductOrder2[] productOrders) {
        for (ProductOrder2 productOrder : productOrders) {
            System.out.println(productOrder.productName + productOrder.price + productOrder.quantity);
        }
    }

    static public int getTotalAmount(ProductOrder2[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder2 productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}
