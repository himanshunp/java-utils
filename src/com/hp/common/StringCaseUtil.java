package com.hp.common;

/**
 * Change string with "_" to camel case
 * Created by parmar on 5/31/17.
 */
public class StringCaseUtil {
    public static String changeToCamelCase(String input) {
        char[] result = new char[input.length()];
        for (int i=0; i< input.length(); i++) {
            if(input.charAt(i) == '_') {
                result[i] = input.charAt(i);
                result[i+1] = Character.toUpperCase(input.charAt(i+1));
                i++;
            } else {
                result[i] = Character.toLowerCase(input.charAt(i));
            }
        }
        return new String(result).replaceAll("_", "");
    }

    public static void main(String[] args) {
        System.out.println(StringCaseUtil.changeToCamelCase("FIRST_NAME"));
    }
}
