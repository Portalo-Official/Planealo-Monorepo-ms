package com.planealo.negocio.plan.utils;

import java.time.LocalDateTime;
import java.util.Random;

public class Utiles {
	
    private static final int DIGITOS_HEX = 16; // 16 elementos desde 0 a F
    private static final int CABECERA = 6; // Cabezera: #34AF0C  Cola: -6A
    private static final int COLA = 2;
    private static final String CARACTER_CABEZERA = "#";
    private static final String CARACTER_COLA = "-";
    
    /**
     * Metodo que genera una referencia, tiene 2 partes,
     * una cabecera (M34AF0C) y una cola (-6A), de tal forma
     * M34AF0C-6A
     * @return Return una referencia en hexadecimal.
     */
    public static String generateReferencia() {
    	Character dia = LocalDateTime.now().getDayOfWeek().toString().charAt(0);
       // Cabecera
    	StringBuilder referencia = new StringBuilder(dia.toString());
		generateDigitHex( referencia, Utiles.CABECERA);
        //Cola
        referencia.append(CARACTER_COLA);
        generateDigitHex( referencia, Utiles.COLA);
        return referencia.toString();
    }

	private static void generateDigitHex( StringBuilder referencia, int cantidad) {
		Random rnd = new Random();
		for (int i = 0; i < cantidad; i++) {
        	int digito = rnd.nextInt(DIGITOS_HEX);
        	referencia.append(Integer.toHexString(digito).toUpperCase());
        }
	}
	
	
	
}
