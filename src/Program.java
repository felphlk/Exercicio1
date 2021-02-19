import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        System.out.print("Multiplicando: ");
        Scanner a= new Scanner(System.in);
        int multiplicando=a.nextInt();
        if(multiplicando<0 || multiplicando>3000){
            System.out.println("Multiplicando maior que 3000 ou menor que 0");
        }
        else{
            System.out.print("Início do intervalo: ");
            int inicio=a.nextInt();
            System.out.print("Fim do intervalo: ");
            int fim=a.nextInt();
            if(fim-inicio>=10){
                System.out.println("Intervalo não pode ser maior ou igual a 10");
            }
            else if(fim>3000 || fim<0 || inicio <0 || inicio>3000){
                System.out.println("Fim ou inicio não podem ser negativo ou maior que 3000");
            }
            else if(inicio>=fim){
                System.out.println("Inicio não pode ser maior ou ter o mesmo valor que o fim ");
            }
            else {
                System.out.println(inicio);
                for (int i = 0; i < (fim - inicio) + 1; i++) {
                    System.out.println(multiplicando + " x " + (inicio + i) + " = " + multiplicando * (inicio + i));
                }
            }
        }

    }
}
