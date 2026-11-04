public class Principessa {

    private String nome;
    private Drago carceriere;

    public Principessa(String nome) {
        this.nome = nome;
        this.carceriere = null;
    }

    public String getNome() {
        return nome;
    }

    public Drago getCarceriere() {
        return carceriere;
    }

    public void setCarceriere(Drago carceriere) {
        this.carceriere = carceriere;
    }
}