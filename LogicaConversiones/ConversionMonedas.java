package LogicaConversiones;

import javax.swing.*;
import java.text.DecimalFormat;

public class ConversionMonedas {
    public void ConvertirPesosMexicanosADolares(double valor) {
        double monedaDolar = valor * 0.056;
        DecimalFormat formato = new DecimalFormat("#0.0000000");
        String monedaDolarFormateada = formato.format(monedaDolar);
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolarFormateada + " Dolares");
    }

    public void ConvertirPesosMexicanosAEuros(double valor) {
        double monedaEuro = valor * 0.052;
        DecimalFormat formato = new DecimalFormat("#0.0000000");
        String monedaEuroFormateada = formato.format(monedaEuro);
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuroFormateada + " Euros");
    }

    public void ConvertirPesosMexicanosALibra(double valor) {
        double monedaLibra = valor * 0.045;
        DecimalFormat formato = new DecimalFormat("#0.0000000");
        String monedaLibraFormateada = formato.format(monedaLibra);
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibraFormateada + " Libras Esterlinas");
    }

    public void ConvertirPesosMexicanosAYen(double valor) {
        double monedaYen = valor * 7.80;
        DecimalFormat formato = new DecimalFormat("#0.0000000");
        String monedaYenFormateada = formato.format(monedaYen);
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYenFormateada + " Yen Japonés");
    }

    public void ConvertirPesosMexicanosAWon(double valor) {
        double monedaWon = valor * 75.23;
        DecimalFormat formato = new DecimalFormat("#0.0000000");
        String monedaWonFormateada = formato.format(monedaWon);
        JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWonFormateada + " Won sub-coreano");
    }


    public void ConvertirDolaresAPesosMexicanos(double valor) {
        double monedaDolar = 17.76 * valor;
        monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Un " + valor + " Dolar equivale a " + monedaDolar + " pesos");
    }

    public void ConvertirEurosAPesosMexicanos(double valor) {
        double monedaEuro = 19.13 * valor;
        monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Un " + valor + " Euro equivale a " + monedaEuro + " pesos");
    }

    public void ConvertirLibraAPesosMexicanos(double valor) {
        double monedaLibra = valor * 22.04;
        monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Una " + valor + " Libra equivale a " + monedaLibra + " pesos");
    }

    public void ConvertirYenAPesosMexicanos(double valor) {
        double monedaYen = valor * 0.13;
        monedaYen = (double) Math.round(monedaYen * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Un " + valor + " Yen equivale a " + monedaYen + " pesos");
    }

    public void ConvertirWonAPesosMexicanos(double valor) {
        double monedaWon = valor * 0.013;
        monedaWon = (double) Math.round(monedaWon * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Un " + valor + " Won equivale a " + monedaWon + " pesos");
    }
}
