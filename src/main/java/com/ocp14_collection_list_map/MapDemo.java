package com.ocp14_collection_list_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>(); 
//同HashSet 透過 HashMap(隨機擺放) 或 LinkedHashMap(照順序擺放)
        map.put("國",100);
        map.put("英",90);
        map.put("數",100);
        System.out.println(map);
        System.out.println(map.get("英"));
        System.out.println(map.keySet());//keyset:取出所有key值
        System.out.println(map.values());//values:取出所有的values值
        for(String key : map.keySet()){
            System.out.println(key + "分數" + map.get(key));
        }
        //Java 8
        map.entrySet().forEach(e-> System.out.println(e.getKey()+"= "+ e.getValue()));
        //計算總分
        int sum=map.entrySet().stream().mapToInt(e -> e.getValue()).sum();
        //map 要進入evtrySet 才可進行java 8 stream
        System.out.println(sum);
        
    }
    
}
