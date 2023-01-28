package lab1;
import java.util.Random;
import java.util.Scanner;
import java.io.Closeable;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.text.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Date;   // import the Date class


public class Main {
    public static void main (String [] args) {
        String msg= """ 
            Enter one of the following commands:
            1 - Create a random number
            2 - Calculate the BMI
            3 - Show the quote of the day
            4 - Show details about the current time and date
            5 - Enter several integers and then you present the sum of them
            6 - exit 
            """;


        System.out.println(msg);


        Menu ch = new Menu();
        ch.choiceentry();
        
    }
}



//A menu class to show a menu and call methods depending on the selected



class Menu {
    public String choiceentry(){
        
        Menu ch = new Menu();     
        while(true){
            Scanner in = new Scanner(System.in);
            String choice = in.nextLine();

            switch(choice){
                case "1":
                ch.ranNumber();
                break;

                case "2":
                ch.BMI();
                break;

                case "3":
                ch.quote();
                break;

                case "4":
                ch.timedate();
                break;

                case "5":
                ch.sum();
                break;

                case "6":
                System.exit(0);
                break;
                default:
                    System.out.println("Invalid choice.");                } 
            }   
            
    }
    
    
    // 4. Create a random number and let the user select between which numbers it should be generated.
    public int ranNumber() {
        int MIN, Max, number;
        Random rand = new Random() ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the min:");
        MIN = input.nextInt(); 
        System.out.println("Enter the max:");
        Max = input.nextInt(); 
        number= rand.nextInt (MIN, Max+1);
        System.out.println("The Random Number between " + MIN + " and " + Max + " Is: " + number);
        return number;
    }


// 5. Calculate the BMI for the user by asking for the users height (cm) and weight (kg).

    public int BMI () {

        int weight;
        int height;
        int bmi;
        // Scanner console; //  create a variable to represent the console
        Scanner input = new Scanner (System.in); //  create the object with new
        System.out.println("Enter your weight (in kg)? "); // user prompt to provide weight
        weight = input.nextInt(); // read from console
        System.out.print("Enter your height (in cm)? "); // user prompt to provide height
        height = input.nextInt(); // read value from console
        bmi =  weight  / ((height * height) / 10000); // calculates BMI      
        // div by 100*100 for cm to m conversion

        System.out.println("Your BMI Body Mass is " + bmi); // displays user's BMI
                
        return bmi;
        // in.close();


    }


// 6. Show the "quote of the day" and you must have at least 4 different quotes that you randomize among, use an array or an list to store the quotes.
    // Metod som tar en array med string och int som inparametrar

    public String quote (){

        
        // String[] inArr = new ArrayList<String>();            
            

        // Vår array med citat 
        String [] arrEx = { "De människor som fått ut mest av livet är inte de som har levt ett sekel utan de som har levt varje minut. " ,"Älskar du livet? Förslösa då inte tiden, för det är den som livet består av." , 
            "Alla dessa dagar som kom och gick inte visste jag att det var livet.",
            "Alla djur, utom människan, vet mycket väl att livets huvudsakliga mening är att njuta av det."};
        // Skapar scanner objekt för att kunna spara ned info
        Scanner in = new Scanner(System.in);
        System.out.println("Ange heltal mellan 0-3 för att skriva ut dagenscitat");
        
        // Sparar ned det heltal användaren anger
        int userInput = in.nextInt();
        System.out.println("Dagenscitat " + userInput + 
                " är: " + "'"+ arrEx[userInput]+ "'");
            
        // Anropar metoden
        return arrEx[userInput];
       
        

    }


//  7. Show details about the current time and date and print it out. Show at least current time, day of the week, date in the month, week number, month and year.



    public Date timedate (){
    
    
            // we have created a date and placed it in the object data
            Date date = new Date(); // Create a date object
            Calendar caland = Calendar. getInstance();
            caland.setTime(date);


    
            // Here we have shown the date that is stored in the object data
            System.out.println( "Today's Date is : " + date + " week " + caland.get(Calendar.WEEK_OF_YEAR)); // Display the current date
    //         // in.close();
            // system.out.println(date.get(Calendar.WEEK_OF_YEAR));

            return date;
    }




// 8. Let the user enter several integers and then you present the sum of them.


    public int sum (){
    
            int num = 0 , rem = 0, sum = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number:");
            num = scan.nextInt();

            // System.out.println("Enter another number:");
            // int num2 = scan.nextInt();
            while (num > 0){

                rem=num%10; //to find out reminder
                sum=sum+rem;  //add reminder into sum
                num=num/10;  // change value of number variabel
            }

            

            System.out.println("Sum of digits: " + sum);
            // in.close();
            return sum;
               
 
        
    }
}


