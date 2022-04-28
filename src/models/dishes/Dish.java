package models.dishes;

public class Dish {

    public String name;
    public double originalPrice;
    public double discount;
    public double currentPrice;

    public Dish(String name, double originalPrice, double discount) {
        this.name = name;
        this.originalPrice = originalPrice;
        this.discount = discount;
    }

    public void calculatePrice() {
        this.currentPrice = this.originalPrice - ((this.originalPrice/100) * this.discount);
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();
        calculatePrice();
        if(discount == 0) {
            text.append(name).append(" Price: ").append(originalPrice);
        } else {
            text.append(name).append(" Price: ").append(originalPrice).append( " Discount: ").append(discount).append( "%").append(" Discounted Price: ").append(currentPrice);
        }
        return text.toString();
    }
}
