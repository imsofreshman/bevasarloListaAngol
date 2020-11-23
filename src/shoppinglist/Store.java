package shoppinglist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author adam.palfi - LRWQPG
 */
public class Store {

    private String name;
    private String place;
    private List<Product> listOfProducts = new ArrayList<Product>(); //milyen termékeket akarunk megvenni

    public Store(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    void addProduct(Product product) { //termék hozzáadása a listánkhoz
        listOfProducts.add(product);
    }

    void removeProduct(Product product) { //termék eltávolítása a listánkról
        listOfProducts.remove(product);
    }

    int sumOfProductPrices() {    //az összegzett árat lehet vele lekérdezni
        int price = 0;
        for (Product product : listOfProducts) {
            price += product.getPrice();
        }
        return price;
    }

    List listByStoreSections(StoreSections storeSection) { //listázza egy adott egységhez tartozó termékeket pl Húsok

        List<Product> listByStoreSection = new ArrayList<Product>();

        for (Product product : listOfProducts) {
            if (product.getStoreSection() == storeSection) {
                listByStoreSection.add(product);
            }

        }
        return listByStoreSection;
    }

    String sortByStoreSections() { // string bejárás
        StringBuilder sb = new StringBuilder();

        List<Product> electronics = listByStoreSections(StoreSections.Electronics);
        List<Product> meats = listByStoreSections(StoreSections.Meats);
        List<Product> drinks = listByStoreSections(StoreSections.Drinks);
        List<Product> bakedGoods = listByStoreSections(StoreSections.BakedGoods);
        List<Product> fruits = listByStoreSections(StoreSections.Fruits);

        sb.append("A " + getName());
        sb.append(" áruházban lévő \n");

        if (!electronics.isEmpty()) {
            Collections.sort(electronics,
                    (o1, o2) -> o1.getName().compareTo(o2.getName()));
            sb.append("Elektronikai cikkek:\n");
            for (Product product : electronics) {
                sb.append(product);
            }
        }
        if (!meats.isEmpty()) {
            Collections.sort(meats,
                    (o1, o2) -> o1.getName().compareTo(o2.getName()));
            sb.append("Húsok:\n");
            for (Product product : meats) {
                sb.append(product);
            }
        }
        if (!drinks.isEmpty()) {
            Collections.sort(drinks,
                    (o1, o2) -> o1.getName().compareTo(o2.getName()));
            sb.append("Italok:\n");
            for (Product product : drinks) {
                sb.append(product);
            }
        }
        if (!bakedGoods.isEmpty()) {
            Collections.sort(bakedGoods,
                    (o1, o2) -> o1.getName().compareTo(o2.getName()));
            sb.append("Pékáruk:\n");
            for (Product product : bakedGoods) {
                sb.append(product);
            }
        }
        if (!fruits.isEmpty()) {
            Collections.sort(fruits,
                    (o1, o2) -> o1.getName().compareTo(o2.getName()));
            sb.append("Gyümölcsök:\n");
            for (Product product : fruits) {
                sb.append(product);
            }
        }

        return sb.toString();

    }

    List<Product> defaultSearch(String what) { //általánoskeresés

        List searchedProducts = new ArrayList<Product>();

        for (Product product : listOfProducts) {
            if (product.getName().substring(0).toString() == what) {
                searchedProducts.add(product);
            }
        }
        return searchedProducts;
    }

    @Override
    public String toString() { //kiirja a boltban tárolt összes vásárolni kivánt terméket
        String results = "";
        for (Product product : listOfProducts) {
            results += product.toString() + "\n";
        }
        return results;
    }

}
