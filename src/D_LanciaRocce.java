public class D_LanciaRocce extends Drago {

    public D_LanciaRocce(String nome) {
        super(nome);
    }

    @Override
    public String Distruggi() {
        return this.getNome() + " sta lanciando rocce sul villaggio";
    }
}