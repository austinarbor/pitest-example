package dev.aga;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Example {
    public static String tree() {
        if (LocalDate.now().get(ChronoField.YEAR) == 2022) {
            return "TREE";
        }
        return "tree";
    }
}
