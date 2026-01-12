package util;

import javax.swing.*;

public class ValidarInfo {
    public static String validarString(String texto) throws Exception {
        if (texto == null || texto.trim().isEmpty()) {
            throw new Exception("CAMPOS INVALIDOS");
        }
        return texto;
    }

    public static int validarInt(String texto) throws Exception {
        if(texto == null || texto.trim().isEmpty()) {
            throw new Exception("CAMPOS VAZIOS");
        }

        int numero = Integer.parseInt(texto);
        if (numero < 0) {
            throw new Exception("CAMPOS INVALIDOS");        }
        return numero;
    }


    public static double validarDouble(String texto) throws Exception {
        if(texto == null || texto.trim().isEmpty()) {
            throw new Exception("CAMPOS VAZIOS");
        }

        double numero = Double.parseDouble(texto);
        if (numero < 0) {
            throw new Exception("CAMPOS INVALIDOS");        }
        return numero;
    }
}
