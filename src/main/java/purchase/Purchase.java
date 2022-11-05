package purchase;

import main.Main;

import java.util.Map;

public class Purchase {
    protected String title;
    protected int count;
    private final int PRODUCTS_SIZE = 4;
    protected Purchase[] purchases = new Purchase[PRODUCTS_SIZE];

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }


}
