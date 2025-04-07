import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int primeiro = Integer.parseInt(scan.next());
        System.out.println("Digite o segundo parâmetro");
        int segundo = Integer.parseInt(scan.next());
        try{
            contar(primeiro,segundo);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }


    }
    public static void contar(int primeiro, int segundo) throws ParametrosInvalidosException{
        int contador = segundo - primeiro;
        if(contador < 0) {
            throw new ParametrosInvalidosException("O segundo deve ser maior que o primeiro");
        }
        else {
            for (int i = 0; i < contador; i++) {
                System.out.println("Imprimindo o numero " + (i + 1));
            }
        }
    }
}
