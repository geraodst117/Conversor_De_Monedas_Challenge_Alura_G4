package Main;

import OptionPanel.OptionPanelMonedas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        OptionPanelMonedas conversion = new OptionPanelMonedas();


        while (true) {
            String opciones = JOptionPane.showInputDialog(null, "Elija el tipo de conversión", "Menú", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();


            if (opciones.equals("Conversor de Monedas")) {
                String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                double valorRecibido = Double.parseDouble(input);
                conversion.ConvertirMonedas(valorRecibido);


                int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
                if (JOptionPane.OK_OPTION == respuesta) {
                    System.out.println("Entra");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
    }
}