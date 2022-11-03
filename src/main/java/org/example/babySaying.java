package org.example;

public class babySaying {
    public static int solution(String[] babbling) {
        String [] baby = {"aya","ye","woo","ma"};

        int cnt = 0;
        int answer = 0;
        String changeStr = "";

        while(cnt < babbling.length){
            String babblingStr = babbling[cnt];
            for(int i = 0; i < baby.length ; i++){
                String babyStr = baby[i];
                if(babblingStr.contains(babyStr)) {
                    babblingStr = babblingStr.replace(babyStr, ".");
                }
            }
            babblingStr = babblingStr.replace(".","");
            if(babblingStr.length()==0){
                answer++;
            }
            cnt++;
        }

        return answer;
    }
    public static void main(String [] args){
        int a = solution(new String[]{"ayaye","uuuma", "ye", "yemawoo", "ayaa"});
        System.out.println("int a ==> " + a);
    }


}

