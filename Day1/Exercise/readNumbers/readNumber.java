import java.util.Scanner;
public class readNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so bat ky");
        String number = scanner.nextLine();


        int n = number.length();
        switch (n) {
            case 1:
                System.out.println(readOne(number));
                break;
            case 2:
                System.out.println(readTwo(number));
                break;

        }
    }

//    public static void shoMessage(String message){System.out.println(message);
//    }

    public static String readOne(String number){
            String message = "";
            switch (number){
                case "0":
                    message = "Zero";
                    break;
                case "1":
                    message = "One";
                    break;
                case "2":
                    message = "Two";
                    break;
                case "3":
                    message = "Three";
                    break;
                case "4":
                    message = "Four";
                    break;
                case "5":
                    message = "Five";
                    break;
                case "6":
                    message = "Six";
                    break;
                case "7":
                    message = "Seven";
                    break;
                case "8":
                    message = "Eight";
                    break;
                case "9":
                    message = "Nine";
                    break;
            }
        return message;

    }

    public static String readTwo(String number) {
        String message = "";
        int valueNumber = Integer.parseInt(number);
        if (valueNumber < 20) {
            switch (valueNumber) {
                case 10:
                    message = "Ten";
                    break;
                case 11:
                    message = "Eleven";
                    break;
                case 12:
                    message = "Twelve";
                    break;
                case 13:
                    message = "Thirteen";
                    break;
                case 14:
                    message = "Fourteen";
                    break;
                case 15:
                    message = "Fifteen";
                    break;
                case 16:
                    message = "Sixteen";
                    break;
                case 17:
                    message = "Seventeen";
                    break;
                case 18:
                    message = "Eighteen";
                    break;
                case 19:
                    message = "Nineteen";
                    break;
            }
        } else {
            int numberDozens = valueNumber / 10;
            int numberOneDigit = valueNumber % 10;
            if (numberOneDigit != 0) {
                switch (numberDozens) {
                    case 2:
                        message = "Twenty" + readOne(Integer.toString(numberOneDigit));
                        break;
                    case 3:
                        message = "Thirty" + readOne(Integer.toString(numberOneDigit));
                        break;
                    case 4:
                        message = "Forty" + readOne(Integer.toString(numberOneDigit));
                        break;
                    case 5:
                        message = "Fifty" + readOne(Integer.toString(numberOneDigit));
                        break;
                    case 6:
                        message = "Sixty" + readOne(Integer.toString(numberOneDigit));
                        break;
                    case 7:
                        message = "Seventy" + readOne(Integer.toString(numberOneDigit));
                        break;
                    case 8:
                        message = "Eighty" + readOne(Integer.toString(numberOneDigit));
                        break;
                    case 9:
                        message = "Ninety" + readOne(Integer.toString(numberOneDigit));
                        break;
                }
            } else {
                switch (numberDozens) {
                    case 2:
                        message = "Twenty";
                        break;
                    case 3:
                        message = "Thirty";
                        break;
                    case 4:
                        message = "Forty";
                        break;
                    case 5:
                        message = "Fifty";
                        break;
                    case 6:
                        message = "Sixty";
                        break;
                    case 7:
                        message = "Seventies";
                        break;
                    case 8:
                        message = "Eighty";
                        break;
                    case 9:
                        message = "Ninety";
                        break;
                }
            }
        }
        return message;
    }

//    public static String readThree(String number){
//        int numberHundred = Integer.parseInt(number)
//    }
}

