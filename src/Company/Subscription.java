package Company;

public class Subscription extends Product{

    public int numberofMonths;
    protected double revenuePerPeriod;

    public Subscription(String name, double price, double cost, int numberofMonths){
        super(name, price, cost);
        this.numberofMonths = numberofMonths;
//        getRevenuePerPeriod();
        type = "Subscription";
    }

    public int getNumberofMonths(){
        return numberofMonths;
    }

    public void setNumberofMonths(int numberofMonths){
        this.numberofMonths = numberofMonths;
    }

    public double getRevenuePeriod(){
        return numberofMonths * price;
    }
}
