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

    int sumOfProductPrices(List<Product> productList) {    //az összegzett árat lehet vele lekérdezni
        int price = 0;
        for (Product product : productList) {
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

    String sortByStoreSections() { // string bejárás()
        StringBuilder sb = new StringBuilder();

        List<Product> electronics = listByStoreSections(StoreSections.Electronics);
        List<Product> meats = listByStoreSections(StoreSections.Meats);
        List<Product> drinks = listByStoreSections(StoreSections.Drinks);
        List<Product> bakedGoods = listByStoreSections(StoreSections.BakedGoods);
        List<Product> fruits = listByStoreSections(StoreSections.Fruits);

        sb.append("A " + getName());
        sb.append(" áruházban lévő termékek rendezetten \n");

        if (!electronics.isEmpty()) {
            Collections.sort(electronics,
                    (product1, product2) -> product1.getName().compareTo(product2.getName()));
            sb.append("Elektronikai cikkek:\n");
            for (Product product : electronics) {
                sb.append(product);

            }
            sb.append("Az elektronikai termékek össz. ára: ");
            sb.append(sumOfProductPrices(electronics) + "Ft\n");
        }
        if (!meats.isEmpty()) {
            Collections.sort(meats,
                    (product1, product2) -> product1.getName().compareTo(product2.getName()));
            sb.append("Húsok:\n");
            for (Product product : meats) {
                sb.append(product);

            }
            sb.append("A húsok össz. ára: ");
            sb.append(sumOfProductPrices(meats) + "Ft\n");
        }
        if (!drinks.isEmpty()) {
            Collections.sort(drinks,
                    (product1, product2) -> product1.getName().compareTo(product2.getName()));
            sb.append("Italok:\n");
            for (Product product : drinks) {
                sb.append(product);

            }
            sb.append("Az italok össz. ára: ");
            sb.append(sumOfProductPrices(drinks) + "Ft\n");
        }
        if (!bakedGoods.isEmpty()) {
            Collections.sort(bakedGoods,
                    (product1, product2) -> product1.getName().compareTo(product2.getName()));
            sb.append("Pékáruk:\n");
            for (Product product : bakedGoods) {
                sb.append(product);

            }
            sb.append("A pékárúk össz. ára: ");
            sb.append(sumOfProductPrices(bakedGoods) + "Ft\n");
        }
        if (!fruits.isEmpty()) {
            Collections.sort(fruits,
                    (product1, product2) -> product1.getName().compareTo(product2.getName()));
            sb.append("Gyümölcsök:\n");
            for (Product product : fruits) {
                sb.append(product);

            }
            sb.append("A gyümölcsök össz. ára: ");
            sb.append(sumOfProductPrices(fruits) + "Ft\n");
        }

        return sb.toString();

    }

    List<Product> defaultSearch(String what) { //általánoskeresés

        List searchedProducts = new ArrayList<Product>();

        for (Product product : listOfProducts) {
            if (product.getName().substring(0).toString() == what) {
                searchedProducts.add(product);
            } else {
                System.out.println("Nem szerepel a listán");
            }
        }
        return searchedProducts;
    }

    String listAlcoholDrinks() {//Listázza az alkohol tartalmú italokat
        StringBuilder sb = new StringBuilder();
        List<Bevarege> listOfAlcoholProducts = new ArrayList();
        listOfAlcoholProducts = listByStoreSections(StoreSections.Drinks);

        sb.append("Alkohol tartalmu italok a " + getName() + " áruházban:\n");
        for (Bevarege bevarage : listOfAlcoholProducts) {
            if (bevarage.getPercentOfAlcohol() > 0) {
                sb.append(bevarage);
            }
        }
        if (listOfAlcoholProducts.isEmpty()) {
            sb.replace(0, sb.length(), "Nincsenek alkholos italok!\n");
        }
        return sb.toString();

    }

    @Override
    public String toString() { //kiirja a boltban tárolt összes vásárolni kivánt terméket
        StringBuilder sb = new StringBuilder();
        sb.append("A " + getName() + " áruhzában lévő összes termék\n");
        for (Product product : listOfProducts) {
            sb.append(product.toString());

        }
        return sb.toString();
    }

}
