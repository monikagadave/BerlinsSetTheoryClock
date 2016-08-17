package com.service;

import static com.utility.Literals.WRONG_INPUT_MESSAGE;

/**
 * Created by Monika on 17/08/2016.
 */
public class Clock {

    public String getClockRepresentation(String arguments[]){
        int hours = getHours(arguments);
        int minutes = getMinutes(arguments);
        int seconds = getSeconds(arguments);

        String wrongInput = handleWrongInput(hours, minutes, seconds);
        if(null != wrongInput){
            return wrongInput;
        }
        StringBuilder output = new StringBuilder();

        return  output.append("\n" + getSpecificTimePart(seconds, new Second()))
                .append("\n" + getSpecificTimePart(hours, new Hour()))
                .append("\n----------")
                .append("\n" + getSpecificTimePart(minutes, new Minute()))
                .append("\n")
                .toString();

    }

    private String getSpecificTimePart(int timeValue, TimeRepresenter timeLamp) {
        return timeLamp.getValue(timeValue);
    }

    private int getSeconds(String argument[]) {
        return Integer.parseInt( argument[2].substring(0,2));
    }

    private int getMinutes(String argument[]) {
        return Integer.parseInt( argument[0].substring(3,5));
    }

    private int getHours(String argument[]) {
        return Integer.parseInt( argument[0].substring(0,2));
    }

    private static String handleWrongInput(int hours, int minutes, int seconds) {
        if(hours > 24 || (hours == 24 && (minutes > 0 || seconds > 0)) || minutes > 59 || seconds > 59){
            return WRONG_INPUT_MESSAGE;
        }
        return null;
    }
}
