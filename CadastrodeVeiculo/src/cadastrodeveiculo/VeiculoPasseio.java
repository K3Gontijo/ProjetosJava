package cadastrodeveiculo;

//importação de bibliotecas para pegar a data atual e para formatala
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class VeiculoPasseio extends Veiculo { // construtor do Veículo de Passeio
    double valorVenda;
    String dt_Cadastro,txtValor;
    int km;
    
    @Override
    public double calculaValorVenda (){      // metodo para calcular o valor de venda do veiculo de passeio
    this.valorVenda = this.precoCusto * 1.35;
    return this.valorVenda;
    }

    public String getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(String txtValor) {
        this.txtValor = txtValor;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setDt_cadastro(String Dt_cadastro) {
        this.dt_Cadastro = Dt_cadastro;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public String getDt_cadastro() {
        return dt_Cadastro;
    }

    public int getKm() {
        return km;
    }
    
    VeiculoPasseio () {  //formatação da data
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
        setDt_cadastro(dateFormat.format(date));
    }
            
    public String CadastroPasseio() {   // painel para o cadastro de veículo de passeio
       
       this.marca = JOptionPane.showInputDialog("Digite a Marca do Veículo");
       this.modelo = JOptionPane.showInputDialog("Digite o Modelo do Veículo");
       this.cor = JOptionPane.showInputDialog("Digite a cor do Véiculo");
       this.chassi = Long.parseLong(JOptionPane.showInputDialog("Digite o chassi do Veículo (Apenas Numeros)"));
       this.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do Veículo (Apenas Numeros)"));
       this.km = Integer.parseInt(JOptionPane.showInputDialog("Digite a kilometragem do Veículo (Apenas Numeros)"));
       calculaValorCusto(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de custo do Veículo (Apenas Numeros)")));

       //Pegando o valor de venda e convertendo para duas casas decimais após a virgula
       setTxtValor(String.format("%.2f", calculaValorVenda()));
       //mostrando os dados do veiculo cadastrado
        return "Cadastrado com sucesso\n" + mostra();
       
    }
    
    public String mostra() {    //metodo para mostrar o veículo cadastrado
       String msg;
       msg = "ID: " + getId() + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + 
                "\nCor: " + getCor() + "\nChassi: "+ getChassi() + "\nAno: " + getAno() + "\nKilometragem: "
                + getKm() + "\nValor de Custo: R$"+ getPrecoCusto() + "\nValor de venda: R$" + getTxtValor() + "\nData de Cadastro: " + getDt_cadastro();
       return msg;
    }  
}

