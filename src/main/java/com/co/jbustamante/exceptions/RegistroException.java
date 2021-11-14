package com.co.jbustamante.exceptions;

public class RegistroException extends AssertionError {

    public static final String MENSAJE_REGISTRO_FALLIDA = "Registro Fallido";

    public RegistroException(String message, Throwable cause) {

        super(message, cause);
    }
}
