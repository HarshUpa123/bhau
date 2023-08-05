package august18;
public class Laptop {
    private int id;
    private String brand;
    private int price;

    public Laptop(int id, String brand, int price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
    
}   
