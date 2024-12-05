/* author =@KALI */
public class Rank extends Output_Marks {
    static String Check_PF() {
        for (int i = 0; i < Mark.length; i++) {
            if (Mark[i] >= 35) {
                PF = true;
            } else {
                PF = false;
                break;
            }
        }
        if (PF == true) {
            System.out.println("😎🧐PASS😎🧐");
        } else
            System.out.println("😭😱FAIL😱😭");
     return "";
    }

    static char Rankf() {
        if (avg > 90 && avg <= 100) {
            System.out.println("Grade ");
            return 'A';
        } else if (avg >= 80 && avg <= 90) {
            System.out.println("Grade ");
            return 'B';
        } else if (avg < 80 && avg >= 70) {
            System.out.println("Grade ");
            return 'C';
        } else if (avg < 70 && avg >= 50) {
            System.out.println("Grade ");
            return 'D';
        }
        else
        System.out.println("Grade ");
        return 'F';

    }
}
