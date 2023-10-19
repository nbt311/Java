package test;
import org.junit.jupiter.api.Test;
import src.TheNextDay;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheNextDayTest {

    @Test
    public void testInputDayNotExactlyWithLessThanMin() {
        int day = 0;
        int month = 3;
        int year = 2023;
        String expected = "Data Day not exactly";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayNotExactlyWithMoreThanMax() {
        int day = 32;
        int month = 3;
        int year = 2023;
        String expected = "Data Day not exactly";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayExactlyMinWithCommonYear() {
        int day = 1;
        int month = 1;
        int year = 2023;
        String expected = "2023-1-2";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void test2InputDayExactlyMax30DayWithCommonYear() {
        int day = 30;
        int month = 4;
        int year = 2023;
        String expected = "2023-5-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
    @Test
    public void test3InputDayExactlyMax30DayWithCommonYear() {
        int day = 25;
        int month = 9;
        int year = 2023;
        String expected = "2023-9-26";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayExactlyMax31DayWithCommonYear() {
        int day = 31;
        int month = 5;
        int year = 2023;
        String expected = "2023-6-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    public void testInputDayMaxOfMothFebruaryWithCommonYear() {
        int day = 28;
        int month = 2;
        int year = 2023;
        String expected = "2023-3-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayMaxOfMothFebruaryWithLeapYear() {
        int day = 29;
        int month = 2;
        int year = 2024;
        String expected = "2024-3-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
    @Test
    public void test2InputDayMaxOfMothFebruaryWithCommon() {
        int day = 29;
        int month = 2;
        int year = 2023;
        String expected = "Data Day not exactly";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
    @Test
    public void testInputDayMaxOfMothDecemberWithCommon() {
        int day = 31;
        int month = 12;
        int year = 2023;
        String expected = "2024-1-1";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
    @Test
    public void test2InputDayMaxOfMothDecemberWithCommon() {
        int day = 31;
        int month = 13;
        int year = 2023;
        String expected = "Data Day not exactly";
        String actual = TheNextDay.getNextTime(day, month, year);
        assertEquals(expected, actual);
    }
}
