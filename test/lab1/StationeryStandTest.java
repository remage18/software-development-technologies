package lab1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StationeryStandTest {

    @Test
    public void testStationaryStandName(){
        String name = "ERICH KRAUSE";
        StationeryStand obj = new StationeryStand();
        obj.setName(name);
        assertTrue(obj.getName().equals(name));
    }

    @Test
    public void testDraw(){
        Pencil obj = new Pencil(0.3, 0.6, 0.6, PencilHardness.F);
        StationeryStand obj1 = new StationeryStand();
        Exception exception = assertThrows(DrawException.class, () -> obj1.draw(obj));
        assertTrue(exception.getMessage().contains("Length of pencil so small, take another."));
    }
}