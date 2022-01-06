package hello.core.singleton;

import org.junit.jupiter.api.Test;

public class StatefulService {
    private int price; // 10000 -> 20000

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
