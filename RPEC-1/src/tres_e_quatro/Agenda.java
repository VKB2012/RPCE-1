package tres_e_quatro;
import java.util.ArrayList;
public class Agenda {  private ArrayList<Pessoas> pessoas;

    public Agenda() {
        this.pessoas = new ArrayList<Pessoas>();
    }
    public  void addPessoa(Pessoas p){
        this.pessoas.add(p);
    }

    public ArrayList<Pessoas> getLista(){
        return this.pessoas;

    }
}
