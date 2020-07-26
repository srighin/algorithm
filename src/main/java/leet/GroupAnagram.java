package leet;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {

        String [] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        //List<List<String>> groupOfAnagram = groupOfAnagram(anagrams);
        List<List<String>> groupOfAnagram = groupAnagram(Arrays.asList(anagrams));
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

    private static List<List<String>> groupAnagram(List<String> words){

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> lookup = new HashMap<>();
        for (String str : words) {
            char[] tempString = str.toCharArray();
            Arrays.sort(tempString);
            String sortedString = new String(tempString);

            if(!lookup.containsKey(sortedString)){
                lookup.put(sortedString, new ArrayList<>());
            }
            lookup.get(sortedString).add(str);
        }
        result.addAll(lookup.values());
        return result;
    }
}
