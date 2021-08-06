public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a, b);
        if (c != Integer.MAX_VALUE) {
            calc.println.accept(c);
        } else System.out.println("Результат операции не определён");
        calc.println.accept(calc.multiply.apply(4, 3));
        calc.println.accept(calc.pow2.apply(5));
        System.out.println(calc.isPositive.test(9));
        calc.println.accept(calc.abs.apply(-13));

        System.out.println("\nВыход из программы...");
    }
}
