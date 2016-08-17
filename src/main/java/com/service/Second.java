package com.service;

import static com.utility.Literals.UNLIT_LAMP;
import static com.utility.Literals.YELLOW;

/**
 * Created by Monika on 16/08/2016.
 */
public class Second implements TimeRepresenter{

    @Override
    public String getValue(int seconds){
        return "  " + ((seconds % 2 == 0) ? YELLOW : UNLIT_LAMP);
    }
}
