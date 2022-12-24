

import javax.swing.JOptionPane;

public class Joption {
    public static void main(String[] args) {
        Account conta = new Account();
        try {
            conta.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Numero da conta")));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " tem que ser numero inteiro ");//corrigir num futuro proxim
            e.notifyAll();
                   }

        conta.setCorrentista(JOptionPane.showInputDialog(null, "Informeo o nome do Correntista: "));

        String response = JOptionPane.showInputDialog(null, "haverá deposito  inicial (s/n)? ");

        if (response.equals("s")) {
            double initialDeposit = Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Entre com o deposito inicial"));

            conta = new Account(conta.getNumero(), conta.getCorrentista(), initialDeposit);
            JOptionPane.showMessageDialog(null, conta);
        }

        else {
            conta = new Account(conta.getNumero(), conta.getCorrentista());
            JOptionPane.showMessageDialog(null, conta);

            double initialDeposit = Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Entre com o deposito"));
            conta = new Account(conta.getNumero(), conta.getCorrentista(), initialDeposit);
            JOptionPane.showMessageDialog(null, conta);

        }

    }
}
