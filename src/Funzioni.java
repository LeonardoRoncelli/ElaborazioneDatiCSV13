import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Funzioni {
    public ArrayList<String> carica(){
        ArrayList<String>contenutoFile=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader("Regioni.csv"))){
            String linea;
            while ((linea=br.readLine())!=null){
                contenutoFile.add(linea);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return contenutoFile;
    }
}