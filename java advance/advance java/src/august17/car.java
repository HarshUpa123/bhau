package august17;
public class car {
  private int carno;
  private String name;
  private double model;

    public car(int carno, String name, double model) {
        this.carno = carno;
        this.name = name;
        this.model = model;
    }

    public int getCarno() {
        return carno;
    }

    public String getName() {
        return name;
    }

    public double getModel() {
        return model;
    }

    @Override
    public int hashCode() {
     return carno; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        car c = (car) obj;
        return (this.carno == c.carno && this.name == c.name); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
          
}