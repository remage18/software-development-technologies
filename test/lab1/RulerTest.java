package lab1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RulerTest {

    @Test
    public void testRulerScaleSize(){
        int testScaleSize = 25;
        Ruler obj = new Ruler(26.4, 0.8, 0.3, 20);
        obj.setScaleSize(testScaleSize);
        assertTrue(obj.getScaleSize() == 25);
    }

}