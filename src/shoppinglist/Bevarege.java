package shoppinglist;

/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public class Bevarege extends Product {

    private String brand;
    private float percentOfAlcohol;

    public Bevarege(String brand, float percentOfAlcohol, String name, int price, StoreSections storeSection) {
        super(name, price, storeSection);
        this.brand = brand;
        this.percentOfAlcohol = percentOfAlcohol;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPercentOfAlcohol() {
        return percentOfAlcohol;
    }

    public void setPercentOfAlcohol(float percentOfAlcohol) {
        this.percentOfAlcohol = percentOfAlcohol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A termék neve: " + getName());
        sb.append(", a termék márkája: " + getBrand());
        sb.append(", a termék alkohol tartalma: " + getPercentOfAlcohol() + "%");
        sb.append(", ára: " + getPrice() + " FT \n");
        return sb.toString();
    }

}
