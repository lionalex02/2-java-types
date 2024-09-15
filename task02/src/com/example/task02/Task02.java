package com.example.task02;

import org.graalvm.compiler.nodes.debug.StringToBytesNode;

public class Task02 {

    public static String solution(String input) {
         int count = 0;
        try {
            byte b = Byte.parseByte(input);
            return "byte";
        }
        catch (NumberFormatException e)
            {try {
                short s = Short.parseShort(input);
                return "short";
            }
            catch (NumberFormatException e1){
                try {
                    int i = Integer.parseInt(input);
                    return "int";
                }
                catch (NumberFormatException e2){
                    try {
                        long l = Long.parseLong(input);
                        return "long";
                    }
                    catch (NumberFormatException e3){
                        return "Invalid! I need numbers!";
                    }


                }
            }
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("" + Short.MIN_VALUE /2  );
        System.out.println(result);

    }

}
