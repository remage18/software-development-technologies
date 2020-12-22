package lab1;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.mockito.Mockito.*;

public class StationeryStandIT {

    @Test
    public void add_Objects_ArraySize(){
        ArrayList<Tool> list = spy(new ArrayList<>());
        Pencil pencil = new Pencil(2.3, 0.6, 0.6, PencilHardness.F);
        StationeryStand stationeryStand = new StationeryStand(list);
        stationeryStand.addTools(pencil);
        stationeryStand.addTools(pencil);
        verify(list, times(2)).add(pencil);
        assertEquals(2, list.size());
    }

    @Test
    public void draw_NumberDecrement_String() throws DrawException {
        Pencil pencil = Mockito.mock(Pencil.class);
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
