package Principal;

import javax.swing.*;

import ConversorMonedas.opcionesConversor;
import conversorTemperatura.OpcionesConversionTemperatura;

public class Principal {

    public static void main(String[] args) {

        opcionesConversor conversion = new opcionesConversor();
        OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();

        while (true) {
            String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null,
                    new Object[]{"Conversor de Monedas", "Conversor de Temperatura"}, "Elegir").toString();

            switch (opciones) {
                case "Conversor de Monedas":
                    String input = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                    double valorRecibido = Double.parseDouble(input);
                    conversion.ConvertirMonedas(valorRecibido);
                    break;

                case "Conversor de Temperatura":
                    String input1 = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
                    double valorRecibidoT = Double.parseDouble(input1);
                    conversionT.ConvertirTemperaturas(valorRecibidoT);
                    break;
            }

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?");
            if (JOptionPane.OK_OPTION != respuesta) {
                JOptionPane.showMessageDialog(null, "Gracias por usar mi programa :)");
                break;
            }
        }
    }
}
