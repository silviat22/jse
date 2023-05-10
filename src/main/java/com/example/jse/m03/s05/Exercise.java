package com.example.jse.m03.s05;

public class Exercise {
    static boolean hasX(String s) {
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == 'x') {
                return true;
            }
        }
        return false;
    }

    static int countX(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == 'x') {
                result = result + 1; // result += 1; result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String example = "asdfghjk";
        if (args.length > 0) {
            example = args[0];

        }
        System.out.println("uso la stringa: " + example);

        boolean flag = hasX(example);
        System.out.println(flag);

        int count = countX("aghsjskk");
        System.out.println(count);

        count = countX(example);
        System.out.println(count);
    }
}
