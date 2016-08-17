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
public class SecondTest {

    @InjectMocks
    Second second;

    @Test
    public void shouldBeYellowForEvenSeconds(){
        assertEquals("  Y", second.getValue(0));
        assertEquals("  Y", second.getValue(2));
    }

    @Test
    public void shouldBeUnlitForOddSeconds(){
        assertEquals("  .", second.getValue(7));
        assertEquals("  .", second.getValue(59));
    }
}
