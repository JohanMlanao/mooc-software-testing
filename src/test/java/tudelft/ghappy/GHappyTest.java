package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;



public class GHappyTest {

        private final GHappy yes = new GHappy();

    @Test
    public void happiness() {
        Assertions.assertTrue(yes.gHappy("xxggxx"));
        Assertions.assertFalse(yes.gHappy("xxgxx"));
        Assertions.assertFalse(yes.gHappy("xxggyygxx"));
        Assertions.assertTrue(yes.gHappy("gg_1afr-gg(ggyyygg"));
    }
}
