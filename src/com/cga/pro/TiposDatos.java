package com.cga.pro;

public class TiposDatos {

	public enum Dias {
		Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo
	};

	public static void main(String[] args) {

		byte by = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223372036854775807L;
		float f = 5.99F;
		double d = 2.5;
		boolean b = true;
		char ch = 'z';
		final double PI = 3.141516;

		System.out.println("Esto es un byte " + by);
		System.out.println("Esto es un short " + s);
		System.out.println("Esto es un int " + i);
		System.out.println("Esto es un long " + l);
		System.out.println("Esto es un float " + f);
		System.out.println("Esto es un double " + d);
		System.out.println("Esto es un boolean " + b);
		System.out.println("Esto es un char " + ch);
		System.out.println("Esto es un const " + PI);

		Dias diaActual = Dias.Lunes;
		System.out.println(diaActual);

		String texto = "Roger dijo: \"Hoy hace un dia fantástico...\"";
		System.out.println(texto);

	}

}
