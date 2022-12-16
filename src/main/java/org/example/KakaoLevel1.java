package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class KakaoLevel1 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int reportcnt = 0;
        Map<String, HashSet<String>> reportedtInfo = new HashMap<>(); // 신고당한 (key) 신고한 사람(value) 사람 정보보기
        Set<String> reportMany = new HashSet<>();      // k번이상 신고당한사람
        List<String> reporterInfo = new ArrayList<>();      // 신고 한 사람

        for (String s : report){
            String [] splitList = s.split(" ");
            String reporter = splitList[0];     //신고 한 사람
            String reported = splitList[1];     //신고 당한 사람
            // 신고당한 사람 정보저장

            if(k == 1){
                reportMany.add(reported);
            }

            if(reportedtInfo.containsKey(reported)){
                    reportedtInfo.get(reported).add(reporter);
                    if(k <= reportedtInfo.get(reported).size()) reportMany.add(reported);
            }
            else {
                reportedtInfo.put(reported, new HashSet<>(){{add(reporter);}});
            }
        }
        for (String s : reportMany){
            Iterator it = reportedtInfo.get(s).iterator();

            while(it.hasNext()){
                String a = (String) it.next();
                reporterInfo.add(a);
            }
        }
        for (String s : id_list){
            answer[reportcnt] = Collections.frequency(reporterInfo, s);
            reportcnt++;
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args) {
        String [] a = {"muzi", "apeach1", "apeach", "neo"};
        String [] b = {"muzi frodo", "apeach frodo", "apeach neo", "muzi neo" , "apeach ne1" , "apeach ne1", "apeach1 ne1", "apeach1 1"};
        int[] ab = solution(a, b, 1);
//        System.out.println(ab);
    }
}
