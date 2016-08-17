package com.service;

import static com.utility.Literals.*;

/**
 * Created by Monika on 16/08/2016.
 */
public class Hour implements TimeRepresenter{

    @Override
    public String getValue(int hours){
        return getHourRepresentationInFives(hours).append("\n").append(getHourRepresentationInSingle(hours)).toString();
    }

    protected StringBuilder getHourRepresentationInSingle(int number) {
        StringBuilder value = new StringBuilder(UNLIT_HOURS_OR_MINUTES);
        for(int i=0; i< number % FIVE; i++){
            value = value.replace(i , i + 1, YELLOW);
        }
        return value;
    }

    protected StringBuilder getHourRepresentationInFives(int number) {
        StringBuilder value = new StringBuilder(UNLIT_HOURS_OR_MINUTES);
        for(int i = 0; i < number/ FIVE; i++){
            value = value.replace(i, i +1, RED);
        }
        return value;
    }
}
