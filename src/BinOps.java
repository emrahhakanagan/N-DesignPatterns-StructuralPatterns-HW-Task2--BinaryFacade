public class BinOps {
    public String sum(String a, String b) {
        // (Переводит двоичные числа из строки в int суммирует и переводит обратно в двоичную строку)
        int numberA = Integer.parseInt(a, 2);
        int numberB = Integer.parseInt(b, 2);
        int sum = numberA + numberB;
        return Integer.toBinaryString(sum);
    }

    public String mult(String a, String b) {
        // (Переводит двоичные числа из строки в int перемножает и переводит обратно в двоичную строку)
        int numberA = Integer.parseInt(a, 2);
        int numberB = Integer.parseInt(b, 2);
        int product = numberA * numberB;
        return Integer.toBinaryString(product);
    }
}
