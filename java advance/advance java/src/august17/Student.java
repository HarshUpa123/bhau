package august17;
public class Student {
 private int rollno;
 private String name;
 private int clas;

    public Student(int rollno, String name, int clas) {
        this.rollno = rollno;
        this.name = name;
        this.clas = clas;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public int getClas() {
        return clas;
    }

    @Override
    public int hashCode() {
        return rollno; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        Student st = (Student) obj;
        return (this.rollno == st.rollno); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
  
}
