public class Exercicio6 {
    public static void main(String[] args) {
        int d = 29, m = 2, a = 2023; // Exemplo inválido
        boolean valida = true;

        if (a < 1 || m < 1 || m > 12 || d < 1) {
            valida = false;
        } else {
            int diasNoMes;
            if (m == 2) diasNoMes = 28;
            else if (m == 4 || m == 6 || m == 9 || m == 11) diasNoMes = 30;
            else diasNoMes = 31;

            if (d > diasNoMes) valida = false;
        }

        System.out.println("Data: " + d + "/" + m + "/" + a + " -> " + (valida ? "Válida" : "Inválida"));
    }
}