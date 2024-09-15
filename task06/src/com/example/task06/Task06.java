package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        int count = 0;

        if (sum == 0) {
            return 1;
        }
        while (sum != 0) {
            sum /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(625, 5324);
        System.out.println(result);
    }

}
