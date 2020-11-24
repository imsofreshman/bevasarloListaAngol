package shoppinglist;

/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public class Product {

    private String name;
    private int price;
    private StoreSections storeSection;

    public Product(String name, int price, StoreSections storeSection) {
        this.name = name;
        this.price = price;
        this.storeSection = storeSection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public StoreSections getStoreSection() {
        return storeSection;
    }

    public void setStoreSection(StoreSections storeSection) {
        this.storeSection = storeSection;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A termék neve: " + getName());
        sb.append(" ára: " + getPrice() + " FT");
        return sb.toString();
    }

    
}
