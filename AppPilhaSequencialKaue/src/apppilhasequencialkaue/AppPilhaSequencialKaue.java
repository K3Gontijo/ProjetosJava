package apppilhasequencialkaue;

import java.util.Arrays;

public class AppPilhaSequencialKaue {

    public static void main(String[] args) {
        
        PilhaSequencial pilha = new PilhaSequencial();
        pilha.empilha(21);
        pilha.empilha(4);
        pilha.empilha(4);
        pilha.empilha(123);

        System.out.println(Arrays.toString(pilha.lista));
        pilha.limpaPilha();
        
        System.out.println(Arrays.toString(pilha.lista));
        pilha.verificaTamanhoPilha();
        
    }
    
}

//para observar o elemento no topo, basta pegar a quantidade e subtrair 1, que vamos obter a posição de quem está no topo