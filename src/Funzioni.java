import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Funzioni {
    File file=new File("Regioni.csv");
    //Metodo che si occupa di caricare il contenuto del file in memoria
    public ArrayList<String> carica(){
        ArrayList<String>contenutoFile=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader("Regioni.csv"))){
            String linea;
            br.readLine();
            while ((linea=br.readLine())!=null){
                String[]campi=linea.split(";");
                int anno=Integer.parseInt(campi[0]);
                String regione=campi[1];
                double percentuale=Double.parseDouble(campi[2]);
                contenutoFile.add(anno+";"+regione+";"+percentuale);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return contenutoFile;
    }
    public ArrayList<String> visualizzaRegioniCSV(){
        ArrayList<String>contenutoRegioniCSV=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader("Regioni.csv"))) {
            String linea;
            while ((linea=br.readLine())!=null){
                contenutoRegioniCSV.add(linea);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return contenutoRegioniCSV;
    }
}