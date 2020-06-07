package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public static void main(String[] args) {

        String [] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groupOfAnagram = groupOfAnagram(anagrams);
        for (List<String> group: groupOfAnagram){
            System.out.println(group);
        }

    }

    private static List<List<String>> groupOfAnagram(String [] strs){

        List<List<String>> groupOfAnagram =new ArrayList<>();
        Map<String, List<String>> lookup = new HashMap<>();

        for(String str: strs){
            char [] characters = str.toCharArray();
            Arrays.sort(characters);
            String sorted = new String(characters);

            if(!lookup.containsKey(sorted)){
                lookup.put(sorted, new ArrayList<>());
            }
            lookup.get(sorted).add(str);
        }
        groupOfAnagram.addAll(lookup.values());
        return  groupOfAnagram;
    }
}
