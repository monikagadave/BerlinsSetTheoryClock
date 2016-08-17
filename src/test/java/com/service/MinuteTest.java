package com.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Monika on 16/08/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class MinuteTest {

    @InjectMocks
    Minute minute;

    @Test
    public void shouldRepresentMinutesInMultipleOfFivesForRedLamps(){
        assertEquals("YYR........", minute.representMinutesInMultipleOfFive(15).toString());
        assertEquals("YYRYYR.....", minute.representMinutesInMultipleOfFive(30).toString());
        assertEquals("YYRYYRYYR..", minute.representMinutesInMultipleOfFive(45).toString());
        assertEquals("YYRYYR.....", minute.representMinutesInMultipleOfFive(34).toString());
    }

    @Test
    public void shouldRepresentMinutesInMultipleOfFivesForYellowLamps(){
        assertEquals("Y..........", minute.representMinutesInMultipleOfFive(6).toString());
        assertEquals("YY.........", minute.representMinutesInMultipleOfFive(12).toString());
        assertEquals("YYRYYRYYRYY", minute.representMinutesInMultipleOfFive(55).toString());
    }

    @Test
    public void shouldRepresentSingleMinutes(){
        assertEquals("YYYY", minute.representMinutesInSingle(14).toString());
        assertEquals("Y...", minute.representMinutesInSingle(31).toString());
        assertEquals("....", minute.representMinutesInSingle(55).toString());
    }

    @Test
    public void shouldRepresentMinutes(){
        assertEquals("...........\n....", minute.getValue(0));
        assertEquals("YYRYY......\nYY..", minute.getValue(27));
        assertEquals("YYRYYRY....\nYYYY", minute.getValue(39));
        assertEquals("YYRYYRYYRYY\nYYYY", minute.getValue(59));
    }
}
