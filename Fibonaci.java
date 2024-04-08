public class Fibonaci {
    public static void main(String[] args) {
        int ultimo = 1;
        int penultimo = 1;
        int proximo = 0;

        while(proximo !=13){
            penultimo = ultimo;
            ultimo = proximo;
            proximo = penultimo + ultimo;
            System.out.println(proximo + " ");

        }
    }
}
