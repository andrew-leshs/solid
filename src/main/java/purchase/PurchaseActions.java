package purchase;

import java.util.Map;

public class PurchaseActions {

    private Purchase purchase;

    public PurchaseActions(Purchase purchase) {
        this.purchase = purchase;
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchase.purchases.length; i++) {
            if (purchase.purchases[i] == null) {
                purchase.purchases[i] = new Purchase(title, count);
                break;
            } else if (purchase.purchases[i].title.equals(title)) {
                purchase.purchases[i].count += count;
                break;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchase.purchases.length; i++) {
            Purchase purchase1 = purchase.purchases[i];
            if (purchase1 == null) continue;
            System.out.println("\t" + purchase1.title + " " + purchase1.count + " шт. в сумме " + (purchase1.count * prices.get(purchase1.title)) + " руб.");
            sum += (long) purchase1.count * prices.get(purchase1.title);
        }
        return sum;
    }
}
