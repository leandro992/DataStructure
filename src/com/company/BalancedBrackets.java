package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BalancedBrackets {


    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("{[{((({}{({({()})()})[]({()[[][{-truncated-}");


        for (int tItr = 0; tItr < list.size(); tItr++) {

            String result = isBalanced(list.get(tItr));
            System.out.println(result);
        }


    }

    static String isBalanced(String s) {
        String NO = "NO";
        String YES = "YES";
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
                continue;
            }
            if (stack.isEmpty()){
                return NO;
            }
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return NO;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return NO;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return NO;
                    break;
            }
        }
        return YES;
    }


}
