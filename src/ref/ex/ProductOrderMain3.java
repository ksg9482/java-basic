package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int inputNum = scanner.nextInt();
        scanner.nextLine();

        ProductOrder2[] orders = new ProductOrder2[inputNum];

        for (int i = 0; i < inputNum; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            System.out.print("개수: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);;
        }

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
            System.out.println("상품명: " + productOrder.productName + " 가격: " + productOrder.price + " 수량: "+productOrder.quantity);
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
