package org.example;

public class NextNumber {
    public static int solution(int[] common) {

            int answer = 0;

            int x = common[1] - common[0];
            int y = common[2] - common[1];

            if (x == y) {
                answer = common[common.length - 1] + y;
            } else {
                answer = common[common.length - 1] * common[2] / common[1];
            }

            return answer;




//        int answer = 0;
//        int Operator = 0;
//        int a = common[common.length-1]-common[common.length-2];
//        System.out.println("a--> " + a);
//        int b = common[common.length-2]-common[common.length-3];
//        System.out.println("b--> " + b);
//
//        if(a == b){
//            Operator = common[1]-common[0];
//            System.out.println(Operator);
//            answer = max(common) + Operator;
//        }
//        else {
//            Operator = common[common.length-1] / common[common.length-2];
//            answer = max(common) * Operator;
//        }
//
//        return answer;
//    }
//
//    public static int max(int[] common){
//        int max = common[0];
//        int min = common[0];
//
//        for(int i = 0; i < common.length ; i++){
//            if(max < common[i])
//                max = common[i];
//            System.out.println("max - > " + max);
//            if(min > common[i])
//                min = common[i];
//            System.out.println("min -> " + min);
//            if(common[common.length-1] < common[common.length-2]){
//                max = min;
//            }
//        }
//
//        return max;
    }

    public static void main(String [] args){
        int a = solution(new int[]{2,4,8,16});
        System.out.println(a);
    }
}
