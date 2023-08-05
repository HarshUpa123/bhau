package august18;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetone {
    public static void main(String[] args) {
        TreeSet<Laptop> ss = new TreeSet<Laptop>(new SortByPrice());
    ss.add(new Laptop(11, "Lenovo", 41999));
    ss.add(new Laptop(10, "Dell", 41111));
    ss.add(new Laptop(17, "Hp", 47777));
    ss.add(new Laptop(7, "Mi", 36666));
    ss.add(new Laptop(12, "Mac", 41999));
        for (Laptop s : ss) {
            System.out.println(s.getBrand()+" "+s.getId()+" "+s.getPrice());
        }
    
 }
}
/*
create table dp(id int primary key auto_increment ,name varchar(20),age int);
insert into dp (name,age)values("darshan",22),("gaurang",32),("kunal",24),
("sumit",25),("chaitanya",24);
select*from dp;
select min(age) from dp;
select id,name,age from dp 
where age=(select min(age) from dp);
insert into dp (name,age)values("rinku",17),("poonam",36),("sumna",23),("moti",22);
select * from dp;
select id,name,age from dp where age =(select max(age) from dp);
select id,name,age from dp 
where age > (select min(age) from dp
where age <(select max(age) from dp
where age !=(select max(age)from dp)));
select count(id) from dp;
select avg(age) from dp;
select avg(age) from dp where age != (select max(age) from dp);
select sum(id) from dp;
select sum(age) from dp where age > (select min(age) from dp);
select id,name,age from dp where age = (select max(age) from dp where age != 
(select max(age)from dp));
select count(age) from dp where age < (select avg(age)from dp);
select id,name,age from dp order by age desc;

*/