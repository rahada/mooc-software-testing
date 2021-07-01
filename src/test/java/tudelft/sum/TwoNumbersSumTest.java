package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void TowNumberSum(){
     TwoNumbersSum numbers  = new TwoNumbersSum();
        ArrayList<Integer> firstArr = new ArrayList<Integer>();
        firstArr.add(1); firstArr.add(2); firstArr.add(3);

        ArrayList<Integer> secondArr = new ArrayList<Integer>();
        secondArr.add(4); secondArr.add(5); secondArr.add(6);

        ArrayList<Integer> result = numbers.addTwoNumbers(firstArr, secondArr);
     Assertions.assertEquals(new ArrayList<Integer>(Arrays.asList(5,7,9)),result);
    }

}
