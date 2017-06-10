package com.foodie.au.util;

public final class ExceptionThrowingUtil {
    private ExceptionThrowingUtil() {
    }

    public static <T> T throwException(String msg) {
        throw new RuntimeException(msg);
    }

}
