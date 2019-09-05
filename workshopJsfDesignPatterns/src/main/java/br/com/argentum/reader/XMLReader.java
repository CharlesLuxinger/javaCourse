package br.com.argentum.reader;

import java.io.InputStream;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.argentum.model.Negociacao;
import br.com.argentum.sxtream.LocalDateTimeConverterSX;

public class XMLReader {

	@SuppressWarnings("unchecked")
	public List<Negociacao> getNegociacoesFromXML(InputStream inputStream) {
		XStream xStream = new XStream(new DomDriver());
		xStream.registerLocalConverter(Negociacao.class, "data", new LocalDateTimeConverterSX());
		xStream.alias("negociacao", Negociacao.class);

		return (inputStream != null ? (List<Negociacao>) xStream.fromXML(inputStream) : null);
	}
}
