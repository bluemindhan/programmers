package org.example;

import java.util.Arrays;

public class ManyProblem3 {

    // 세균증식 n 2배씩 t번까지 늘어남
    public int solution1(int n, int t) {
        for(int i = 0 ; i < t ; i++){
            n *= 2;
        }
        return n;
    }

    //모음 제거하기
    public String solution2(String my_string) {
        String answer = my_string.replace("a","")
                .replace("e","")
                .replace("i","")
                .replace("o","")
                .replace("u","");
        return answer;
    }
    
    // 문자열에서 숫자를 추출해서 각자리의 합 구하기
    public static int solution3(String my_string) {
        int answer = Integer.parseInt(my_string.replaceAll("[^0-9]",""));
        int sum = 0;
        System.out.println(answer);
        while(answer > 0 ){
            sum += answer % 10;
            System.out.println(sum);
            answer /= 10;
        }
        return sum;
    }


    // hp체력에 따라 몇명의 개미를 파견할건지 ( 5 공격력 3공격력 1공격력)
    public int solution4(int hp) {
        int answer = hp/5;
        hp %= 5;

        answer += hp/3;
        hp %= 3;

        answer += hp;
        return answer;
    }

    // 중간 값 구하기
    public int solution5(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }


    public int[] solution6(String my_string) {
        String[] answerStr = my_string.replaceAll("[^0-9]","").split("");
        int [] answer =  Arrays.stream(answerStr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(answer);
        return answer;
    }

    // 가위바위보 2면 0으로 출력 5면 2로 출력
    public static String solution7(String rsp) {
        String [] answerList = rsp.split("");
        String answer = "";
        for(int i = 0 ; i < answerList.length ; i++){
            if(answerList[i].equals("2")) answer += "0";
            else if(answerList[i].equals("5")) answer += "2";
            else answer += "5";
        }
        return answer;
    }

    public String solution8(String my_string) {
        String answer = "";
        for(int i = 0 ; i < my_string.length() ; i ++){
            char charStr = my_string.charAt(i);
            if(charStr >= 65 && charStr <=90){
                answer += Character.toLowerCase(charStr);
            } else if (charStr >=  97 && charStr <=122) {
                answer += Character.toUpperCase(charStr);
            }

        }


        return answer;
    }


    
    
    
    public static void main(String[] args) {
        String a = solution7("205");
        System.out.println(a);
    }


}
