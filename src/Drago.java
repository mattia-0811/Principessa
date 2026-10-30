import static sun.rmi.transport.TransportConstants.Return;

public class Drago {
    private String  nome;
    private Cavaliere cacciatore;
    public  Drago(String nome){
    this.nome=nome;
    }
    public   Distruggi(){
        Return.this.nome+"sta Distruggendo il villaggio";
    }


}
