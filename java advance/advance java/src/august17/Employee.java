package august17;
public class Employee {
 private int id;
 private String name;
 private float  sal;

    public Employee(int id, String name, float sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSal() {
        return sal;
    }

    @Override
    public int hashCode() {
        return id; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;
        return (this.id == emp.id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
