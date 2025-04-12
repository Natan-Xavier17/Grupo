package pão;

public class RangeLister { //Classe RangeLister

    int[] makeRanger(int lower, int upper) {   // Função makeRanger e seus parâmetros
        int [] range = new int[(upper-lower) + 1]; //Defini o tamanho da array
        for (int i = 0; i < range.length; i++){   // Com base no tamanho calculado no passo anterior irá percorrer n vezes,
            range[i] = lower++; // onde a cada iteração irá add um elemento na array somando com o numero de lower
        }
        return range;
    }
    public static void main(String[] args) {
        int[] range;
        RangeLister lister =  new RangeLister(); // Atribuindo para a variável lister a classe RangeLister

    range = lister.makeRanger(1,10); //Chamada da função makeRanger com parâmetros
    System.out.println("The array: [ ");
    for(int i = 0; i < range.length; i++){ // Irá percorrer a lista range, onde a cada iteração irá printar o elemento do indice indicado
        System.out.println(range[i] + " ");
    }
    System.out.println("]");
    }
}