package com.javaworkspace.connectoracle;
import java.util.GregorianCalendar;


public class Medicamento 
{
	private int medicamento_id;
	private int medico_id;
	private String nome;
	private double dose;
	private int periodicidade;
	private int quantidade;
	private GregorianCalendar dataFinal;
	
	public Medicamento(int medicamento_id, int medico_id, String nome, double dose, int periodicidade, int quantidade, GregorianCalendar dataFinal) 
	{
		this.medicamento_id = medicamento_id;
		this.medico_id = medico_id;
		this.nome = nome;
		this.dose = dose;
		this.periodicidade = periodicidade;
		this.quantidade = quantidade;
		this.dataFinal = dataFinal;
	}

	public int getMedico_id() {
		return medico_id;
	}

	public void setMedico_id(int medico_id) {
		this.medico_id = medico_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDose() {
		return dose;
	}

	public void setDose(double dose) {
		this.dose = dose;
	}

	public int getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(int periodicidade) {
		this.periodicidade = periodicidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getMedicamento_id() {
		return medicamento_id;
	}

	public void setMedicamento_id(int medicamento_id) {
		this.medicamento_id = medicamento_id;
	}

	public GregorianCalendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(GregorianCalendar dataFinal) {
		this.dataFinal = dataFinal;
	}


	@Override
	public String toString() {
		return "Medicamento [medicamento_id=" + medicamento_id + ", medico_id="
				+ medico_id + ", nome=" + nome + ", dose=" + dose
				+ ", periodicidade=" + periodicidade + ", quantidade="
				+ quantidade + ", dataFinal=" + dataFinal + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicamento other = (Medicamento) obj;
		if (Double.doubleToLongBits(dose) != Double
				.doubleToLongBits(other.dose))
			return false;
		if (medico_id != other.medico_id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (periodicidade != other.periodicidade)
			return false;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}
}
	
	




