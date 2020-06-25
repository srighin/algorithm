package leet;

public class SplitStringToBalanceTree {

    public static void main(String[] args) {
        String str  = "LRRRLLLR";
        int balanceCount  = balanceCount(str);
        System.out.println(balanceCount);
    }

    private static int balanceCount(String str) {

        int balanceCount = 0;
        int count = 0;

        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == 'L'){
                count++;
            } else{
                count --;
            }

            if(count == 0){
                balanceCount++;
            }
        }

        return balanceCount;
    }
}
