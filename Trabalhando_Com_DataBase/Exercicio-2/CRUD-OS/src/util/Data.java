package util;

import javax.swing.*;
import java.time.LocalDate;

public class Data {
    public static LocalDate adicionarDias(String diasS) throws Exception {
        int dias = Integer.parseInt(diasS);
        if(dias < 0) {
            throw new Exception("CAMPOS DE DATA INVALIDOS");
        }
        LocalDate agora = LocalDate.now();
        return agora.plusDays(dias);
    }
}
