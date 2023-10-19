package src;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){}

    public  Date(int day, int month, int year) {
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

    public String getDayMonthYear() {
        String message = "";
        int nextDay = this.day + 1;
        int nextMonth = this.month + 1;
        int nextYear = this.year + 1;
        switch(this.month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                message = get31Day(message, nextDay, nextYear, nextMonth);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                message = get30Day(message, nextDay, nextMonth);
            case 2:
                boolean isLeapYear = isaLeapYear();
                message = get28Or29Day(isLeapYear, nextDay, nextMonth);
                break;
            default:
                message = "thang khong hop le";
                break;
        }
        return message;
    }

    private String get28Or29Day(boolean isLeapYear, int nextDay, int nextMonth) {
        String message;
        if (isLeapYear){
                if (this.day < 29){
                    message = nextDay + "/" + this.month + "/" + this.year;
                }else if (this.day == 29){
                    this.day = 1;
                    message = this.day + "/" + nextMonth + "/"+ this.year;
                }else {
                    message = "Ngay khong hop le";
                }
        }else {
                if (this.day < 28){
                    message = nextDay + "/" + this.month + this.year;
                }else if ( this.day == 28){
                    this.day = 1;
                    message = this.day + "/" + nextMonth + "/" + this.year;
                }else {
                    message = "Ngay khong hop le";
                }
        }
        return message;
    }

    private boolean isaLeapYear() {
        boolean isLeapYear = false;
        if (this.year % 4 ==0){
            if (this.year % 100 == 0){
                if (this.year % 400 == 0){
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

    private String get30Day(String message, int nextDay, int nextMonth) {
            if (this.day < 30) {
                message = nextDay + "/" + this.month + "/" + this.year;
            }else {
                message = 1 + "/" + nextMonth + "/" + this.year;
            }
        return message;
    }

    private String get31Day(String message, int nextDay, int nextYear, int nextMonth) {
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
