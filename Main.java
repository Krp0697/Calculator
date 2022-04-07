public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b); // Ошибка по причине деления на 0. Поменял переменную devide, при делении на ноль возвращает 0;
        // Также можно было обработать Arithmetic exception с выводом сообщения "Ошибка: деления на 0!",
        calc.println.accept(c);
    }
}
