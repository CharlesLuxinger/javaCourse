package br.com.alura.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String nome = "Teste 123";

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\temp\\out.bin"));
		oos.writeObject(nome);
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\temp\\out.bin"));
		String oistring = (String) ois.readObject();
		ois.close();
		System.out.println(oistring);

		Cliente cliente = new Cliente("Charles", "000000000", "Dev");

		ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("C:\\temp\\out2.bin"));
		oos2.writeObject(cliente);
		oos2.close();

		ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("C:\\temp\\out2.bin"));
		Cliente cliente2 = (Cliente) ois2.readObject();
		ois2.close();
		System.out.println(cliente2.getNome());

		// Serialização com Herança
		/*
		 * É necessário serializar a Classe Mãe e ás classes associadas, não é
		 * necessário implementar o Serializable nas classes filhas, mas é necessário
		 * add o serialversionid. Para não serializar(não grava o objeto) as classes
		 * associadas deve adicionar a keyword Transient
		 */

		ContaCorrente cc = new ContaCorrente(22, 11);
		cc.setTitular(cliente);
		cc.deposita(200.0);

		ObjectOutputStream oos3 = new ObjectOutputStream(new FileOutputStream("C:\\temp\\out3.bin"));
		oos3.writeObject(cc);
		oos3.close();

		ObjectInputStream ois3 = new ObjectInputStream(new FileInputStream("C:\\temp\\out3.bin"));
		ContaCorrente cc2 = (ContaCorrente) ois3.readObject();
		ois3.close();
		System.out.println(cc2.getTitular().getNome());

	}

}
