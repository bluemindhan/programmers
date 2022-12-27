package org.example;

import java.util.*;

public class MinimumLv2 {
    public static int solution(int[] A, int[] B)
    {
        int answer = 0;
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < A.length ; i++){
            a.add(A[i]);
            b.add(B[i]);
        }

        while(!a.isEmpty()){
            answer += a.poll() * b.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        int [] a = {1,2};
        int [] b = {3,4};
        int result = solution(a,b);
        System.out.println(result);
    }
}
