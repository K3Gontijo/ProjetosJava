package apppilhasequencialkaue;

public class PilhaSequencial {
    
    public int[] lista;
    public int quantidade;
    public int tamanhoMaximoDaPilha = 5;
    
    PilhaSequencial(){
        this.quantidade = 0;
        this.lista = new int[this.tamanhoMaximoDaPilha];
    }
    
    public void empilha(int n){
        if(this.estaCheia() == false){
            this.lista[this.quantidade] = n;
            this.quantidade++;
        }else{
            System.out.println("A lista está cheia, nao foi possível adicionar "+ n);
        }
    }
    
    public int desempilha(){
        if(this.estaVazia() != false){
            this.quantidade--;
            return this.lista[this.quantidade] = 0;
        }else{
            System.out.println("Não é possivel remover pois a pilha esta vazia");
            return this.lista[this.quantidade];
        }
    }
    
    public void verificaTamanhoPilha(){
        System.out.println("A pilha possui o tamanho de: " + this.quantidade + " elementos");
    }
    
    public void limpaPilha(){
        do{
            this.desempilha();
        }while(this.estaVazia() != false && this.quantidade != 0);
         
    }
    
    public void verificaItemNaLista(int n){
        
    }
    
    public boolean estaVazia(){
        return (this.quantidade != this.tamanhoMaximoDaPilha);
    }
    
    public boolean estaCheia(){
        return (this.quantidade == this.tamanhoMaximoDaPilha);
    }
    
    public void peek(){
        int posicao = this.lista[this.quantidade - 1];
        System.out.println("O elemento no topo da lista é: "+posicao);
    }
}

