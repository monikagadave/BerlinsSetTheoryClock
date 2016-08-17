package com.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Monika on 16/08/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class HourTest {

    @InjectMocks
    Hour hour;

    @Test
    public void shouldGetHourInFivesToLitRed(){
        assertEquals("RR..", hour.getHourRepresentationInFives(10).toString());
        assertEquals("RRR.", hour.getHourRepresentationInFives(18).toString());
    }

    @Test
    public void shouldGetHoursInSingle(){
        assertEquals("Y...", hour.getHourRepresentationInSingle(1).toString());
        assertEquals("YYY.", hour.getHourRepresentationInSingle(13).toString());
    }

    @Test
    public void shouldRepresentHourInFivesPlusSingleHours(){
        assertEquals("RRRR\nYYYY", hour.getValue(24));
        assertEquals("....\nY...", hour.getValue(1));
        assertEquals("R...\nYYY.", hour.getValue(8));
    }

}
