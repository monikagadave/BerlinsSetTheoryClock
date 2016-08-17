package com.service;

import static com.utility.Literals.*;

/**
 * Created by Monika on 16/08/2016.
 */
public class Minute implements TimeRepresenter{

    @Override
    public String getValue(int minutes){
        return representMinutesInMultipleOfFive(minutes)
                .append("\n")
                .append(representMinutesInSingle(minutes)).toString();
    }

    protected StringBuilder representMinutesInSingle(int minutes) {
        StringBuilder value = new StringBuilder(UNLIT_HOURS_OR_MINUTES);
        for(int i = 0; i < minutes % FIVE; i++){
            value = value.replace(i, i + 1, "Y");
        }
        return value;
}

    protected StringBuilder representMinutesInMultipleOfFive(int minutes) {
        StringBuilder value = new StringBuilder(UNLIT_MINUTES_IN_MULTIPLE_OF_FIVE);
        for(int i=0; i < minutes / FIVE; i++){
            if((i + 1) % 3 == 0){
                value = value.replace(i , i + 1, RED );
            }else{
                value = value.replace(i , i + 1, YELLOW);
            }
        }
        return value;
    }
}
