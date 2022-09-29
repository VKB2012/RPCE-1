import java.util.Scanner;

public class um {public static void main(String[] args) {
    float y=0;
    Scanner s = new Scanner(System.in);

System.out.println ("Numero de elementos");
    int n = s.nextInt();

int[] dados=new int[n];

for (int i=0; i < n; i++){

    System.out.println ("Digite o elemento");
    int x = s.nextInt();
    dados[i]=x;
}
    for(int j=0; j < dados.length;j++){

y=y+dados[j];

    }
    System.out.println("Media: "+y/dados.length+1);
}}
