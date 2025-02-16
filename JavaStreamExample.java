import java.util.*;
import java.util.stream.Collectors;

class Product{

  int id;

  String name;

  float price;

  public Product(int id, String name, float price) {

    this.id = id;

    this.name = name;

    this.price = price;

  }
  public static float getPrice(Product p){
    return p.price;
  }

}

public class JavaStreamExample {

  public static void main(String[] args) {

    List<Product> productsList = new ArrayList<>();

    //Adding Products

    productsList.add(new Product(1,"HP Laptop",25000f));

    productsList.add(new Product(2,"Dell Laptop",30000f));

    productsList.add(new Product(3,"Lenevo Laptop",28000f));

    productsList.add(new Product(4,"Sony Laptop",28000f));

    productsList.add(new Product(5,"Apple Laptop",90000f));

   // Converting product List into Set

    Set<Float> productPriceList =

      productsList.stream()

      .filter(product->product.price < 30000) // filter product on the base of price

      .map(product->product.price)

      .collect(Collectors.toSet()); // collect it as Set(remove duplicate elements)

    System.out.println(productPriceList);


    Map<Integer,String> productPriceMap =

    productsList.stream().collect(Collectors.toMap(p->p.id, p->p.name));

    System.out.println(productPriceMap);


    List<Float> productPriceLisst =

    productsList.stream()

          .filter(p -> p.price < 30000) // filtering data

          .map(Product::getPrice) // fetching price by referring getPrice method

          .collect(Collectors.toList()); // collecting as list

System.out.println(productPriceLisst);

  }

}







