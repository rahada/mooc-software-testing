package tudelft.gettingstarted;

import org.jetbrains.annotations.TestOnly;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStarted {
    public int addFive (int number) {
        return number + 5;
    }

    @Test
    public void addFiveToTwenty() {
        int result = addFive (20);
        Assertions.assertEquals (25,result);
    }

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinusTwenty() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15, result);
    }

    public int minusFive (int number) {return number -5; }

    @Test
    public void twentyMinusFive (){
        int calculate = minusFive (20);
        Assertions.assertEquals(15,calculate);
    }

}



