package tres_e_quatro;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void listar(ArrayList<Pessoas> pessoas){

    Scanner s = new Scanner(System.in);

    System.out.println ("Numero de pessoas");
    int i = s.nextInt();

    for (i=i;i<pessoas.size();i++){

        System.out.println("Nome: " + pessoas.get(i).getNome());

        System.out.println("Sobrenome: " + pessoas.get(i).getSobrenome());

        System.out.println("Idade: " + pessoas.get(i).getIdade() +"\n");

        System.out.println("Salario: R$" + pessoas.get(i).getSalario() +"\n");

    }}
}
