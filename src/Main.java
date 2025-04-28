import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Funzioni funzioni=new Funzioni();
        int scelta;
        do{
            System.out.println("1 - Carica il contenuto del file in memoria\n" +
                    "0 - Uscita");
            System.out.print("Inserisci la tua scelta: ");
            scelta=input.nextInt();
            switch (scelta){
                case 1:{
                    funzioni.carica();
                    System.out.println("Contenuto del file caricato in memoria");
                }
            }
        }while (scelta!=0);
    }
}