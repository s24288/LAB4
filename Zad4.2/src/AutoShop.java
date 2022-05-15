public class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(200, 20000, "black", 10);
        Ford ford1 = new Ford(220, 4452, "blue", 2022, 10);
        Ford ford2 = new Ford(250, 5000, "white", 2021, 5);
        Truck truck = new Truck(100, 500000, "silver", 5000);

        System.out.println(sedan.getPurchaseInfo() + " " + sedan.getSalePrice());
        System.out.println(ford1.getPurchaseInfo() + " " + ford1.getSalePrice());
        System.out.println(ford2.getPurchaseInfo() + " " + ford2.getSalePrice());
        System.out.println(truck.getPurchaseInfo() + " " + truck.getSalePrice());



    }
}
