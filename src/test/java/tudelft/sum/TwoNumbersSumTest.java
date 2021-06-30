package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoNumbersSumTest {

    @Test
    public void TowNumberSum(){
     TwoNumbersSum numbers  = new TwoNumbersSum();
     int result = numbers.ArrayList();
        Assertions.assertEquals("1,2",result);

    }

}
