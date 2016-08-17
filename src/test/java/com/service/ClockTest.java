package com.service;

import com.utility.Literals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static com.utility.Literals.WRONG_INPUT_MESSAGE;
import static org.junit.Assert.*;

/**
 * Created by Monika on 17/08/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class ClockTest {

    @InjectMocks
    Clock clock;

    @Test
    public void shouldGetClockRepresentation(){
        String expectedResult = new StringBuilder("\n  .")
                .append("\nRR..")
                .append("\nRR..")
                .append("\n----------")
                .append("\nYYRY.......")
                .append("\nYYY.")
                .append("\n").toString();
        assertEquals(expectedResult, clock.getClockRepresentation(new String[] {"12:23","and" ,"33"," seconds"}));

        expectedResult = new StringBuilder("\n  Y")
                .append("\nRRRR")
                .append("\nRRR.")
                .append("\n----------")
                .append("\nYYRYYRYYRYY")
                .append("\nYYY.")
                .append("\n").toString();

        assertEquals(expectedResult, clock.getClockRepresentation(new String[] {"23:58","and" ,"20"," seconds"}));
    }

    @Test
    public void shouldReturnMessageForWrongInput(){
        assertEquals(WRONG_INPUT_MESSAGE, clock.getClockRepresentation(new String[] {"12:23","and" ,"70"," seconds"}));
        assertEquals(WRONG_INPUT_MESSAGE, clock.getClockRepresentation(new String[] {"12:60","and" ,"45"," seconds"}));
        assertEquals(WRONG_INPUT_MESSAGE, clock.getClockRepresentation(new String[] {"24:30","and" ,"45"," seconds"}));
    }

}