package org.example;

public class SequenceNumber {
    public static int[] solution(int num, int total) {
            int[] answer = new int[num];
            int a = total / num;
            int first = a - (num / 2);
            System.out.println("first = " + first);
            int end = a + (num / 2);

            if (num % 2 != 0) {
                first++;
            }

            for (int i = 0; i < num; i++) {
                answer[i] = first;
                first++;
            }
        return answer;
        }


    public static void main(String [] args){
        int [] a = solution(5,15);
        System.out.println(a);
    }
}
