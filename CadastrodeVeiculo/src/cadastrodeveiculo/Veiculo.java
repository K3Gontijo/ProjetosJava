package cadastrodeveiculo;

import java.util.Random; // Classe Random para gerar um código para o veículo

public class Veiculo {  // Construtor 
    int id, ano;
    String marca, modelo, cor;
    long chassi;
    double precoCusto;

    
    public void calculaValorCusto (double precoCusto){ //metodo para definir valor de custo
    this.precoCusto = precoCusto;
}
    
    public double calculaValorVenda (){ //metodo para calcular valor de venda
    this.precoCusto = this.precoCusto * 1.2;
    return this.precoCusto;
}
    
    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public long getChassi() {
        return chassi;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setChassi(long chassi) {
        this.chassi = chassi;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
    
    Veiculo () { //gerando um codigo aleatorio para o id do veiculo
       Random r = new Random();
       this.id = r.nextInt(99); 
    }
    
}
