package exercicojopitionpane;

import javax.swing.JOptionPane;

public class ExercicoJOpitionpane {

    public static void main(String[] args) {
        boolean opcao = true;
        int cont = 1;
        
        int menu = JOptionPane.showConfirmDialog(null, "Deseja Realizar Login?");
        
        if(menu == 0){
           // System.out.println("EU APERTEI YES");
        
        }else if(menu == 1){
            JOptionPane.showMessageDialog(null, "Systema Foi Finalizado.");
            //System.out.println("EU APERTEI NÂOOOOOOOO");
            System.exit(0);
        }
        else if(menu == 2){
            JOptionPane.showMessageDialog(null, "Login Cancelado!!!");
            System.exit(0);
        }
        
        do {
            
            String usuario = JOptionPane.showInputDialog(null, "Login;");
            if(usuario.isBlank()){
                JOptionPane.showMessageDialog(null, "Usuario Não Pode Estar Vazio!");
            }
            String senha = JOptionPane.showInputDialog(null, "Senha");
            if(senha.isBlank()){
                JOptionPane.showMessageDialog(null, "Senha Não Pode Estar Vazio!");
            }

            if ("admin".equals(usuario) && "123".equals(senha)) {
                JOptionPane.showMessageDialog(null, "Login Realizado Com Sucesso");
                System.exit(0);
                //break;
            } else {
                JOptionPane.showMessageDialog(null, "Login ou Senha Inválido");
                opcao = false; 
                cont++;
            }
        } while (cont <= 3);
                JOptionPane.showMessageDialog(null, "Programa Encerrado");             
    }
}


