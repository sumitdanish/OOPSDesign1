package com.test.devideAndConqure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class SkylineProblem {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("sky.txt"));
        int size = sc.nextInt();
        BuildingPoint[] b = new BuildingPoint[2*size];
        int index = 0;
        while(sc.hasNext()){
            String[] s = sc.next().toString().split(",");
            int x1 = Integer.parseInt(s[0]);
            int x2 = Integer.parseInt(s[1]);
            int h = Integer.parseInt(s[2]);
            b[index] = new BuildingPoint();
            b[index].x = x1;
            b[index].height = h;
            b[index].isStart = true;

            b[index+1] = new BuildingPoint();
            b[index+1].x = x2;
            b[index+1].height = h;
            b[index+1].isStart = false;
            index += 2;
        }
        Arrays.sort(b);
        getPoint(b);
    }

    private static void getPoint(BuildingPoint[] bp){
        List<int[]> result = new ArrayList<>();
        TreeMap<Integer,Integer> queue = new TreeMap<>();
        queue.put(0,1);
        int prevMax = 0;
        for(BuildingPoint b : bp){
            if(b.isStart){
                queue.compute(b.height,(key,value) ->{
                   if(value != null){
                       return value+1;
                   }
                   return 1;
                });
            }else{
                queue.compute(b.height,(key,value) -> {
                   if(value == 1){
                       return null;
                   }
                   return -1;
                });
            }
            int c = queue.lastKey();
            if(prevMax != c){
                result.add(new int[]{b.x,c});
                prevMax = c;
            }
        }
        System.out.println(result.size());
        for(int[] v : result){
            System.out.println(v[0]+","+v[1]);
        }
    }

    static class BuildingPoint implements Comparable<BuildingPoint>{

        int x;
        int height;
        boolean isStart;


        @Override
        public int compareTo(BuildingPoint o) {
            if(this.x != o.x){
                return this.x - o.x;
            }
            return (this.isStart ? -this.height : this.height) - (o.isStart ? -o.height : o.height);
        }
    }
}



