package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         //here magic will happen
        return NumberUtils.isParsable(str) && Double.parseDouble(str) > 0;
    }
}
