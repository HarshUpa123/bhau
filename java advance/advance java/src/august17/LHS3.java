package august17;

import java.util.LinkedHashSet;

public class LHS3 {
    public static void main(String[] args) {
        LinkedHashSet<Employee> ll = new LinkedHashSet<>();
        ll.add(new Employee(10, "Darshan", 30000f));
        ll.add(new Employee(11, "Pragati", 300000f));
        ll.add(new Employee(12, "Smita", 300000f));
        ll.add(new Employee(13, "Nidhi", 30050f));
        ll.add(new Employee(13, "Nidhi", 30050f));
        for (Employee employee : ll) {
            System.out.println(employee.getId()+" "+employee.getSal()+" "+employee.getName());
        }
    }
    
}
