package number;

import static java.lang.Thread.sleep;

/**
 * @author Jeferson Tapias Escudero
 */
public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Script designed for technical test in order to apply to S4N course\n"
                + "Presented for: Jeferson Tapias Escudero\nSystem engineering's student - Universidad Nacional\n");
        sleep(2000);
        System.out.println("Printing numbers from 1 to 100\n"
                + "Changing multiples of 3 for ´Fizz´ and multiples of 5 for 'Buzz'\n"
                + "if number is multiple of both, 'FizzBuzz' is printed\n");
        sleep(2000);
        
        number numero = new number();
        numero.evaluateNumbers();
    }
}
