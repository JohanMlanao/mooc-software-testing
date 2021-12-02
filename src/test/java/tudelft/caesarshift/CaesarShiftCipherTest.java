package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CaesarShiftCipherTest {

    private final CaesarShiftCipher cs = new CaesarShiftCipher();

    @Test
    public void Shifty() {
        Assertions.assertEquals("def", cs.CaesarShiftCipher("abc",3));
        Assertions.assertEquals("abc", cs.CaesarShiftCipher("xyz",3));
        Assertions.assertEquals("invalid", cs.CaesarShiftCipher("12345",2));
    }

}
