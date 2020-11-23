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

}
