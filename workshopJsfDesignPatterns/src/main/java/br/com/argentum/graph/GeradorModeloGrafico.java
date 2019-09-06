package br.com.argentum.graph;

import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

import br.com.argentum.indicadores.MediaMovelSimples;
import br.com.argentum.model.SerieTemporal;

public class GeradorModeloGrafico {
	private SerieTemporal serie;
	private int begin;
	private int end;
	private LineChartModel graphModel;

	public GeradorModeloGrafico(SerieTemporal serie, int begin, int end) {
		this.serie = serie;
		this.begin = begin;
		this.end = end;

		graphModel = new LineChartModel();
		getGraphModel().setTitle("Indicadores");
		getGraphModel().setLegendPosition("w");
	}

	public void plotaMediaMovelSimples() {
		LineChartSeries line = new LineChartSeries();
		line.setLabel("MMS - Fechamento");

		MediaMovelSimples indicador = new MediaMovelSimples();

		double valor = 0;

		for (int i = begin; i <= end; i++) {
			valor = indicador.calcula(i, serie);

			line.set(i, valor);
		}

		graphModel.addSeries(line);
	}

	public LineChartModel getGraphModel() {
		return graphModel;
	}

}
