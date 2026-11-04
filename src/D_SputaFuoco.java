public class D_SputaFuoco extends Drago {

    public D_SputaFuoco(String nome) {
        super(nome);
    }

    @Override
    public String Distruggi() {
        return this.getNome() + " sta bruciando il villaggio";
    }
}