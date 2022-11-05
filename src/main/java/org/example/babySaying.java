package org.example;

public class babySaying {
    public static int solution(String[] babbling) {
        int answer = 0;
        for(String i : babbling){
            String defaultBabbling = i;

            if(defaultBabbling.contains("aya")) i = i.replaceFirst("aya","");
            System.out.println("aya - > "  + i);
            if(defaultBabbling.contains("ye")) i = i.replaceFirst("ye","");
            System.out.println("ye - > "  + i);
            if(defaultBabbling.contains("woo")) i = i.replaceFirst("woo","");
            System.out.println("woo - > "  + i);
            if(defaultBabbling.contains("ma")) i = i.replaceFirst("ma","");
            System.out.println("ma - > "  + i);
            if(i.equals("")){
                answer++;
            }
        }

        return answer;
    }
    public static void main(String [] args){
        int a = solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        System.out.println("int a ==> " + a);
    }


}

