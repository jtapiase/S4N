package number;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jeferson Tapias Escudero
 */
public class number {
    //initial definition of parameters defined in the number object
    private List<Integer> number;
    
    //gonna be used for printing in case that number is multiple of 3
    private static final String messageFizz = "Fizz";
    
    //gonna be used for printing in case that number is multiple of 5
    private static final String messageBuzz = "Buzz";

    /*contructor, as numbers from 1 to 100 are required, a default array is defined within the 
    object's construction'
    */
    public number() {
        number = new ArrayList<Integer>();
        for(int i=0; i<100; i++){
            number.add(i+1);
        }
    }
    
    /*method used for numbers evaluation, each number is printed from 1 to 100
    but if the number is multipl of 3 or 5, it's replaced with the expected message*/
    public void evaluateNumbers(){
        number.forEach((n) -> {
            if(n%3==0 || n%5==0)
                System.out.println(multiple3(n)+multiple5(n));
            else
                System.out.println(n);       
        });
    }
    
    //checking if a number is multiple of 3, if it is, messageBuzz is returned
    public String multiple3(int n){
        if(n%3==0)
            return this.messageFizz;
        return "";
    }
    
    //checking if a number is multiple of 5, if it is, messageFizz is returned
    public String multiple5(int n){
        if(n%5==0)
            return this.messageBuzz;
        return "";
    }
    
    //getter method
    public List<Integer> getNumber() {
        return number;
    }
    
    //setter method
    public void setNumber(List<Integer> number) {
        this.number = number;
    }

    //getter method
    public String getMessageFizz() {
        return messageFizz;
    }

    //getter method
    public String getMessageBuzz() {
        return messageBuzz;
    }
}
