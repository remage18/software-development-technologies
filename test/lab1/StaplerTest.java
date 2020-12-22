package lab1;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaplerTest {

    @Test
    public void testStaplerName(){
        String name = "Economix";
        Stapler obj = new Stapler(10.2, 1.5, 3.9, "BUROMAX");
        obj.setName(name);
        assertTrue(obj.getName().equals(name));
    }

}