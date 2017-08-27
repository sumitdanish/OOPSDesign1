package com.test.array;

/*
* http://www.geeksforgeeks.org/sort-an-array-according-to-absolute-difference-with-given-value/
* */

import java.util.*;

public class SortArrayAccordingToDiff {
    public static void main(String[] args) {
        int[] a = {10, 5, 3, 9, 2};
        int x = 7;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            map.put(i,Math.abs(7-i));
        }

        List<Map.Entry<Integer,Integer>> m = new ArrayList<>(map.entrySet());

        for(Map.Entry m1 : sortMap(m).entrySet()){
            System.out.println(m1.getKey()+" : "+m1.getValue());
        }
    }

    private static Map<Integer,Integer> sortMap(List<Map.Entry<Integer,Integer>> list){
        list.sort((o1,o2) -> o1.getValue().compareTo(o2.getValue()));

//        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
//
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(Map.Entry m : list){
            map.put((Integer) m.getKey(),(Integer)m.getValue());
        }
        return map;
        //static class SortMapByValue implements
    }
}
