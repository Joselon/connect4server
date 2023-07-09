package com.labturing.connect4server.types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ColorTest {

    private Color color;

    @Test
    public void givenColorWhenGetOppositeThenReturnOposite(){
        this.color = Color.RED;
        assertEquals(Color.YELLOW, this.color.getOpposite());
    }

    @Test
    public void givenColorWhenGetValidIntegerThenReturnColor(){
        assertEquals(Color.RED, Color.get(0));
        assertEquals(Color.YELLOW, Color.get(1));
    }

    @Test
    public void givenColorWhenGetInvalidIntegerThenAssertError(){
        assertThrows(AssertionError.class, ()->{
            Color.get(3);
        });
    }
    
}
