/* author =@KALI */
public class Output_Marks extends Rank{
    static int Get_Marks() {
        
        for (int i = 0; i < Mark.length; i++) {
            System.out.println("Your " + subject[i] + " Mark is : " + Mark[i]);
        }
        return 0;
    }

    static int Get_AvgTot() {
        System.out.println("Your Average Mark is : " + avg);
        System.out.println("Your Total Mark is : " + total);
        return 0;
    }

}
