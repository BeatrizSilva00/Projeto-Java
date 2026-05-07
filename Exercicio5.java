public class Exercicio5 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Usando if-else:");
        processarIfElse(x);
        
        System.out.println("\nUsando switch:");
        processarSwitch(x);
    }

    static void processarIfElse(int x) {
        while (x <= 1000) {
            if (x % 2 == 0) x += 5;
            else x *= 2;
            System.out.print(x + (x <= 1000 ? ", " : "\n"));
        }
    }

    static void processarSwitch(int x) {
        while (x <= 1000) {
            switch (x % 2) {
                case 0: x += 5; break;
                default: x *= 2; break;
            }
            System.out.print(x + (x <= 1000 ? ", " : "\n"));
        }
    }
}