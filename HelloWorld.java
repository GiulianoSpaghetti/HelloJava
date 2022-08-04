package com.github.numerunix;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* Questo codice è sotto licenza MIT*/
public class HelloWorld {
	
	public static void main(String args[]) {
		String s="";
		byte[] b=new byte[256];
		InputStream r=System.in;
		System.out.print("Inserisci il tuo nome: ");
		try {
			r.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s=new String(b).strip();
		System.out.print("Ciao "+s+" dedico questo progetto alla famiglia San Severino.");
		try {
			r.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
