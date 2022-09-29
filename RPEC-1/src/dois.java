public class dois {

    public static void main(String args[]) {
        int[] cont = new int[CPD.controladora + 1];
        int vezes = 0;
        int indice = 0;
        for (int i=0; i < (CPD.controladora + 1); i++) {
            for (int j=0;j < (CPD.controladora + 1); j++) {
                if(vet[i] == vet[j]) {
                    cont[i] = cont[i] + 1;
                }
            }
        }
        vezes = cont[0];
        for (int i=0; i < cont.length; i++) {
            if (cont[i] > vezes) {
                vezes = cont[i];
                indice = i;
            }
        }
        return vet[indice];
}