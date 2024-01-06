package access.ex;

public class ShoppingCart {
    private int max = 10;

    private Item[] items = new Item[max];
    private int count;

    void addItem(Item item) {
        if (count >= items.length) {
            System.out.println("장바구니가 가득 찼습니다");
        }
        items[count] = item;
        count++;
    }

    void displayItem() {
        System.out.println("장바구니 상품 출력");
        //배열만큼 다 돌면 안된다. 배열 길이는 10이지만, 내용이 있는건 그보다 적음. 나머지는 null. iterate로 돌면 길이만큼 돌기 때문에 nullPointerException
        for (int i = 0; i < count; i++) {
            System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].getTotal());
        }
        System.out.println("전체 가격 합:" + calculTotalPrice());
    }

    private int calculTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            totalPrice += item.getTotal();
        }
        return totalPrice;
    }
}
