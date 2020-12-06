package leet;

public class IsAnagram {

    public static void main(String[] args) {
        String s1 = "AABBaa";
        String s2 = "aaBBAC";

        boolean isAnagram = isAnagram(s1, s2);
        System.out.println(isAnagram);
    }

    private static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()){
            return false;
        }
        int counter = 0;
        int [] lookup = new int[127];
        while(counter < s1.length()){
            lookup[s1.charAt(counter) ] ++;
            lookup[s2.charAt(counter) ] --;
            counter++;
        }

        for(int i : lookup){
            if(i > 0){
                return false;
            }
        }


        return true;
    }
}
