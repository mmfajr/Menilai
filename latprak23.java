package praktikum;

import java.util.Scanner;

public class latprak23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilai;
        String grade;
        
        System.out.print("Masukkan nilai : "); nilai = input.nextInt();
        
        if (nilai >= 91) {
            grade = "A";
        }
        
        else if (nilai >= 86) {
            grade = "B";
        }
        
        else if (nilai >= 70) {
            grade = "C";
        }
        
        else {
            grade = "D";
        }
        System.out.println("Grade : " + grade);
    }
}
