package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] arrStr = sentence.toLowerCase().split("[^\\p{L}]+");

        Set<String> set = new HashSet<>();
        for(String s : arrStr){
            set.add(s);
        }

        Map<String, Integer> map = new HashMap<>();

        for(String s : set){
            int i = 0;
            for(String s_2 : arrStr){
                if(s_2.equals(s)) {
                    i++;
                }
            }
            if(!s.equals(""))
                map.put(s, i);
        }
        return map;
    }


}
