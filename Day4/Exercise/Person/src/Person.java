package src;
import java.time.LocalDate;

import java.util.concurrent.atomic.LongAccumulator;

public class Person {
    String name;
    String birthday;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }



    public int getAge() {
        LocalDate date =  LocalDate.parse(this.birthday);
        int year1 = date.getYear();
        LocalDate date1 =  LocalDate.now();
        int year2 = date1.getYear();
        return year2 - year1;

    }

    public String celebrateBirthday(){
        LocalDate date = LocalDate.parse(this.birthday);
        int day1 = date.getDayOfMonth();
        int month1 = date.getMonthValue();
        LocalDate date2 = LocalDate.now();
        int day2 = date2.getDayOfMonth();
        int month2 = date2.getDayOfMonth();
        int year = date2.getYear();

        if (month1 >= month2 && day1 >= day2 ){
           return   "Sinh nhat gan nhat cua ban la: " + day1 + "-" + month1 + "-" + (year + 1);
        }else {
            return  "Sinh  nhat gan nhat cua ban la: " + day1 + "-" + month1 + "-" + year;
        }
    }
}
