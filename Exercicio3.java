public class Exercicio3 {
    public static void main(String[] args) {
        int n = 5; // Exemplo
        System.out.println("Fatorial de " + n);
        System.out.println("Iterativo: " + fatorialIterativo(n));
        System.out.println("Recursivo: " + fatorialRecursivo(n));
    }

    public static long fatorialIterativo(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static long fatorialRecursivo(int n) {
        if (n == 0) return 1;
        return n * fatorialRecursivo(n - 1);
    }
}
