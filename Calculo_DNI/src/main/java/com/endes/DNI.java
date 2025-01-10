package com.endes;

public class DNI {
	String DNI;
	String nombre;
	
	public DNI(String nombre, String DNI) {
		
		this.DNI = "";
		this.nombre = "";
	}
	/**
	 * Calcula la letra del DNI correspondiente a un numero de DNI
	 * @param DNI
	 * @return Resultado = La letra del DNI
	 */
	public boolean validacion(String DNI) {
		boolean resultado = false;
		String numerosDNI = "";
		int numero_DNI = 0;
		for(int i = 0; i < DNI.length() - 1; i++) {
			numerosDNI += DNI.charAt(i); 
			 
		}
		
		if(DNI.length() == 9 || DNI != null || numerosDNI.matches("\\d+")) {
		
		char letraDNI = DNI.charAt(8); 
		numero_DNI = Integer.parseInt(numerosDNI);
		
		char[] letras_DNI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int resto_validacion = numero_DNI % 23;
		
		if(letraDNI == letras_DNI[resto_validacion]) {
			resultado = true;
		}else {
			
			throw new  IllegalArgumentException("El numero del DNI no es valido");
		}
		
		}//Condition of length
		
		return resultado;
	}
}
