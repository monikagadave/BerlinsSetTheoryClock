package com.client;

import com.service.*;

/**
 * Created by Monika on 16/08/2016.
 */
public class ApplicationClient {

    public static void main(String args[]){
        System.out.println(new Clock().getClockRepresentation(args));
    }
}
