package br.com.argentum.reader;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.argentum.model.Negociacao;

public class XMLReaderTest {

	@Test
	public void getXMLComApenasUmaNegociacao() {
		String xml =
				"<list>\n"
						+ "  <negociacao>\n"
						+ "    <preco>500.0</preco>\n"
						+ "    <quantidade>1</quantidade>\n"
						+ "    <data>\n"
						+ "      <time>1567712250000</time>\n"
						+ "      <timezone>America/Sao_Paulo</timezone>\n"
						+ "    </data>\n"
						+ "  </negociacao>\n"
						+ "</list>";

		InputStream inputStream = new ByteArrayInputStream(xml.getBytes());

		XMLReader xmlReader = new XMLReader();
		List<Negociacao> negociacoesFromXML = xmlReader.getNegociacoesFromXML(inputStream);

		Negociacao negociacaoExpected = new Negociacao(500, 1, LocalDateTime.of(2019, 9, 5, 16, 37, 30));

		Assert.assertEquals(1, negociacoesFromXML.size());
		Assert.assertEquals(negociacaoExpected, negociacoesFromXML.get(0));
	}

}
