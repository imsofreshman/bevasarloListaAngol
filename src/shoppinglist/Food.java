package shoppinglist;

/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public class Food extends Product {

    private Taste taste;

    public Food(Taste taste, String name, int price, StoreSections storeSection) {
        super(name, price, storeSection);
        this.taste = taste;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

}
