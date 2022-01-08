package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class LocalDateTest {
    void test() {
        ArrayList<String> ary = new ArrayList();
        ary.add("2020-01-01");
        ary.add( "2020-1-1");
        ary.forEach(this::parse);

    }

    void parse(String raw) {
        LocalDate d = LocalDate.parse(raw, DateTimeFormatter.ofPattern("yyyy-M-d"));
        System.out.println(d.toString());
    }

}
