package dectobin;
import java.util.*;
public class Dectobin {

    int num;
    
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number: ");
        num = sc.nextInt();
    }
    
    void convert(){
        int n = 0;
        int num2 = num;
        String str = "";
        while(num2 > 0){
            if(num2 % 2 == 0)
               str =  '0' + str;
            else
               str = '1' + str; 
        num2 = num2/2;
        }
        
        System.out.println("Binary equivalent: " + str);
    }
    
    
    public static void main(String[] args) {

        Dectobin ob = new Dectobin();
        ob.input();
        ob.convert();
        
        
    }
    
}
