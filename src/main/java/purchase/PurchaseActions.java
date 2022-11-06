package purchase;

import java.util.Map;

public class PurchaseActions {

    private Purchase purchase;

    private final int PRODUCTS_SIZE = 4;
    protected Purchase[] purchases = new Purchase[PRODUCTS_SIZE];

    public PurchaseActions(Purchase purchase) {
        this.purchase = purchase;
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                break;
            } else if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                break;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            Purchase purchase1 = purchases[i];
            if (purchase1 == null) continue;
            System.out.println("\t" + purchase1.title + " " + purchase1.count + " шт. в сумме " + (purchase1.count * prices.get(purchase1.title)) + " руб.");
            sum += (long) purchase1.count * prices.get(purchase1.title);
        }
        return sum;
    }
}
