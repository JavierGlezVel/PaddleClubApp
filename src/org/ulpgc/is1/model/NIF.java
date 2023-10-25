package org.ulpgc.is1.model;
import java.util.regex.*;

public class NIF {
    private String number;
    public NIF (String number) {
        if (isValid(number)) {
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }
    private boolean isValid(String number) {
        if (number.length() != 9 || !Character.isLetter(number.charAt(8))) {
            return false;
        }

        String numeros = number.substring(0, 8);
        char letra = Character.toUpperCase(number.charAt(8));

        int dni = Integer.parseInt(numeros);

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraCalculada = letras.charAt(dni % 23);

        return letra == letraCalculada;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        if (isValid(number)) {
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }
    @Override
    public String toString() {
        return number;
    }
}


