package leet;

public class PlusOne {

    public static void main(String[] args) {
        int [] num = {0, 9, 9};

        int[] resultArray = plusOne(num);

        for(int i=0; i< resultArray.length;i++){
            System.out.print(resultArray[i]);
        }

    }

    private static int[] plusOne(int [] num){
        for (int i= num.length-1; i>=0; i--){
            if(num[i] < 9){
                num[i]+=1;
                return num;
            }
            num[i] = 0;
        }

        int [] resultArray = new int[num.length+1];
        resultArray[0] = 1;
        return resultArray;
    }
}
