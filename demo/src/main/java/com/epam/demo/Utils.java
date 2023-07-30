package com.epam.demo;

import java.util.List;
import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        //magic happens here
        return args.stream().allMatch(StringUtils::isPositiveNumber);
    }
}