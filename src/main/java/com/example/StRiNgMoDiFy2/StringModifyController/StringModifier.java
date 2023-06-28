package com.example.StRiNgMoDiFy2.StringModifyController;

public class StringModifier {
    private static String lastModifiedString = "";
    private static int lastModifiedStringLength = 0;

    public static String modifyString(String input) {
        StringBuilder modifiedString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                modifiedString.append(Character.toLowerCase(c));
            } else {
                modifiedString.append(Character.toUpperCase(c));
            }
        }
        lastModifiedString = modifiedString.toString();
        lastModifiedStringLength = lastModifiedString.length();
        return lastModifiedString;
    }

    public static int getLastModifiedStringLength() {
        return lastModifiedStringLength;
    }
}
