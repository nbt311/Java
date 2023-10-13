import src.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Trung","1994-11-03");
        System.out.println("Tuoi hien tai: " + p.celebrateBirthday() );
    }
}
