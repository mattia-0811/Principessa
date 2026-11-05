import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringBuilder storytelling= new StringBuilder();
        ArrayList<Drago> dragos= new ArrayList<>();
        for(int i=0;(i<3);i++ {
            Thread t=new Thread(new D_SputaFuoco(String.valueOf(i)));
            dragos.add(t);
        }
        Thread sangiorgio= new Thread(new Cavaliere("giorgio",dragos.get(1)));
        for (Thread t:dragos){
            t.start();
        }
        System.out.println("i Draghi sono partiti per distruggere i villaggi");
        sangiorgio.start();
        System.out.println();
    }
}