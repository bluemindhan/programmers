package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyProblem {

    // 숫자 비교하기 (같으면 1, 다르면 -1 출력)
    public int solution1(int num1, int num2) {
        int answer = 0;
        if(num1 == num2){
            answer = 1;
        } else answer = -1;
        return answer;
    }

    // 나머지 구하기
    public int solution2(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }

    //  나이를 통해 출생년도 구하기
    public int solution3(int age) {
        int answer = 2022-age+1;
        return answer;
    }

    // 두수의 합
    public int solution4(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    // 각도기
    public int solution5(int angle) {
        int answer = 0;
        if(angle > 0 && angle < 90){
            answer = 1;
        } else if(angle == 90){
            answer = 2;
        } else if(angle > 90 && angle < 180){
            answer = 3;
        } else answer = 4;

        return answer;
    }
    
    // 짝수의 합 구하기
    public int solution6(int n) {
        int answer = 0;
        for(int i = 0 ; i <= n ; i++){
            if(i % 2 == 0){
                answer += i;
            }
        }

        return answer;
    }


    // 배열의 평균값 구하기
    public double solution7(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for(int i = 0 ; i < numbers.length; i++){
            sum += numbers[i];
        }
        answer = sum/numbers.length;

        return answer;
    }

    // 양꼬치 돈계산( 10개 시키면 서비스 음료 1개 k= 시켜야할 음료수개수)
    public int solution8(int n, int k) {
        int service = n/10;
        k = k - service;
        int answer = n*12000 + k*2000;
        return answer;
    }


    // 나눠서 나온 소수 값을 다시 정수로 곱하기
    public int solution9(int num1, int num2) {
        double num = (double)num1/num2;
        int answer = (int)(num*1000);
        return answer;
    }

    // 머쓱이(height) 보다 큰 사람(int[] array)의 수
    public int solution10(int[] array, int height) {
        int answer = 0;
        for(int i : array){
            if(i > height ){
                answer ++;
            }
        }
        return answer;
    }

    // 짝수의 갯수, 홀수의 갯수 배열에 넣기
    public int[] solution11(int[] num_list) {
        int even = 0, odd = 0;
        for(int i : num_list){

            if(i%2 == 0){
                even ++;
            } else odd++;

        }
        int[] answer = {even,odd};
        return answer;
    }

    // 배열 뒤집기
    public int[] solution12(int[] num_list) {
        int[] answer = new int[num_list.length];
        int plus = 0;
        for(int i = num_list.length-1; i >= 0 ; i--){
            answer[plus] = num_list[i];
            plus++;
        }
        return answer;
    }

    // 편지 가로 길이
    public int solution13(String message) {
        int answer = message.length() * 2;
        return answer;
    }

    // 문자열 뒤집기
    public String solution14(String my_string) {
        String answer = "";
        for(int i = 0 ; i<my_string.length(); i++){
            answer += my_string.charAt(my_string.length()-i-1);
        }
        return answer;
    }

    // 첫번째 최댓값 두번재 최댓값 곱하기
    public int solution15(int[] numbers) {
        int answer = 0;

        for(int i : numbers){
            for(int j: numbers){
                if(answer < i*j) answer = i*j;
            }
        }
        return answer;
    }
    // Arrays.sort를 사용하면 훨신 편하게 정리 가능
    public int solution151(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }

    // 아이스 아메리카노
    public int[] solution16(int money) {
        int division = money/5500;
        int Remainder = money%5500;
        int[] answer = {division,Remainder};
        return answer;
    }

    // 배열 자르기 (num1에 입력받은 인덱스 값부터 num2에 입력받은 인덱스 값까지 출력)
    public int[] solution17(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers,num1,num2+1);
        return answer;
    }



}
