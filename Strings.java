import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Strings {

    // public static void main(String[] args){

        // concatination 
        
        // String firstName = "Cristiano";
        // String lastName = "Ronaldo";
        // String fullName = firstName +" "+ lastName;
        // System.out.println(fullName);

        // Length of string

        // System.out.println(fullName.length());

        // charAt
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }


        // Compare

        // String a = "Thor";
        // String b = "Thors";

        // if (a.compareTo(b) == 0){
        //     System.out.println("Both strings are equal");
        // } else {
        //     System.out.println("Both String are not equal");
        // }

        // substring

        // String sentence = "Odinson";
        // String name = sentence.substring(4);
        // System.out.println(name);
    // }

    // StringBuilder
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("TonyStark");
        System.out.println(sb);

        // char at index
        System.out.println(sb.charAt(0));

        // set char at
        sb.setCharAt(0,'p');
        System.out.println(sb);

        // inserting an item
        sb.insert(3,'s');
        System.out.println(sb);

        // delete an item
        sb.delete(3, 4);
        System.out.println(sb);

    }
    
}
