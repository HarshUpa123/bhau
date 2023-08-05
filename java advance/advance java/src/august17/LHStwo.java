package august17;

import java.util.LinkedHashSet;

public class LHStwo {
    public static void main(String[] args) {
        LinkedHashSet<Student> lhs= new LinkedHashSet<>();
        lhs.add(new Student(14, "darshan", 9));
        lhs.add(new Student(13, "bipin", 9));
        lhs.add(new Student(31, "yash", 9));
        lhs.add(new Student(17, "prsagati", 9));
        lhs.add(new Student(19, "smita", 9));
        lhs.add(new Student(16, "nidhi", 9));
        lhs.add(new Student(31, "nidhi", 9));
        for (Student lh : lhs) {
            System.out.println(lh.getRollno()+" "+lh.getName()+" "+lh.getClas());
        }
    }
    
}
