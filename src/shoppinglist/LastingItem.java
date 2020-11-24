package shoppinglist;

/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public class LastingItem extends Product {

    private String manufacturer;
    private int warranteeTimeInYears;

    public LastingItem(String manufacturer, int warranteeTimeInYears, String name, int price, StoreSections storeSection) {
        super(name, price, storeSection);
        this.manufacturer = manufacturer;
        this.warranteeTimeInYears = warranteeTimeInYears;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getWarranteeTimeInYears() {
        return warranteeTimeInYears;
    }

    public void setWarranteeTimeInYears(int warranteeTimeInYears) {
        this.warranteeTimeInYears = warranteeTimeInYears;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A termék neve: " + getName());
        sb.append(", a termék gyártója: " + getManufacturer());
        sb.append(", a termék garanciája: " + getWarranteeTimeInYears() + " év");
        sb.append(", ára: " + getPrice() + " FT \n");
        return sb.toString();
    }

}
