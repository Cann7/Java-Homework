package August14ThHomework;

public class Shoes {
//    Write a Class and Name it Shoes that has following attributes
//1) Brand
//2) Size
//3) Type
//4) Price
//    Also has following Methods
//1) SetInfo(): Where it Takes String brand, double size, String Type and double price to Set the attributes
//2) Print(): Where it prints the the value of attributes.
//
//    Create 4 different Object (Class Instance) of Shoes Class. and add it to array-list.
//    Print all of the Shoe instances that has price over 10,
//    Apply discount for those 15% off on the ones that has Price of 50 or over

    String Brand;
    double Size;
    String Type;
    double Price;

    public void SetInfo(String brand,double size,String type,double price){
        Brand=brand;
        Size=size;
        Type=type;
        Price=price;

    }
  public String Print(){
      String List =" [Brand]:"+Brand + "   [size] :"+Size +"   [Type]:" + Type + "   [Price]: " + Price;
      return List;
    }


}
