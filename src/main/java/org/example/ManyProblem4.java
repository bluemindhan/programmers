package org.example;

public class ManyProblem4 {
    // 가장 큰 수 인덱스 값과
    public int[] solution(int[] array) {

        int max = 0; int index = 0;
        for(int i = 0 ; i < array.length ; i++ ){
            if(max < array[i]){
                max = array[i];
                index = i;
            }
        }
        int[] answer = {max, index};
        return answer;
    }
}
