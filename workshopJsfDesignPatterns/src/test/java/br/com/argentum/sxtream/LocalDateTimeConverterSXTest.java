package br.com.argentum.sxtream;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.argentum.model.Negociacao;
import br.com.argentum.sxtream.LocalDateTimeConverterSX;

public class LocalDateTimeConverterSXTest {

	@Test
	public void deveRetornarXMLcomADataEpochETimeZone() {
		Negociacao negociacao = new Negociacao(500, 1, LocalDateTime.of(2019, 9, 5, 16, 37, 30));

		XStream xStream = new XStream(new DomDriver());
		xStream.alias("negociacao", Negociacao.class);
		xStream.registerLocalConverter(Negociacao.class, "dataHora", new LocalDateTimeConverterSX());
		String xmlConverted = xStream.toXML(negociacao);

		String xmlExpected =
				"<negociacao>\n"
						+ "  <preco>500.0</preco>\n"
						+ "  <quantidade>1</quantidade>\n"
						+ "  <dataHora>\n"
						+ "    <time>1567712250000</time>\n"
						+ "    <timezone>America/Sao_Paulo</timezone>\n"
						+ "  </dataHora>\n"
						+ "</negociacao>";

		Assert.assertEquals(xmlExpected, xmlConverted);
	}

	@Test
	public void deveConverterXMLcomADataEpochETimeZone() {
		String xml =
				"<negociacao>\n"
						+ "  <preco>500.0</preco>\n"
						+ "  <quantidade>1</quantidade>\n"
						+ "  <dataHora>\n"
						+ "    <time>1567712250000</time>\n"
						+ "    <timezone>America/Sao_Paulo</timezone>\n"
						+ "  </dataHora>\n"
						+ "</negociacao>";

		XStream xStream = new XStream(new DomDriver());
		xStream.alias("negociacao", Negociacao.class);
		xStream.registerLocalConverter(Negociacao.class, "dataHora", new LocalDateTimeConverterSX());

		Negociacao negociacaoConverted = (Negociacao) xStream.fromXML(xml);
		Negociacao negociacaoExpected = new Negociacao(500, 1, LocalDateTime.of(2019, 9, 5, 16, 37, 30));

		Assert.assertEquals(negociacaoExpected, negociacaoConverted);
	}

}
