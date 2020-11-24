package shoppinglist;

/**
 *
 * @author Pálfi Ádám - LRWQPG
 */
public class Test {

    public static void main(String[] args) {

        //Italok
        Bevarege cola = new Bevarege("Coca-Cola", 0, "Cola", 350, StoreSections.Drinks);
        Bevarege milk = new Bevarege("Mizo", 0, "Tej", 240, StoreSections.Drinks);
        Bevarege syrup = new Bevarege("Piroska", 0, "Szörp", 470, StoreSections.Drinks);
        Bevarege palinka = new Bevarege("Ütős", 65, "Pálesz", 12000, StoreSections.Drinks);
        Bevarege vodka = new Bevarege("Chiroc", 33, "Vodka", 19000, StoreSections.Drinks);
        Bevarege whiskey = new Bevarege("Jim-beam", 45, "Whiskey", 7400, StoreSections.Drinks);

        Food barack = new Food(Taste.Sweet, "Barack", 48, StoreSections.Fruits);
        Food kompot = new Food(Taste.Sweet, "kompot", 300, StoreSections.Fruits);
        Food perec = new Food(Taste.Salty, "Perec", 15, StoreSections.BakedGoods);
        Food szalami = new Food(Taste.Salty, "Szalámi", 1500, StoreSections.Meats);
        Food porkolt = new Food(Taste.Salty, "Pörkölt", 940, StoreSections.Meats);
        Food pizza = new Food(Taste.Salty, "Pizza", 2100, StoreSections.BakedGoods);
        Food kenyer = new Food(Taste.Salty, "Kenyér", 189, StoreSections.BakedGoods);
        Food korte = new Food(Taste.Salty, "Körte", 4, StoreSections.Fruits);
        Food banan = new Food(Taste.Sweet, "Banán", 37, StoreSections.Fruits);

        //Elektornikai cikkek
        LastingItem playStation = new LastingItem("Sony", 4, "Playstation", 300000, StoreSections.Electronics);
        LastingItem processzor = new LastingItem("Intel", 5, "i5", 68000, StoreSections.Electronics);
        LastingItem videoKartya = new LastingItem("Nvidia", 4, "Gtx-1080", 270000, StoreSections.Electronics);
        LastingItem hangfal = new LastingItem("Klipsch", 4, "Soundblaster", 140000, StoreSections.Electronics);
        LastingItem laptop = new LastingItem("Dell", 4, "E2545", 470000, StoreSections.Electronics);

        //Boltok
        Store tesco = new Store("Tesco", "Királyszék ut 33");
        Store auchan = new Store("Auchan", "Vasvári Pál u. 1/a");
        Store mediaMarkt = new Store("Média Markt", "Budai út 1");
        Store abc = new Store("ABC", "Új utca 1");

        //Termékek feltöltése
        tesco.addProduct(vodka);
        tesco.addProduct(syrup);
        tesco.addProduct(perec);
        tesco.addProduct(milk);
        tesco.addProduct(playStation);
        tesco.addProduct(korte);
        tesco.addProduct(banan);

        auchan.addProduct(szalami);
        auchan.addProduct(pizza);
        auchan.addProduct(hangfal);
        auchan.addProduct(kompot);

        mediaMarkt.addProduct(processzor);
        mediaMarkt.addProduct(videoKartya);
        mediaMarkt.addProduct(laptop);

        abc.addProduct(cola);
        abc.addProduct(whiskey);
        abc.addProduct(palinka);
        abc.addProduct(barack);
        abc.addProduct(porkolt);
        abc.addProduct(kenyer);

        System.out.println("Bevásáló Lista program!");
        System.out.println("*************************\n");

        System.out.println(tesco.sortByStoreSections());
         System.out.println(tesco.listAlcoholDrinks());

        System.out.println("--------------------");
        System.out.println(auchan.sortByStoreSections());
         System.out.println(auchan.listAlcoholDrinks());

        System.out.println("--------------------");
        System.out.println(mediaMarkt.sortByStoreSections());
         System.out.println(mediaMarkt.listAlcoholDrinks());

        System.out.println("--------------------");
        System.out.println(abc.sortByStoreSections());
        System.out.println(abc.listAlcoholDrinks());

    }
}
