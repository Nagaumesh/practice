import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        System.out.println("--------------Student-Grade-Calculator--------------\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("input number of subjects: ");
        int num = sc.nextInt();
        int marks[] = new int[num];
        // System.out.println("kindly enter your marks ");
        int totalmarks = 0;
        // input
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter your marks for subject-" + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalmarks += marks[i];
        }
        // totalmarks and average percentage
        System.out.println("\n\n---------Results---------\n  ");
        System.out.println("total marks:" + totalmarks + "/" + num * 100);
        System.out.println("Average percentage: " + totalmarks / num);

        // grade assigning
        for (int i = 0; i < marks.length; i++) {
            int val = marks[i];
            if (val >= 90) {
                System.out.println("Grade obtained in subject number-" + (i + 1) + " is: " + "S");
            } else if (val >= 80 && val < 90) {
                System.out.println("Grade obtained in subject number-" + (i + 1) + " is: " + "A");
            } else if (val >= 70 && val < 80) {
                System.out.println("Grade obtained in subject number-" + (i + 1) + " is: " + "B");
            } else if (val >= 60 && val < 70) {
                System.out.println("Grade obtained in subject number-" + (i + 1) + " is: " + "C");
            } else if (val >= 50 && val < 60) {
                System.out.println("Grade obtained in subject number-" + (i + 1) + " is: " + "D");
            } else {
                System.out.println("Grade obtained in subject" + (i + 1) + " is: " + "F");
            }
        }

    }
}
