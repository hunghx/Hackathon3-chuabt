package ra.validate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {
    @Test
    public void test1(){
        assertFalse(Validate.checkSongId("S00_"));
    }
    @Test
    public void test2(){
        assertFalse(Validate.checkSongId("S00__"));
    }
    @Test
    public void test3(){
        assertFalse(Validate.checkSongId("S0013"));
    }

}