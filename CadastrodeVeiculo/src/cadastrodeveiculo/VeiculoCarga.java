package cadastrodeveiculo;

//importação de bibliotecas para pegar a data atual e para formatala
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class VeiculoCarga extends Veiculo { // construtor do Veículo de Carga
    double valorVenda;
    String dt_Cadastro, tipoCarga, txtValor;

    public String getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(String txtValor) {
        this.txtValor = txtValor;
    }
    int km;

    VeiculoCarga (){  //formatação da data
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
        dt_Cadastro = dateFormat.format(date);
    }
    
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setDt_Cadastro(String dt_Cadastro) {
        this.dt_Cadastro = dt_Cadastro;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public String getDt_Cadastro() {
        return dt_Cadastro;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public int getKm() {
        return km;
    }
    
    public double calculaValorVenda (){ //calcula o valor de venda do veiculo de carga
    this.valorVenda = this.precoCusto * 1.45;
    return this.valorVenda;
    }
    
    public String CadastroCarga() { // painel para o cadastro de veículo de carga
       
       this.marca = JOptionPane.showInputDialog("Digite a Marca do Veículo");
       this.modelo = JOptionPane.showInputDialog("Digite o Modelo do Veículo");
       this.cor = JOptionPane.showInputDialog("Digite a cor do Veículo");
       this.chassi = Long.parseLong(JOptionPane.showInputDialog("Digite o chassi do Veículo (Apenas Numeros)"));
       this.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do Veículo (Apenas Numeros)"));
       this.km = Integer.parseInt(JOptionPane.showInputDialog("Digite a kilometragem do Veículo (Apenas Numeros)"));
       this.tipoCarga = JOptionPane.showInputDialog("Digite o Tipo de Carga do Véiculo");
       calculaValorCusto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de custo do Veículo (Apenas Numeros)")));

       //Pegando o valor de venda e convertendo para duas casas decimais após a virgula
       setTxtValor(String.format("%.2f", calculaValorVenda()));
       //mostrando os dados do veiculo cadastrado
        return "Cadastrado com sucesso\n" + mostra();  
    }
    
    public String mostra() { //metodo para mostrar a visão geral do cadastro
       String msg;
       msg = "ID: " + getId() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + 
                "\nCor: " + getCor() + "\nChassi: "+ getChassi() + "\nAno: " + getAno() + "\nKilometragem: "
                + getKm() + "\nTipo de Carga: " + getTipoCarga() + "\nValor de Custo: R$"+ getPrecoCusto() + "\nValor de venda: R$" + getTxtValor() + "\nData de Cadastro: " + getDt_Cadastro();
       return msg;
    }
}

