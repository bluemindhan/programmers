package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManyProblem2 {

    // 배열 두배 만들기
    public int[] solution1(int[] numbers) {
        int[] answer = new int[numbers.length];
        for(int i = 0 ; i < numbers.length ; i++){
            answer[i] = numbers[i] * 2;
        }
        return answer;
    }

    // 삼각형의 완성조건 --> 가장 긴 변의 길이는 다른 두변의 길이의 합보다 작아야한다
    public int solution2(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        if(sides[sides.length-1] < sides[sides.length-2] + sides[sides.length-3]){
            answer = 1;
        } else answer = 2;
        return answer;
    }

    // 점의 위치 구하기 (1-4 사분면 어디에 속하는지?)
    public int solution3(int[] dot) {
        if(dot[0] < 0 && dot[1] > 0) return  2;
        else if(dot[0] < 0 && dot[1] < 0) return 3;
        else if(dot[1] < 0) return 4;
        else return 1;

    }

    // 특정 문자 제거하기
    public String solution4(String my_string, String letter) {
        return my_string.replace(letter,"");
    }


    // n만큼 각문자들 문자 반복
    public String solution5(String my_string, int n) {
        String answer = "";

        String [] result = my_string.split("");
        for(int i = 0 ; i < result.length ; i++){
            int cnt = 0;
            String result1 = result[i];
            while(cnt < n){
                answer += result1;
                cnt ++;
            }
        }
        return answer;
    }

    // 5번 문제에 대한 짧은 풀이로 변경

    public String solution51(String my_string, int n) {
        String answer = "";

        String [] result = my_string.split("");
        for(int i = 0 ; i < result.length ; i++){
            answer += result[i].repeat(n);
        }
        return answer;
    }


    // 옷가게 할인 받기
    public int solution6(int price) {

        if(price >= 500000) price*=0.8;
        else if(price >= 300000) price*=0.9;
        else if(price >= 100000) price*=0.95;


        return price;
    }

    // 문자열 안에 문자열 ( str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.)
    //"ab6CDE443fgh22iJKlmn1o"	"6CD"	1
    // "ppprrrogrammers"	"pppp"	2
    public int solution7(String str1, String str2) {
        if(str1.contains(str2)) return 1;
        else                     return 2;
    }

    // 배열 원소 일치 개수 출력
    public int solution8(String[] s1, String[] s2) {
        int answer = 0;
        for(String i : s1){
            for(String j : s2){
                if(i.equals(j)) answer++;
            }
        }
        return answer;
    }

    // 제곱근이 있을경우 1 없을경우 2
    public int solution9(int n) {
        int num = 1;
        int answer = 0;
        Boolean result = false;
        while(num<1000000){
            if(num*num == n) {
                result = true;
                break;
            }
            num++;
        }
        if(result == true) answer = 1;
        else               answer = 2;
        return answer;
    }

    // Math.sqrt 사용하면 훨씬 간단함
    public int solution91(int n) {
        if(n % Math.sqrt(n) == 0) return 1;
        else return 2;
    }


    // 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution10(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            if(i%2 != 0) list.add(i);
        }
        int[] answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }

    // 각자리수의 합
    public static int solution11(int n) {
        int answer = 0;
        while(n > 0){
            answer += n%10;
            System.out.println(answer);
            n /= 10;
            System.out.println("n->" + n);
        }
        return answer;
    }

    //순서쌍의 갯수 (약수를 구하면 됨)
    public int solution12(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int a = solution11(1234);
    }




}
