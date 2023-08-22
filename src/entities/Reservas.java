package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservas {

	private Date dataE;
	private Date dataS;
	private Integer quarto;
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservas(Date dataE, Date dataS, Integer quarto) {

		this.dataE = dataE;
		this.dataS = dataS;
		this.quarto = quarto;
	}

	public Date getDataS() {
		return dataS;
	}

	public void setDataS(Date dataS, Date dataE) {
		this.dataS = dataS;
		this.dataE = dataE;
	}

	public Date getDataE() {
		return dataE;
	}

	public Integer getQuarto() {
		return quarto;
	}

	public long duracao() {
		long diff = dataS.getTime() - dataE.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public String toString() {

		return "Reserva : Quarto "+
		quarto+
		", Data de Entrada: "+
		dataE+
		", Data de Saida: "+
		dataS+
		", "+
		duracao()+
		" Dias \n";
	}

}
