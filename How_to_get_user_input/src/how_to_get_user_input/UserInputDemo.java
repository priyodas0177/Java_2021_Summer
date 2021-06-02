
package how_to_get_user_input;

import java.util.Scanner;
        


public class UserInputDemo {
    public static void main(String[] args) {
        
        Scanner input= new Scanner (System.in);//user input
        int number;     
        System.out.print("Enter number :");
        number=input.nextInt();
        System.out.println("number= "+number);
        
        
        Scanner num= new Scanner (System.in);
        String name;
        System.out.print("Enter your name :");
        name=num.nextLine();
        
        
        System.out.println("welcome : = "+name);
        
        
    }
            
    
}
