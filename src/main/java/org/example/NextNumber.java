package org.example;

public class NextNumber {
    public static int solution(int[] common) {
        int answer = 0;
        int Operator = 0;

        if((common[1] - common[0]) == common[2]-common[1]){
            Operator = common[1]-common[0];
            answer = max(common) + Operator;
        } else if(common[1] / common[0] == common[2] / common[1]){
            Operator = common[1] / common[0];
            answer = max(common) * Operator;
        }
        return answer;
    }

    public static int max(int[] common){
        int max = 0;
        for(int i = 0; i < common.length ; i++){
            if(max < common[i])
                max = common[i];
        }
        return max;
    }

    public static void main(String [] args){
        int a = solution(new int[]{2,4,8});
        System.out.println(a);
    }
}
