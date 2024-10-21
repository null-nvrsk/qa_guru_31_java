package guru.qa;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
//        1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
//           посмотреть результаты (вывести в консоль)

        // Арифметические операторы + - / * % ++ --
        int a1Int = 7,
            a2Int = 7,
            a3Int = 7,
            a4Int = 7;
        out.println("12 % 7 = " + (12 % 7));

        out.println("7++ = " + a1Int++);
        out.println("++7 = " + ++a2Int);

        out.println("7-- = " + a3Int--);
        out.println("--7 = " + --a4Int);

        // Логические операторы &, |, &&, ||, !
        out.println("\nA && B");
        out.println("true  && true  = " + (true && true));
        out.println("true  && false = " + (true && false));
        out.println("false && true  = " + (false && true));
        out.println("false && false = " + (false && false));

        out.println("\nA || B");
        out.println("true  || true  = " + (true || true));
        out.println("true  || false = " + (true || false));
        out.println("false || true  = " + (false || true));
        out.println("false || false = " + (false || false));

        out.println("\n!A");
        out.println("!true  = " + !true);
        out.println("!false = " + !false);

        // переполнение при вычислениях
        int integerOverflow = 100_000 * 100_000;
        out.println("\n100.000 * 100.000 = " + integerOverflow + " (вместо 10.000.000.000)");

//        2) попробовать вычисления комбинаций типов данных (int и double)
        out.println("12 / 7 = ?");
        out.println("int    / int    = " + (12 / 7));
        out.println("double / int    = " + (12.0 / 7));
        out.println("int    / double = " + (12 / 7.0));
        out.println("double / double = " + (12.0 / 7.0));
    }
}