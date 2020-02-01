package com.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter pattern:");
        String patternStr = in.nextLine();

        Pattern pattern = Pattern.compile(patternStr);

        while (true){
            System.out.println("Enter String to match:");
            String input = in.nextLine();
            if (input == null || input.equals("")){
                return;
            }
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()){
                System.out.println("Match");
                int g = matcher.groupCount();
                if (g > 0){
                    for (int i = 0; i < input.length() ; i++) {
                        for (int j = 1; j < g ; j++) {
                            if (i == matcher.start(j) && i == matcher.end(j)) {
                                System.out.println("()");
                            }
                        }
                            for (int j = 1; j < g ; j++) {
                                if (i == matcher.start(j) && i != matcher.end(j)){
                                    System.out.println("(");
                            }
                        }
                                System.out.println(input.charAt(i));
                            for (int j = 1; j < g; j++) {
                                if (i + 1 != matcher.start(j) && i +1 == matcher.end(j)){
                                    System.out.println(")");
                                }
                            }
                        System.out.println();
                    }
                }else {
                    System.out.println("No Match");
                }
            }
        }
    }
}
