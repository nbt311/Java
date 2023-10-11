import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Tim kiem sinh vien----");
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Nhap ten sinh vien");
        String inputName = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
                if (students[i].equals(inputName)) {
                    System.out.println("Vi tri cua sinh vien " + students[i] + " trong danh sach la " + i);
                    isExist = true;
                    break;
                }
        }
        if (!isExist){
            System.out.println("Khong tim thay " + inputName + " trong danh sach");
        }
    }
}
