package com.endes;

public class DNI {
	String DNI;
	String nombre;
	
	public DNI(String nombre, String DNI) {
		
		this.DNI = "";
		this.nombre = "";
	}
	
	public boolean validacion() {
		boolean resultado = false;
		if(DNI.length() == 9) {
		String numerosDNI = "";
		for(int i = 0; i < DNI.length() - 1; i++) {
			numerosDNI += DNI.charAt(i); 
		}
		char letraDNI = DNI.charAt(8); 
		int numero_DNI = Integer.parseInt(numerosDNI);
		int resto_validacion = numero_DNI % 23;
		switch(resto_validacion) {
		case(0):
			if(letraDNI == 'T') {
				resultado = true;
			}
			break;
		case(1):
			if(letraDNI == 'R') {
				resultado = true;
			}	
			break;
		case(2):
			if(letraDNI == 'W') {
				resultado = true;
			}
			break;
		case(3):
			if(letraDNI == 'A') {
				resultado = true;
			}
			break;
		case(4):
			if(letraDNI == 'G') {
				resultado = true;
			}
			break;
		case(5):
			if(letraDNI == 'M') {
				resultado = true;
			}
			break;
		case(6):
			if(letraDNI == 'Y') {
				resultado = true;
			}
			break;
		case(7):
			if(letraDNI == 'F') {
				resultado = true;
			}
			break;
		case(8):
			if(letraDNI == 'P') {
				resultado = true;
			}
			break;
		case(9):
			if(letraDNI == 'D') {
				resultado = true;
			}
			break;
		case(10):
			if(letraDNI == 'X') {
				resultado = true;
			}
			break;
		case(11):
			if(letraDNI == 'B') {
				resultado = true;
			}
			break;
		case(12):
			if(letraDNI == 'N') {
				resultado = true;
			}
			break;
		case(13):
			if(letraDNI == 'J') {
				resultado = true;
			}
			break;
		case(14):
			if(letraDNI == 'Z') {
				resultado = true;
			}
			break;
		case(15):
			if(letraDNI == 'S') {
				resultado = true;
				}
			break;
		case(16):
			if(letraDNI == 'Q') {
				resultado = true;
			}
			break;
		case(17):
			if(letraDNI == 'V') {
				resultado = true;
			}
			break;
		case(18):
			if(letraDNI == 'H') {
				resultado = true;
			}
			break;
		case(19):
			if(letraDNI == 'L') {
				resultado = true;
			}
			break;
		case(20):
			if(letraDNI == 'C') {
				resultado = true;
			}
			break;
		case(21):
			if(letraDNI == 'K') {
				resultado = true;
			}
			break;
		case(22):
			if(letraDNI == 'E') {
				resultado = true;
			}
			break;
		default:
			
		
		}
		}
		
		return resultado;
	}
}
