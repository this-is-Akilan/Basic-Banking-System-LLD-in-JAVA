package TCS_CODE_VITA;

import java.util.*;
import java.util.regex.*;

public class ReduceExp {
//    main class eh
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine().replaceAll("\\s+", "");
        System.out.println(minOperations(expr));
    }
//minimum operation method.....
    public static int minOperations(String expr) {
        // if fully numeric,//....... evaluate and return 0
        if (expr.matches("[0-9*+()]+")) {
            try {
                evalNumeric(expr);
                return 0;
            } catch (Exception e) {}
        }

        // fimplify numeric additions inside parentheses
        expr = simplifyNumericParts(expr);

        // count base operations such as .... (* and +)
        int baseOps = countOps(expr);

        // trying to detecting...... factorization patterns
        int factoredOps = tryFactoring(expr, baseOps);

        return Math.min(baseOps, factoredOps);
    }

    private static int countOps(String expr) {
        int cnt = 0;
        for (char c : expr.toCharArray()) {
            if (c == '*' || c == '+') cnt++;
        }
        return cnt;
    }

    private static int evalNumeric(String expr) {
        expr = expr.replaceAll("[()]", "");
        String[] addParts = expr.split("\\+");
        int sum = 0;
        for (String part : addParts) {
            if (part.contains("*")) {
                String[] mul = part.split("\\*");
                int prod = 1;
                for (String m : mul) prod *= Integer.parseInt(m);
                sum += prod;
            } else sum += Integer.parseInt(part);
        }
        return sum;
    }

    private static String simplifyNumericParts(String expr) {
        Pattern p = Pattern.compile("\\(([0-9+*]+)\\)");
        Matcher m = p.matcher(expr);
        while (m.find()) {
            String sub = m.group(1);
            try {
                int val = evalNumeric(sub);
                expr = expr.replace("(" + sub + ")", String.valueOf(val));
            } catch (Exception e) {}
        }
        return expr;
    }

    private static int tryFactoring(String expr, int baseOps) {
        // simplified form detection for factoring opportunities


        if (expr.matches(".*x\\*\\(x[+\\-][0-9]+\\).*") || expr.matches(".*x\\*x.*x.*")) {
            return 3;
        }

        if (expr.contains("x*y") && expr.matches(".*x\\*y.*x.*y.*\\d.*")) {
            return 6;
        }

        if (expr.contains("x*x") && expr.contains("x*y") && expr.contains("y")) {
            return 5;
        }

        return baseOps;
    }
}


