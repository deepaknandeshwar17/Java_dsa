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

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);
    //     int rows = sc.nextInt();
    //     int col = sc.nextInt();

    //     int[][] num = new int[rows][col];

    //     for(int i = 0; i<rows; i++){
    //         for(int j=0; j<col; j++){
    //             num[i][j]=sc.nextInt();
    //         }
    //     }

    //     int n = sc.nextInt();
        
    //     for(int i=0; i<rows; i++){
    //         for(int j=0; j<col; j++){
    //             if(num[i][j] == n){
    //                 System.out.println("The number is found in: "+ i+"  "+j);
    //             }
    //         }
    //     }
    // }


    
    // Bubble Sort

    // public static void printArray(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args){
    //     int arr[] = {9,8,7,6,5,4,3,2,1};
    //     for(int i=0; i<arr.length-1; i++){
    //         for(int j=0; j<arr.length-i-1; j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }

    //     }
    //     printArray(arr);
    // }



    // Selection Sort

    // public static void printArray(int[] arr){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+ " ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String[] args){
    //     int arr[] =  {9,8,7,6,5,4};
    //     for(int i=0; i<arr.length-1; i++){
    //         int s = i;
    //         for(int j=i+1; j<arr.length; j++){
    //             if(arr[s] > arr[j]){
    //                 s = j;
    //             }
    //         }
    //         int temp = arr[s];
    //         arr[s] = arr[i];
    //         arr[i] = temp;
    //     }
    //     printArray(arr);
    // }



    // Insertion Sort

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {9,8,7,6,5,4,3,24,5,6};
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }


    

    

}
