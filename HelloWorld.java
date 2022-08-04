package com.github.numerunix;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.ResourceBundle;

/* Questo codice è sotto licenza MIT*/
public class HelloWorld {
	
	public static void main(String args[]) {
		ResourceBundle bundle=ResourceBundle.getBundle("Hello", Locale.getDefault());
		String s="";
		byte[] b=new byte[256];
		InputStream r=System.in;
		System.out.print(bundle.getString("InserireNome")+": ");
		try {
			r.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s=new String(b).strip();
		System.out.print(bundle.getString("Ciao")+" "+s+" "+bundle.getString("dedica")+".");
		try {
			r.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
