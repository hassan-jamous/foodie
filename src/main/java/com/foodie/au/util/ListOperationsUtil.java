package com.foodie.au.util;

import java.util.Collections;
import java.util.List;

public final class ListOperationsUtil {
    private ListOperationsUtil() {
    }

    public static <T> List<T> isSafe(List<T> other) {
        return other == null ? Collections.EMPTY_LIST : other;
    }
}
