import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Funzioni funzioni=new Funzioni();
        int scelta;
        do{
            System.out.println("1 - Carica il contenuto del file in memoria\n" +
                    "2 - Visualizza il contenuto del file Regioni.csv\n" +
                    "0 - Uscita");
            System.out.print("Inserisci la tua scelta: ");
            scelta=input.nextInt();
            switch (scelta){
                case 1:{
                    funzioni.carica();
                    System.out.println("Contenuto del file caricato in memoria");
                    break;
                }
                case 2:{
                    ArrayList<String>contenutoRegioniCSV=funzioni.visualizzaRegioniCSV();
                    for(String riga:contenutoRegioniCSV){
                        System.out.println(riga);
                    }
                    break;
                }
                default:System.out.println("Scelta non disponibile");
            }
        }while (scelta!=0);
    }
}