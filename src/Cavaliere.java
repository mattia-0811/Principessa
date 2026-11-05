import java.util.ArrayList;

public class Cavaliere {

    private String nome;
    private Cavaliere maestro;
    private ArrayList<Drago> draghiUccisi;

    public Cavaliere(String nome) {
        this.nome = nome;
        this.maestro = null;
        this.draghiUccisi = new ArrayList<Drago>();
    }

    public void AggiungiDragoUcciso(Drago d) {
        this.draghiUccisi.add(d);
    }

    public String getNome() {
        return nome;
    }

    public Cavaliere getMaestro() {
        return maestro;
    }

    public void setMaestro(Cavaliere maestro) {
        this.maestro = maestro;
    }

    public ArrayList<Drago> getDraghiUccisi() {
        return draghiUccisi;
    }

    @Override
    public void run(){
        for(int i=0; i<10 &&())

    }


}