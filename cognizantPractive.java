import java.util.*;

public class cognizantPractive {

    static HashMap<String,Integer> map = new HashMap<>();

    // TO add values to the given map
    public static void addToMap(String productName, Integer productCost){
        map.put(productName, productCost);
    }


    // if they ask to return the sum
    public static int totalSumInRange(int min, int max){
        int sum =0;
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue() >= min && entry.getValue() <= max){
                sum+=entry.getValue();
            }
        }
        return sum;
    }

    public static List<String> productsInRange(int min, int max){
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue() >= min && entry.getValue() <=max){
                list.add(entry.getKey());
            }
        }
        return list;
    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number of product to purchase");
        int noOfProducts = sc.nextInt();
        System.out.println("Enter the product name and cost");

        for(int i=0; i<noOfProducts; i++){
            String name = sc.next();
            int cost = sc.nextInt();
            addToMap(name, cost);
        }

        System.out.println("Enter the minimum value");
        int min = sc.nextInt();
        System.out.println("Enter the maximum value");
        int max = sc.nextInt();
        System.out.println("Product in the given range are: ");

        for(String p: productsInRange(min,max)){
            System.out.print(p+" ");
        }

        System.out.println();

        System.out.println("The sum of the prices of the given range are :"+totalSumInRange(min, max));

    }
  
    




}
