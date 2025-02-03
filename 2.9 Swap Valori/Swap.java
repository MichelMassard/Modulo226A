public class Swap {
    public static void main(String[] args) {
        int varA = Integer.parseInt(args[0]);
        int varB = Integer.parseInt(args[1]);
        int swap = varA;
        varA = varB;
        varB = swap;
        System.out.println("Variabile A: " + varA);
        System.out.println("Variabile B: " + varB);
    }
}