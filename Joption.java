
import javax.swing.JOptionPane;

public class Joption {
    public static void main(String[] args) {
        Account conta = new Account();

        conta.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Numero da conta")));

        conta.setCorrentista(JOptionPane.showInputDialog(null, "Informeo o nome do Correntista: "));

        String response = JOptionPane.showInputDialog(null, "haverá deposito  inicial (s/n)? ");

        if (response.equals("s")) {
            double initialDeposit = Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Entre com o deposito inicial"));

            conta = new Account(conta.getNumero(), conta.getCorrentista(), initialDeposit);
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
