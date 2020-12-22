package lab1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PencilTest {
    @Test
    public void testPencilHardness(){
        PencilHardness randomHardness = PencilHardness.H;
        Pencil obj = new Pencil(2.3, 0.6, 0.6, PencilHardness.F);
        obj.setPencilHardness(randomHardness);
        assertTrue(obj.getPencilHardness() == PencilHardness.H);
    }

    @Test
    //standard equals
    public void testPencilEquals(){
        Pencil obj1 = new Pencil(2.3, 0.6, 0.6, PencilHardness.F);
        Pencil obj2 = new Pencil(2.3, 0.6, 0.6, PencilHardness.F);
        Pencil obj3 = obj1;
        assertFalse(obj1.equals(obj2));
        assertTrue(obj1.equals(obj3));
    }
}
