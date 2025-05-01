import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    //Il metodo ordina() crea il report ordinato
    public void ordina(){
        ArrayList<String>contenuto=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader("Regioni.csv")); BufferedWriter bw=new BufferedWriter(new FileWriter("dati.csv"))) {
            String linea;
            while ((linea= br.readLine())!=null){
                String[]colonne=linea.split(";");
                bw.write(colonne[1]+";"+colonne[2]);
                bw.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try(BufferedReader br=new BufferedReader(new FileReader("dati.csv"))) {
            ArrayList<String>contenutoDatiTemp=new ArrayList<>();
            String linea;
            while ((linea=br.readLine())!=null){
                contenutoDatiTemp.add(linea);
            }
            Collections.sort(contenutoDatiTemp);
            try(BufferedWriter bw=new BufferedWriter(new FileWriter("dati.csv"))) {
                for(int i=0;i<contenutoDatiTemp.size();i++){
                    bw.write(contenutoDatiTemp.get(i));
                    bw.newLine();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}