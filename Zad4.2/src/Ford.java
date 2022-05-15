public class Ford extends Car implements Purchase{
    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        double x = super.getSalePrice() - this.manufacturerDiscount;
        return x;
    }

    @Override
    public String getPurchaseInfo() {
        return "FORD";
    }
}
