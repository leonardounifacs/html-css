import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
   

         Scanner ler = new Scanner(System.in);
         int soma = 0;
         double media;
         int[] numeros = new int [5];

        for( int i = 0 ; i < 5 ; i++){
            System.out.print("Digite o " + (i+1) + "º numeros: ");
            numeros[i] = ler.nextInt();
            soma += numeros[i];
        }

        System.out.println("Soma: " + soma);
        media = soma / 5;
        System.out.println("Media: " + media);


        double checkAmount = 1257.63;
        System.out.print("Pay to the order of ");
        System.out.print("Dr. barry burd ");
        System.out.print(" $ ");
        System.out.println(checkAmount);

         


          
    
    }
}
