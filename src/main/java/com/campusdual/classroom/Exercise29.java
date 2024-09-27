package com.campusdual.classroom;


public class Exercise29 {

    public static void main(String[] args) {
        try {
            // Intentamos realizar la operación que causa la excepción
            int num = 1 / 0; // Esto causará una ArithmeticException (división por cero)
            System.out.println("Resultado: " + num);
        } catch (ArithmeticException e) {
            // Capturamos la excepción de división por cero y lanzamos una excepción personalizada
            System.out.println("Se ha producido una excepción: División por cero detectada.");

            // Aquí lanzamos nuestra excepción personalizada
            try {
                throw new CustomDivisionException("Eso no se puede dividir.");
            } catch (CustomDivisionException customException) {
                // Capturamos la excepción personalizada y mostramos el mensaje
                System.out.println("Excepción personalizada: " + customException.getMessage());
            }
        }
    }

    // Clase interna para la excepción personalizada
    static class CustomDivisionException extends Exception {
        public CustomDivisionException(String message) {
            super(message);
        }
    }
}
