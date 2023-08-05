package august18;

import java.util.Comparator;

public class SortByPrice implements Comparator<Laptop>{

    @Override
    public int compare(Laptop o1, Laptop o2) {
     int x = o1.getPrice() - o2.getPrice();
//       if(x==0){
//           int y= o1.getId()-o2.getId();
//           if(y==0){
//               return 1;
//           }
//           return y;
//       }
       return x;
    }
     
}
