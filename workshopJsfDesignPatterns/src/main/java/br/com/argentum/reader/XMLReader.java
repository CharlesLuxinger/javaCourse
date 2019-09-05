package br.com.argentum.reader;

import java.time.LocalDateTime;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.argentum.model.Negociacao;
import br.com.argentum.sxtream.LocalDateTimeConverterSX;

public class XMLReader {
	public static void main(String[] args) {
		Negociacao negociacao = new Negociacao(150, 5, LocalDateTime.now());

		XStream xStream = new XStream(new DomDriver());
		xStream.registerLocalConverter(Negociacao.class, "dataHora", new LocalDateTimeConverterSX());
		String xml = xStream.toXML(negociacao);

		System.out.println(xml);
	}
}
