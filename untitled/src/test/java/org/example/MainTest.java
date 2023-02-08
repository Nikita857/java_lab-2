package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    //    Этот тест должен вернуть True
    @Test
     void isLeap1() {
        String input = "2024";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
       assertEquals("В этом году 366 дней", Main.isLeap());
    }

    //    Этот тест должен вернуть True
    @Test
    void isLeap2() {
        String input = "2022";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("В этом году 365 дней", Main.isLeap());
    }

    //    Этот тест должен вернуть False
    @Test
    void isLeap3() {
        String input = "2024";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("В этом году 365 дней", Main.isLeap());
    }

}