/* author =@KALI */
public class User_Marks extends  Marks{
    static int Set_Marks() {
        for (int i = 0; i < Mark.length; i++) {
            System.out.print("Enter Your " + subject[i] + " Mark :");
            Mark[i] = mark.nextInt();
        }
        return 0;
    }

    static int Set_Total_Marks() {
        for (int i = 0; i < Mark.length; i++) {
            total += Mark[i];
        }
        avg = total / Mark.length;
        return 0;
    }
}
