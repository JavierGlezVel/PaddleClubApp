package org.ulpgc.is1.model;
import java.util.regex.*;

public class NIF {
    public String number;

    public NIF (String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static String isValid(String nif) {
        if ((nif == null) || (!nif.matches("\\d{8}[A-HJ-NP-TV-Z]"))) {
            return "XXXX";
        }
        String numero = nif.substring(0, 8);
        char letra = nif.charAt(8);
        int digitoControlEsperado = calcularDigitoControl(numero);
        return (digitoControlEsperado == obtenerValorLetra(letra)) ? nif : "XXXX";
    }

    private static int calcularDigitoControl(String numero) {
        int num = Integer.parseInt(numero);
        return num % 23;
    }

    private static int obtenerValorLetra(char letra) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int posicionLetra = letras.indexOf(letra);
        return posicionLetra % 23;
    }

}
