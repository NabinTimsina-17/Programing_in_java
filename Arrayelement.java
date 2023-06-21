import java.util.Scanner;
public class Arrayelement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
    System.out.println("Enter 10 elements:");
    for(int i =0; i<10; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the index of the element to be deleted");
    int index = sc.nextInt();
    for (int i = index; i < arr.length-1 ; i++ ){
        arr[i] = arr[i+1];

    }
    System.out.println("Array after deleting the element:");
    for (int i= 0; i<arr.length-1 ; i++){
      System.out.println(arr[i]+" ");
    }
  }
}
