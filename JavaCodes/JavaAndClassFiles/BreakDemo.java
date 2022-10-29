import java.util.Scanner;
public class BreakDemo{
	public static void main(String[] args) {
       
       int[] arr= {8,7,5,3,9,2,0};
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the Element to be searched");
       int target = input.nextInt();
       
       for(int i=0;i<7;i++){


               if(arr[i] == target){

               System.out.println("Element Found !");


               }


       }





	}






}