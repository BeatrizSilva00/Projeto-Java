public class Exercicio2 {
    public static void main(String[] args) {

        System.out.print("1. Inteiros (10-25): ");
        for (int i = 10; i <= 25; i++) {
            System.out.print(i + " ");
        }

        int soma = 0;
        for (int i = 1; i <= 100; i += 2) {
            soma += i;
        }
        System.out.println("\n2. Soma (1, 3... 99): " + soma);

        System.out.print("3. Sequência (soma < 100): ");
        int s = 0, n = 0;
        while (s + n < 100) {
            System.out.print(n + " ");
            s += n;
            n++;
        }

        System.out.println("\n4. Tabuada do 9:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("9 x " + i + " = " + (9 * i));
        }
    }
}