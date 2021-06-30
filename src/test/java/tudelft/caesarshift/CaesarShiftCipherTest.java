package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    @Test
    public void caesarShiftTest(){
        CaesarShiftCipher CserShift = new CaesarShiftCipher();
        String result = CserShift.CaesarShiftCipher("fgh",3);
        Assertions.assertEquals("ijk",result);

    }

}
