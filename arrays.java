import java.util.Scanner;

public class arrays {

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int [] numbers = new int[size];

    //     for (int i = 0; i<size; i++){
    //         numbers[i] = sc.nextInt();
    //     }

    //     for(int i=0; i<size; i++){
    //         System.out.print(numbers[i]+ " ");
    //     }
    // }


    
    // 2D Array
    
    
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int rows = sc.nextInt();
    //     int col = sc.nextInt();

    //     int[][] numbers = new int[rows][col];
    //     for(int i=0; i<rows; i++){
    //         for(int j=0; j<col; j++){
    //             numbers[i][j] = sc.nextInt();
    //         }
    //     } 

    //     for(int i=0; i<rows; i++){
    //         for(int j=0; j<col; j++){
    //             System.out.print(numbers[i][j]+ " ");
    //         }
    //         System.out.println();
    //     }
    // }
    

     
    // 2D Array to find the element

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        int[][] num = new int[rows][col];

        for(int i = 0; i<rows; i++){
            for(int j=0; j<col; j++){
                num[i][j]=sc.nextInt();
            }
        }

        int n = sc.nextInt();
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                if(num[i][j] == n){
                    System.out.println("The number is found in: "+ i+"  "+j);
                }
            }
        }
    }

    

}
