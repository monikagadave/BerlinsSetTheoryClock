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
        assertEquals("R...", hour.getHourRepresentationInSingle(1).toString());
        assertEquals("RRR.", hour.getHourRepresentationInSingle(13).toString());
    }

    @Test
    public void shouldRepresentHourInFivesPlusSingleHours(){
        assertEquals("RRRR\nRRRR", hour.getValue(24));
        assertEquals("....\nR...", hour.getValue(1));
        assertEquals("R...\nRRR.", hour.getValue(8));
    }

}
