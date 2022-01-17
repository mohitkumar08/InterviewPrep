package com.example.lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mohit Kumar
 * @created 11/01/22}
 */
public class GroupAnagram
{
    public static void main(String ar[])
    {
        String  input[] = new String[]{"eat","tea","tan","ate","nat","bat"};
        HashMap<String, List<String>> group = new HashMap<>();

        for (String s:input) {
            int count[] = new int[26];
            StringBuilder temp = new StringBuilder();

            for (char c : s.toCharArray())
            {
                count[c - 'a']++;
            }
            for(int i=0;i<26;i++){
                temp.append("#").append(count[i]);
            }

            if (group.containsKey(temp.toString())){
                group.get(temp.toString()).add(s);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                group.put(temp.toString(),list);
            }
        }
        for (Map.Entry<String,List<String>> entry : group.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }
}