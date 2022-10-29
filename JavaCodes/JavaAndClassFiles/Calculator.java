import java.util.Scanner;

public class Calculator{


public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       String [] arr = {"0_For_Addition","1_For_Subtraction","2_For_Multiplication","3_For_Division"};
       System.out.println("hii");

       System.out.println("Please Enter First Numbers");
       int FirstUserInputNumber = input.nextInt();
       
       System.out.println("Please Enter Arithmetic operation Number");
       for(int i =0;i<4;i++){
       System.out.println(arr[i]);
       }
       int arithmeticOperationInput = input.nextInt();
       
        
       System.out.println("Please Enter Secound Numbers");
       int SecoundUserInputNumber = input.nextInt();


       switch(arithmeticOperationInput){
                             

                             case 0 : System.out.println(FirstUserInputNumber + SecoundUserInputNumber); break;
                             case 1 : System.out.println(FirstUserInputNumber - SecoundUserInputNumber); break;
                             case 2 : System.out.println(FirstUserInputNumber * SecoundUserInputNumber); break;
                             case 3 : if(SecoundUserInputNumber == 0){
                                              
                                       System.out.println(" Wrong Option Please Choose Again ! ");
                             	      }

                                      else{
                                       
                                       System.out.println(FirstUserInputNumber / SecoundUserInputNumber);
                             
                                      } break;


                             default : System.out.println(" Wrong Option Please Choose Again ! ");





       }


     
   
    }       


       
} 




