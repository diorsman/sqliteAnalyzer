package com.novoda.sqlite;

public final class StringUtil {

    private StringUtil() {
    }

    public static String camelize(String text) {
        String caseBase = text;
        while (caseBase.startsWith("_")) {
            caseBase = caseBase.substring(1);
        }
        return caseBase.substring(0, 1).toUpperCase() + caseBase.substring(1).toLowerCase();
    }

}
