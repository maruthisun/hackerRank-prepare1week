package main.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion_3 {
    public static void main(String[] args) {
        String input = "12:45:54PM"; //07:05:45PM
        String time = Result3.timeConversion(input);
        System.out.println(time);
    }
}

class Result3{
    public static String timeConversion(String time) {
        char meridian = time.charAt(8);
        int hh = Integer.parseInt(time.substring(0,2));
        String minSec = time.substring(2, time.length()-2);

        switch (meridian){
            case 'A':
                if(hh == 12){
                    time = "00" + minSec;
                }
                else{
                    time = "0" + hh + minSec;
                }
                break;
            case 'P':
                if(hh != 12){
                    hh += 12;
                    time = hh + minSec;
                }
                else{
                    time = hh + minSec;
                }
                break;
        }
        System.out.println(meridian);
        return time;
    }
}