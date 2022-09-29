package tres_e_quatro;


public class Main {

    public static void main(String[] args) throws Exception {

        Pessoas p1 = new Pessoas("Relampago", "Marquinhos", 17,500);
        Pessoas p2 = new Pessoas("Geraldo", "de Rivia", 45,3000);
        Pessoas p3 = new Pessoas("Batata", "Frita", 33,10200);
        Pessoas p4 = new Pessoas("André", "Boch", 36,4700);
        Pessoas p5 = new Pessoas("Juan", "Horseman", 65,1200);
        Pessoas p6 = new Pessoas("Phillips", "Chave", 21,2200);
        Pessoas p7 = new Pessoas("Seilá", "Oqescrever", 45,1200);
        Pessoas p8 = new Pessoas("Rique", "d", 30,1500);
        Pessoas p9 = new Pessoas("Palduru", "aaaa", 25, 1000);
        Pessoas p10 = new Pessoas("Nuck", "Chakabum", 10, 120);

        Agenda agenda = new Agenda();

        agenda.addPessoa(p1);
        agenda.addPessoa(p2);
        agenda.addPessoa(p3);
        agenda.addPessoa(p4);
        agenda.addPessoa(p5);
        agenda.addPessoa(p6);
        agenda.addPessoa(p7);
        agenda.addPessoa(p8);
        agenda.addPessoa(p9);
        agenda.addPessoa(p10);

        Menu menu = new Menu();
        menu.listar(agenda.getLista());
    }
}