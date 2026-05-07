public class Exercicio4 {
    public static void main(String[] args) {
        int anterior = 0, atual = 1;
        System.out.print("Fibonacci (15 termos): " + anterior + ", " + atual);
        
        for (int i = 3; i <= 15; i++) {
            int proximo = anterior + atual;
            System.out.print(", " + proximo);
            anterior = atual;
            atual = proximo;
        }
    }
}
