package lab1;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.mockito.Mockito.*;

public class StationeryStandIT {
    @Test
    public void draw_NumberDecrement_String() throws DrawException {
        Pencil pencil  = Mockito.mock(Pencil.class);
        when(pencil.draw()).thenReturn("Drawing...");
        StationeryStand stationeryStand = new StationeryStand();
        assertEquals(stationeryStand.draw(pencil), "Drawing...");
        verify(pencil).draw();
    }

    @Test
    public void draw_NumberLessThanOne_DrawException() throws DrawException{
        Pencil pencil  = Mockito.mock(Pencil.class);
        when(pencil.draw()).thenThrow(new DrawException("Length of pencil so small, take another."));
        StationeryStand stationeryStand = new StationeryStand();
        Exception exception = assertThrows(DrawException.class, () -> stationeryStand.draw(pencil));
        assertTrue(exception.getMessage().contains("Length of pencil so small, take another."));
        verify(pencil).draw();
    }
}
