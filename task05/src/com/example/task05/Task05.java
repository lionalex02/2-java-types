package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String str = Integer.toString(x);
        for (char c : str.toCharArray()){
            if(c % 2 != 0) {
                return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(12345);
        System.out.println(result);

    }

}
