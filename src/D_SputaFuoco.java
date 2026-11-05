public class D_SputaFuoco extends Drago {

    public D_SputaFuoco(String nome) {
        super(nome);
    }

    @Override
    public String Distruggi() {
        return this.getNome() + " sta bruciando il villaggio";
    }
    @Override
    public void run(){
        for(int i=0;(i<5);&&!Thread.interrupted(); i++){
            System.out.println("i= "+i);
        }
    }

}