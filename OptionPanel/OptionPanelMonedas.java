package OptionPanel;

import LogicaConversiones.ConversionMonedas;

import javax.swing.*;

public class OptionPanelMonedas {
    ConversionMonedas monedas = new ConversionMonedas();

    public void ConvertirMonedas(double valor) {

        String opcion = (JOptionPane.showInputDialog(null,
                "Escoger la moneda que deseas convertir ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won sub-coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won sub-coreano a Pesos"},
                "Seleccion")).toString();

        switch (opcion) {
            case "De Pesos a Dólar":
                monedas.ConvertirPesosMexicanosADolares(valor);
                break;

            case "De Pesos a Euro":
                monedas.ConvertirPesosMexicanosAEuros(valor);
                break;

            case "De Pesos a Libras Esterlinas":
                monedas.ConvertirPesosMexicanosALibra(valor);
                break;

            case "De Pesos a Yen Japonés":
                monedas.ConvertirPesosMexicanosAYen(valor);
                break;

            case "De Pesos a Won sub-coreano":
                monedas.ConvertirPesosMexicanosAWon(valor);
                break;

            case "De Dólar a Pesos":
                monedas.ConvertirDolaresAPesosMexicanos(valor);
                break;

            case "De Euro a Pesos":
                monedas.ConvertirEurosAPesosMexicanos(valor);
                break;

            case "De Libras Esterlinas a Pesos":
                monedas.ConvertirLibraAPesosMexicanos(valor);
                break;

            case "De Yen Japonés a Pesos":
                monedas.ConvertirYenAPesosMexicanos(valor);
                break;

            case "De Won sub-coreano a Pesos":
                monedas.ConvertirWonAPesosMexicanos(valor);
                break;
        }
    }

}

