import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import number.number;

/**
 * @author Jeferson Tapias Escudero
 **/
public class numberTest {
    
    public numberTest() {
    }
    
    //unit test for multiple3 method from number object
    @Test
    public void multiple3Test(){
        //given a number type variable, we get the default numer list created in the object
        number number = new number();
        List<Integer> numberList = number.getNumber();
        
        /*we assert that a random multiple of 3 number from the list, is checked by the method and get 
        the expected message*/
        assertEquals("Fizz", number.multiple3(numberList.get(5)));
    }
    
    //unit test for multiple5 method from number object
    @Test
    public void multiple5Test(){
        //given a number type variable, we get the default numer list created in the object
        number number = new number();
        List<Integer> numberList = number.getNumber();
        
        /*we assert that a random multiple of 5 number from the list, is checked by the method and get 
        the expected message*/
        assertEquals("Buzz", number.multiple5(numberList.get(19)));
    }
    
    //testing that a number that is multiple of both, prints 'FizzBuzz'
    @Test
    public void multiple5or3Test(){
        //given a number type variable, we get the default numer list created in the object
        number number = new number();
        List<Integer> numberList = number.getNumber();
        
        /*we assert that a random multiple of 5 number from the list, is checked by the method and get 
        the expected message*/
        assertEquals("FizzBuzz", number.multiple3(numberList.get(14))+number.multiple5(numberList.get(14)));
    }  
    
    /*for numbers that are not multiples of 3 or 5, we take for granted that systems prints them correctly
    due to this is a native method*/
}
