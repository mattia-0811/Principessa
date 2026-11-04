public class D_SputaGhiaccio extends Drago {

    public D_SputaGhiaccio(String nome) {
        super(nome);
    }

    @Override
    public String Distruggi() {
        return this.getNome() + " sta congelando il villaggio";
    }
}