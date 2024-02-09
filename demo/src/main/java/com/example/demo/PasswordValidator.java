package com.example.demo;

import java.util.regex.Pattern;

public class PasswordValidator {

    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-+";
    private static final Pattern DIGIT_PATTERN = Pattern.compile(".*[0-9].*");
    private static final Pattern LOWERCASE_PATTERN = Pattern.compile(".*[a-z].*");
    private static final Pattern UPPERCASE_PATTERN = Pattern.compile(".*[A-Z].*");
    private static final Pattern SPECIAL_PATTERN = Pattern.compile(".*[" + SPECIAL_CHARACTERS + "].*");
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile(".*\\s.*");

    public static boolean isValid(String password) {
        if (password == null || password.isEmpty() || WHITESPACE_PATTERN.matcher(password).matches()
                || password.length() < 9) {
            return false;
        }

        if (!DIGIT_PATTERN.matcher(password).matches() ||
                !LOWERCASE_PATTERN.matcher(password).matches() ||
                !UPPERCASE_PATTERN.matcher(password).matches() ||
                !SPECIAL_PATTERN.matcher(password).matches() ||
                hasRepeatedCharacters(password)) {
            return false;
        }

        return true;
    }

    private static boolean hasRepeatedCharacters(String password) {
        int[] charCounts = new int[Character.MAX_VALUE + 1]; // Use Character.MAX_VALUE for full Unicode support
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (charCounts[c]++ > 0) {
                return true;
            }
        }
        return false;
    }
}
