package src;

public class TheNextDay {
    public static String getNextTime(int day, int month, int year){
        if (year < 0){
            return "Data Day not exactly";
        }
        if (month < 1 || month > 12 ){
            return "Data Day not exactly";
        }
        if (day < 1 || day > 31){
            return "Data Day not exactly";
        }
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        if (isaMothHave30Day(month)){
            if (day == 30){
                nextDay = 1;
                nextMonth += 1;
            }else {
                nextDay +=1;
            }
        } else if (isaMothHave31Day(month)) {
            if (month == 12){
                nextYear +=1;
                nextMonth = 1;
                nextDay = 1;
            }
            else if ( day == 31){
                nextDay = 1;
                nextMonth += 1;
            }else {
                nextDay +=1;
            }
        }else {
            boolean isLeapYear = isLeapYear(year);
            if (isLeapYear){
                if (day < 29){
                    nextDay += 1;
                }
                else if (day == 29){
                    nextDay = 1;
                    nextMonth += 1;
                }else {
                    return "Data Day not exactly";
                }
            }else {
                if (day < 28){
                    nextDay += 1;
                }
                else if (day == 28){
                    nextDay = 1;
                    nextMonth += 1;
                }else {
                    return "Data Day not exactly";
                }
            }

        }

        return nextYear + "-" + nextMonth + "-" + nextDay;
    }

    private static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        boolean division4 = year % 4 == 0;
        boolean divison100 = year % 100 == 0;
        boolean division400 = year % 400 == 0;
        if (division4){
            if (divison100){
                if(division400){
                   isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    private static boolean isaMothHave30Day(int month) {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }
    private static boolean isaMothHave31Day(int month) {
        return month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
    }
}
