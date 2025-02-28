package hardPracticeTask2;

public class Laptop {
    private String brand;
    private double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public  void setPrice(double price) {
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Hоутбук: " + brand + ", Цена: " + price + " руб.");
    }

    public static void main(String[] args) {
        Laptop notebook = new Laptop("Lenovo", 50000.0);

        notebook.printInfo();
        notebook.setPrice(70000.50);
        notebook.printInfo();
    }
}
