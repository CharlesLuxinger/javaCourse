package br.com.alura.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TesteUnicodeEnconding {
	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		String a = "A";
		System.out.println(a.codePointAt(0));

		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		byte[] bytes = a.getBytes("UTF-8");
		String sbytes = new String(bytes, "UTF-8");
		System.out.println(bytes.length);
		System.out.println(sbytes);

		bytes = a.getBytes("UTF-16");
		sbytes = new String(bytes, "UTF-16");
		System.out.println(bytes.length);
		System.out.println(sbytes);

		bytes = a.getBytes(StandardCharsets.US_ASCII);
		sbytes = new String(bytes, StandardCharsets.US_ASCII);
		System.out.println(bytes.length);
		System.out.println(sbytes);

		Scanner sc = new Scanner(new File("C:\\temp\\test.csv"), "UTF-8");
	}
}
