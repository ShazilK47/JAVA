import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       byte number;
        System.out.print("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextByte();


       if(number%5 == 0 && number%3 == 0){
           System.out.println("FizzBuzz");
       }else if(number%5 == 0){
           System.out.println("Fizz");
       }else if(number%3 == 0){
           System.out.println("Buzz");
       }else{
           System.out.println(number);
       }



    }
}
