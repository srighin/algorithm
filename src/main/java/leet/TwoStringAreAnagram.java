package leet;

public class TwoStringAreAnagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "grambna";

        if(str1.length() == str2.length()){

            int [] lookup = new int[128];
            for(int i=0; i< str1.length(); i++){
                lookup[str1.charAt(i) - 'a']++;
                lookup[str2.charAt(i) - 'a']--;
            }

            for(int i: lookup){
                if(i != 0){
                    System.out.println("Not Anagram");
                    return;
                }
            }
            System.out.println("is Anagram");
        }
        System.out.println("Not Anagram");
    }
}
