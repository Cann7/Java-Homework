package August14ThHomework;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoeCobj {
    public static void main(String[] args) {
      Shoes shoes1=new Shoes();
      shoes1.SetInfo("Jordan",7.0,"Air Jordan",120.00);
      Shoes shoes2=new Shoes();
      shoes2.SetInfo("Vans",9.0,"Old Scholl",83.08);
      Shoes shoes3=new Shoes();
      shoes3.SetInfo("Puma",6.5,"Sneaker",85.29);
      Shoes shoes4=new Shoes();
      shoes4.SetInfo("Under Armor",7.5,"Running",42.00);

      ArrayList<Shoes>ArrList=new ArrayList<>();
      ArrList.addAll(Arrays.asList(shoes1,shoes2,shoes3,shoes4));

        for (int i = 0; i < ArrList.size(); i++) {
            if (ArrList.get(i).Price>10.00){
                System.out.println("Which shoes are > 10.00  "+ArrList.get(i).Print());
            }if (ArrList.get(i).Price>=50) {
                ArrList.get(i).Price=ArrList.get(i).Price*0.85;
                System.out.println("after price reduction : "+ ArrList.get(i).Brand+ " ; \n"+ ArrList.get(i).Price+"\n");
            }

        }
    }
}
