/*
 *
 *  * © Copyright - Ron Schluseneck aka. Nasty.
 *  * www.ron-schluseneck.de
 *  * 07.01.21, 22:22
 *
 */

package de.nasty.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Logger {

    public static void log(Types type, String message) {
        String mainPrefix = "[DEMO] ";

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date tDay = Calendar.getInstance().getTime();
        String date = dateFormat.format(tDay);

        if(type == Types.WARNING) {
            String text = "[" + date + " WARNING]: " + mainPrefix + message;
            System.out.println(text);
        } else if(type == Types.INFO) {
            String text = "[" + date + " INFO]: " + mainPrefix + message;
            System.out.println(text);
        } else if(type == Types.ERROR) {
            String text = "[" + date + " ERROR]: " + mainPrefix + message;
            System.out.println(text);
        } else if(type == Types.SUCCESS) {
            String text = "[" + date + " SUCCESS]: " + mainPrefix + message;
            System.out.println(text);
        } else if(type == Types.DEBUG) {
            String text = "[" + date + " DEBUG]: " + mainPrefix + message;
            System.out.println(text);
        }
    }
}
