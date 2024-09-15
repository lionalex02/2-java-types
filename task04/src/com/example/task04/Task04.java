package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return (float) a / b;
            default:
                System.out.println("Invalid operation");
                break;
        }
            return 0;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(1234, 234, "-");
        System.out.println(result);

    }

}
