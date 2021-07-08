package carShop;

public class DealershipApp {
    public static void main(String[] args) {
        Customer sean = new Customer("Tom ", "Cruise");
        Car jordy = new Car("Ford","Bronco", "Black diamond",2021);
        System.out.println(sean.describe(String.format("%s ,%s ,%s ,%s ", jordy.getColor(),jordy.getYear(),jordy.getMake(),jordy.getModel())));
    }
}
