// find the largest no 
 import java.util.Scanner;
    public class program6
     {
        public static void main(String[]args){
            int a,b,large;
            System.out.println("Enter two numbers");
            try (Scanner sc = new Scanner(System.in)) {
                a = sc.nextInt();
                b= sc.nextInt();
            }
            large=(a>b)?a:b;
            System.out.println("The largest value is" + large);
    
        }
    }
    
