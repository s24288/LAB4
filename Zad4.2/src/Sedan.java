public class Sedan extends Car implements Purchase{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }
    @Override
    public double getSalePrice() {
        if (this.length > 20) {
            return super.getSalePrice() - (0.05 * super.getSalePrice());
        }
        else {
            return super.getSalePrice() - (0.10 * super.getSalePrice());
        }
    }

    @Override
    public String getPurchaseInfo() {
        return "SEDAN";
    }
}
