package basic;

public class CheckNumberIsArmstrong {
    public static void main(String[] args) {
        int number = 370;

        int sum = 0;
        int temp = number;

        int mod=0;
        while (temp > 0){
            temp = temp/10;
            mod++;
        }
        temp = number;
        int remainder = 0;

        while (temp > 0) {
            remainder = temp%10;
            int tempMod = mod;
            int multiply = 1;

            while (tempMod > 0){
                multiply *=remainder;
                tempMod--;
            }
            sum +=multiply;
            temp = temp/10;
        }

        System.out.println("Is Armstrong :: "+(sum == number));
    }
}
