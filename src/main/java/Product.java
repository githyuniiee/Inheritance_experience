public class Product {

    private String name;

    protected int price;

    protected double weight;


   Product(String name, int price, double weight){
       this.name = name;
       this.price = price;
       this.weight = weight;
   }




    public static void main(String[] args) {

        Beauty beauty = new Beauty("lipstick", 10000, 2.3);
        System.out.println("Beauty deliveryCharge: " + beauty.getDeliveryCharge(beauty.weight, beauty.price));

        Grocery grocery = new Grocery("onion", 7000, 3.0);
        System.out.println("Grocery deliveryCharge: " + grocery.getDeliveryCharge(grocery.weight, grocery.price));

        LargeAppliance largeAppliance = new LargeAppliance("TV", 1500000, 7.2);
        System.out.println("LargeAppliance deliveryCharge: " + largeAppliance.getDeliveryCharge(largeAppliance.weight, largeAppliance.price));
    }


}

class Beauty extends Product implements DeliveryChargeCaluculator{

    Beauty(String name, int price, double weight){
        super(name, price, weight);
    }
}

class Grocery extends Product implements DeliveryChargeCaluculator{
    Grocery(String name, int price, double weight){
        super(name, price, weight);
    }
}

class LargeAppliance extends Product implements DeliveryChargeCaluculator{
    LargeAppliance(String name, int price, double weight) {
        super(name, price, weight);
    }
}
