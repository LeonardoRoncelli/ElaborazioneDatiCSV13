public class Record {
    private int anno;
    private String regione;
    private double percentuale;
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public String getRegione() {
        return regione;
    }
    public void setRegione(String regione) {
        this.regione = regione;
    }

    public double getPercentuale() {
        return percentuale;
    }
    public void setPercentuale(double percentuale) {
        this.percentuale = percentuale;
    }
    public Record(int anno, String regione, double percentuale){
        this.anno=anno;
        this.regione=regione;
        this.percentuale=percentuale;
    }
    public String toString(){
        return getAnno()+";"+getRegione()+";"+getPercentuale();
    }
}