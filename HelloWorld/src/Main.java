import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main{
        public static void main(String[] args){
//# primitive types in java
            System.out.println("\n\t*** Primitive DataTypes ***");
            byte age = 30;
            long viewsCount = 3_123_456_789L; //we use "L" at the end to make it long value.
            float price = 10.99F; //we use "F" at the end to make it float value
            char letter = 'A';
            boolean isEligible = false;
            System.out.println(age);

//# Reference Datatype  for storing complex objects
            System.out.println("\n\t*** Reference DataTypes ***");
        // when dealing with it is necessary to allocate memory by using "new" operator
        Date now = new Date();
            System.out.println(now);

        //difference of memory management.
            byte x = 1;
            byte y = 2;    //here change in x doesn't effect y;

        //Here it depends on address as it copies the address not the actual value
            Point point1 = new Point(1,1);
            Point point2 = point1;
            point1.x = 2;
            System.out.println(point2);
            System.out.println(point1);



//# Strings:  (strings are reference type in Java.)
            System.out.println("\n\t*** Strings ***");
            String message = " Hello World" + "! ! ";  // we can combine string using + operator

            System.out.println(message.endsWith("!!"));    //false --method to check the end of the string
            System.out.println(message.startsWith("Hello")); //true --method to check the start of the string
            System.out.println(message.length());  //to check the length of string
            System.out.println(message.indexOf("H"));  //give the index value of the given char.
            System.out.println(message.replace("!","*"));  //replace the value with other(but will not change the actual string.
            System.out.println(message);
            //In java strings are immutable(we cannot change them
            //any method that modify string will always return a new string object
            System.out.println(message.toLowerCase());   //convert to lower case
            System.out.println(message.toUpperCase());   //convert to upper case
            System.out.println(message.trim());    //it removes the white spaces from the beginning and end.

//# Special Characters
            System.out.println("\n\t*** Special Characters ***");
            String msg = "Hello \"Shazil\"";   //to add double quote in string \"
            String msg2 = "c:\\widnows\\...";  //to add backslashes \ :we add two backslashes.
            System.out.println(msg + msg2);


//## Arrays:    (reference type)
            System.out.println("\n\t*** Arrays ***");
         int[] numbers = {2,3,4,5,2};
         System.out.println(numbers.length);
         Arrays.toString(numbers);  //return the string representation of an array.
         System.out.println(Arrays.toString(numbers));  //prints the array

         //sorting an Array
         Arrays.sort(numbers);
         System.out.println(Arrays.toString(numbers));

//## Multi-dimensional Array.
          int[][] nums = {{1,2,3},{4,5,6}};

            Arrays.deepToString(nums);  //return the string representation of 2D array.
            System.out.println(Arrays.deepToString(nums));



//# Constants. (unchangable)
            System.out.println("\n\t*** Constants ***");
          final float PI = 3.14F;  //now it becomes constant (it can't be change)

//# Arithmetic Operators in Java:
            System.out.println("\n\t*** Arithmetic Operators ***");
        double result = (double)10/ (double)3;   //changed the type
                    System.out.println(result);
                    //increment:
                    int s = 2;   //3
                    int p = s++;   //2
                    int z = ++s;  //3

//# casting:

            System.out.println("\n\t*** Casting ***");
            //1.Implicit Casting(Automatic conversion)
                //byte > short > int > long
                short d = 1;
                int e = d + 1;    //type conversion short into int.
                System.out.println(e);  //3

            //.Explicit Casting:
                double i = 1.1;
                int j = (int)i + 2;  //type conversion(manually) from double to int
                System.out.println(j);
            //to change string to int
                String g = "1.1";
                double f = Double.parseDouble(g)+2;
                //similarly: Integer.parseInt();
                     //       Short.parseShort();
                System.out.println(f);

//# Maths Class:
            System.out.println("\n\t*** Math Class ***");
            int ret = Math.round(1.1F);
            int ret2 = (int)Math.ceil(1.1);
            int ret3 = (int)Math.floor(1.1F);
            int ret4 = Math.max(1,2);   //returns the greater number.
            double ret5 = Math.random();   //random number.
            ret5 = Math.random() * 100; //gives random values between 1 ann 100.

            System.out.println(ret);
            System.out.println(ret2);
            System.out.println(ret3);
            System.out.println(ret4);
            System.out.println(ret5);

//# Formatting Numbers;
            //NumberFormat currency = NumberFormat.getCurrencyInstance();
            //String cur = currency.format(1234567.891);
            //or simply:
            System.out.println("\n\t*** Formatting Numbers ***");
            String cur = NumberFormat.getCurrencyInstance().format(1234567.891);
            System.out.println(cur);  //Output: $1,234,564.89  //formatting numbers as currency

            //formatting number as percent.
            NumberFormat percent = NumberFormat.getPercentInstance();
            String per = percent.format(0.1);
            System.out.println(per); //Output: 10%    //formatting number as percent

//# Reading INPUT:

            System.out.println("\n\t*** Reading Input ***\n");
            System.out.println("# For Reading input from the user: ");
            //1.For taking input from user:
            Scanner scanner = new Scanner(System.in);   //System.in ->to take input in terminal.
            System.out.print("Enter your age: ");
            byte age1 = scanner.nextByte();
            System.out.println("Your age is " + age1);

            //for taking string as input:
            System.out.println("\nEnter you Name: ");

            String name = new Scanner(System.in).nextLine();  //to take string as input.
            System.out.println("\nYour Name is " + name);


//# Controlling Flow:
            //Comparison Operators:
           // < , > , <= , <=   return boolean (true or false)
            System.out.println("\n\t*** Comparison Operators ***");
          //Logical Operators:
            boolean hasHighIncome = false;
            boolean hasGoodCredit = true;
            boolean hasCriminalRecord = false;
            boolean isEligibleFor = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
            System.out.println("Eligible: " + isEligibleFor);




        //if-else statement:
            System.out.println("\n\t*** if-else ***");
            byte grade = 90;
            boolean isIntelligent = false;
            if(grade > 100){
                isIntelligent = true;
            }else {
                isIntelligent = false;
            }
        //we can also write this in a professional way:
        //            boolean isIntelligence = grade > 100;

            //*The Ternary Operator:
            System.out.println("\n\t*** The Ternary Operator ***");
            int income = 99_000;
            String className = income > 10_000 ? "First" : "Economy";
            System.out.println("\nYour Class: " + className);   //First


        //Switch Statements.

            System.out.println("\n\t*Switch Statements");
            byte role = 1;
            switch (role) {
                case 1:
                    System.out.println("You are an admin");
                    break;
                case 2:
                    System.out.println("you are a moderator");
                    break;
                default:
                    System.out.println("you are a guest");
            }



        }
    }


