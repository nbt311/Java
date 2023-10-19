package src;

public class NextDay {
    private int day;
    private int month;
    private int year;

    public NextDay(){}

    public NextDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String showNextDay() {
        String message = "";
        int nextDay = this.getDay() + 1;
        int nextMonth = this.getMonth() + 1;
        int nextYear = this.getYear() + 1;
        final int January = 1;
        final int February = 2;
        final int March = 3;
        final int April = 4;
        final int May = 5;
        final int June = 6;
        final int July = 7;
        final int August = 8;
        final int September = 9;
        final int October = 10;
        final int November = 11;
        final int December = 12;
        switch(this.getMonth()){
            case January:
            case March:
            case May:
            case July:
            case August:
            case October:
            case December:
                message = MonthHave31Days(message, nextDay, nextYear, nextMonth);
                break;

            case April:
            case June:
            case September:
            case November:
                message = MonthHave30Days(message, nextDay, nextMonth);
            case February:
                boolean isLeapYear = isaLeapYear();
                message = dayOfFebruary(isLeapYear, nextDay, nextMonth);
                break;
            default:
                message = "thang khong hop le";
                break;
        }
        return message;
    }

    private String dayOfFebruary(boolean isLeapYear, int nextDay, int nextMonth) {
        String message;
        if (isLeapYear){
                if (this.getDay() < 29){
                    message = nextDay + "/" + this.getMonth() + "/" + this.getYear();
                }else if (this.getDay() == 29){
                    this.day = 1;
                    message = this.day + "/" + nextMonth + "/"+ this.getYear();
                }else {
                    message = "Ngay khong hop le";
                }
        }else {
                if (this.getDay() < 28){
                    message = nextDay + "/" + this.getMonth() + this.getYear();
                }else if ( this.day == 28){
                    this.day = 1;
                    message = this.day + "/" + nextMonth + "/" + this.getYear();
                }else {
                    message = "Ngay khong hop le";
                }
        }
        return message;
    }

    private boolean isaLeapYear() {
        boolean isLeapYear = false;
        boolean divison4 = this.year % 4 == 0;
        boolean division100 = this.year % 100 == 0;
        boolean division400 = this.year % 400 == 0;
        if (divison4){
            if (division100){
                if (division400){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    private String MonthHave30Days(String message, int nextDay, int nextMonth) {
            if (this.day < 30) {
                message = nextDay + "/" + this.month + "/" + this.year;
            }else {
                message = 1 + "/" + nextMonth + "/" + this.year;
            }
        return message;
    }

    private String MonthHave31Days(String message, int nextDay, int nextYear, int nextMonth) {
            if (this.day < 31) {
                message = nextDay + "/" + this.month + "/" + this.year;
            }else if (this.month == 12 && this.day == 31 ){
                message = 1 + "/" + 1 + "/" + nextYear;
            }else {
                message = 1 + "/" + nextMonth + "/" + this.year;
            }
        return message;
    }
}
