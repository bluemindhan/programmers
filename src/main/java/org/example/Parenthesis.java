package org.example;

import java.util.Collections;
import java.util.PriorityQueue;


public class Parenthesis {

        static boolean solution(String s) {

            int openCount = 0;
            int closeCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    openCount++;
                }
                if (s.charAt(i) == ')') {
                    closeCount++;
                }
                if (openCount < closeCount) {
                    return false;
                }
            }
            if (openCount == closeCount) {
                return true;
            }
            return false;
        }
    public static void main(String[] args) {
        String s = "()()";
        boolean a = solution(s);
        System.out.println(a);
    }
}
