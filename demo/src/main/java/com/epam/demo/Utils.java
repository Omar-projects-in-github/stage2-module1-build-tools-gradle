package com.epam.demo;

import java.util.Iterator;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        Iterator<String> iterator = args.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            if (Integer.parseInt(value) <= 0)
                return false;
        }
        return true;
    }
}