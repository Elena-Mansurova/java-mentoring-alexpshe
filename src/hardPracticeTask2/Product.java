package hardPracticeTask2;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return  price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applyDiscount(double discount) {
        return price -= discount;
    }

    public void printInfo() {
        System.out.println("Товар: " + getName() + ", Цена: " + getPrice()  + " руб.");
    }

    public static void main(String[] args) {
        Product bread = new Product("Хлеб", 45.0);

        bread.printInfo();
        bread.setPrice(50.0);
        bread.applyDiscount(40.0);
        bread.printInfo();
    }
}
