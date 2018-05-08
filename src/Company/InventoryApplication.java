package Company;

import util.Input;

public class InventoryApplication {

    static Product [] products = new Product[6];
    static Input input = new Input();


    public static void main(String[] args) {
        System.out.println("Welcome to the store!");
        System.out.println("Add four new products");


        products[0] = new Product("tootbrush", 3, 3);
        products[1] = new Car ( "Elvis", 100000, 1000, "Elvismobile", "Sport");
        products[2] = new Shoe("Chucks", 30, 5, 8, "Hightop");
        products[3] = new Subscription("Economist", 5, 1, 12);
        products [4]= new Product("banana phone", 20, 5 );


        System.out.println("What kind of product do you wan to ad to the invoery");
        System.out.println("Car, shoe, Subscription, or Other");
        Input input = new Input();
        String userChoice = input.getString();

        Product userProduct;

        if (userChoice.equalsIgnoreCase("car")){
            userProduct = new Car("Betty", 30000, 1000, "Buick", "Skylark");
        } else if (userChoice.equalsIgnoreCase("shoe")) {
            userProduct = new Shoe("Bootsy", 200, 50, 7, "CombatBoot");
        }else if (userChoice.equalsIgnoreCase("subscription")){
            userProduct = new Subscription ("Computer", 50, 3, 12);
        } else {
            userProduct = makeUserProduct();
        }

        products[5] = userProduct;
        showProducts (products);
    }

    public static void showProducts(Product[] products){
        for(Product product: products){
            System.out.println("Product is: " + product.getName());
            System.out.println("Company profit is: " + product.getProfit());
        }
    }

    protected static Product makeUserProduct(){
        System.out.println("input the product name");
        String name = input.getString();

        System.out.println("Input the product's price?");
        double price = input.getDouble();

        System.out.println("What is the product's cost of production?");
        double cost = input.getDouble();

        return new Product (name, price, cost);

    }
}
