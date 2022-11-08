package cadastrodeveiculo;

import javax.swing.JOptionPane;

public class CadastrodeVeiculo {

    public static void main(String[] args) {
        int i = 1;
        VeiculoPasseio vp = new VeiculoPasseio();
        VeiculoCarga vc = new VeiculoCarga();
        
        //inicio do menu
        while (i > 0 ){
        String menu = JOptionPane.showInputDialog("Digite o numero da opção desejada"
                + "\n1 - Cadastro Veiculo Passeio \n2 - Cadastro Veiculo Carga "
                + "\n3 - Mostrar Veiculos Cadastados \n4 - Sair");
        
        //opções do menu
        if ( menu.equals("1")){
            JOptionPane.showMessageDialog(null, vp.CadastroPasseio());
            
        } else if (menu.equals("2")) {
            JOptionPane.showMessageDialog(null, vc.CadastroCarga());
            
        } else if(menu.equals("3")){
            if(vp.getMarca() != null || vc.getMarca() != null){
                if(vp.getMarca() != null && vc.getMarca() != null){
                    JOptionPane.showMessageDialog(null, "Veiculo de Passeio\n" + 
                    vp.mostra() + "\n\nVeiculo de Carga\n" + vc.mostra());
                } else if (vc.getMarca() != null) {
                    JOptionPane.showMessageDialog(null, "Veiculo de Carga\n" + vc.mostra());
                } else {
                    JOptionPane.showMessageDialog(null, "Veiculo de Passeio\n" + vp.mostra());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum Veiculo Cadastrado");
            }
            
        } else if(menu.equals("4")) {
            i = 0;
        } else {
            JOptionPane.showMessageDialog(null, "Opção invalida");
        }
        
        }   
    }   
}

