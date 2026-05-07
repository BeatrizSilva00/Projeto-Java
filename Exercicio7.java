public class Exercicio7 {
    public static void main(String[] args) {
        double soma = 0, nota = 0;
        int contador = 0;

        System.out.println("Digite as notas (ou -1 para calcular a média):");

        while (true) {
            System.out.print("Nota: ");
            nota = Console.readDouble();

            if (nota == -1) break;

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                contador++;
            } else {
                System.out.println("Nota inválida! Digite novamente.");
            }
        }

        if (contador > 0) {
            System.out.printf("Média das %d notas: %.2f\n", contador, (soma / contador));
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
    }
}