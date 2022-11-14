package org.example;
import java.util.*;

public class Problem1 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for(int i : numlist){
            if(i % n == 0){
                answer.add(i);
            }
        }
        int [] result = answer.stream().mapToInt(i -> i).toArray();
        return result;
    }
}
