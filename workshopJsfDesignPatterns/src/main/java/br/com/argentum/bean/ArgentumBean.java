package br.com.argentum.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.LineChartModel;

import br.com.argentum.graph.GeradorModeloGrafico;
import br.com.argentum.indicadores.IndicadorFechamento;
import br.com.argentum.indicadores.MediaMovelPonderada;
import br.com.argentum.model.Candlestick;
import br.com.argentum.model.CandlestickFactory;
import br.com.argentum.model.Negociacao;
import br.com.argentum.model.SerieTemporal;
import br.com.argentum.webservice.ClientWebService;

@ViewScoped
@ManagedBean
public class ArgentumBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private LineChartModel graphLineModel;

	private List<Negociacao> negociacoes;

	public ArgentumBean() {
		negociacoes = new ClientWebService().getNegociacoes();
		List<Candlestick> candlesticks = new CandlestickFactory().getCandlestick(negociacoes);
		SerieTemporal serie = new SerieTemporal(candlesticks);

		GeradorModeloGrafico geradorModelo = new GeradorModeloGrafico(serie, 2, serie.getUltimaPosicao());
		geradorModelo.plotaIndicador(new MediaMovelPonderada(new IndicadorFechamento()));

		graphLineModel = geradorModelo.getGraphModel();
	}

	public List<Negociacao> getNegociacoes() {
		return negociacoes;
	}

	public LineChartModel getGraphLineModel() {
		return graphLineModel;
	}

}
