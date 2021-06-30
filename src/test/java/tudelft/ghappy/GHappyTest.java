package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    GHappy gHappyTest;

    @BeforeEach
    public void happyObj(){
        gHappyTest = new GHappy();
    }
    @Test
    public void gHappyTest(){
        boolean result = gHappyTest.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void gHappyTest1(){
        boolean result = gHappyTest.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void gHappyTest2(){
        boolean result = gHappyTest.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }
}
