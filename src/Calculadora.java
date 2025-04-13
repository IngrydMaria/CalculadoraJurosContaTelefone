import javax.swing.*;
import java.text.DecimalFormat;

public class Calculadora {
    public static void main (String [] args){
        double valorInicial = 134.00;
        double taxaJuros = 0.03;
        DecimalFormat casa = new DecimalFormat("0.00");

        double valor1Mes = valorInicial * (1 + taxaJuros);
        JOptionPane.showMessageDialog(null, "Valor apos 1 mes : R$ " + casa.format(valor1Mes));

        double valor3Mes = valor1Mes * Math.pow(1 + taxaJuros, 3);
        JOptionPane.showMessageDialog(null, "Valor apos 3 mes: R$ "+casa.format(valor3Mes));

        int mesesParaUltrapassar160 = 0 ;
        double valorAtual = valorInicial;
        while (valorAtual <= 160.00){
            valorAtual *= (1 + taxaJuros);
            mesesParaUltrapassar160++;
        }
        JOptionPane.showMessageDialog(null, "A conta ultrapassara R$ 160,00 apos: "+mesesParaUltrapassar160);

        int mesesParaDobrar = 0;
        valorAtual = valorInicial;
        while (valorAtual <= 2 * valorInicial){
            valorAtual *= (1 + taxaJuros);
            mesesParaDobrar++;
        }
        JOptionPane.showMessageDialog(null, "O valor dobrara apos "+mesesParaDobrar+" meses");
    }
}
