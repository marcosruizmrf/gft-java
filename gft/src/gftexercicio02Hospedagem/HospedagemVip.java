package gftexercicio02Hospedagem;

public class HospedagemVip extends Hospedagem {
	
	private Double valorAdicional;
		
	public HospedagemVip() {
		super();
	}

	public HospedagemVip(Double valorAdicional) {
		super();
		this.setValorAdicional(valorAdicional);
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double printValor() {
		return super.printValor() + valorAdicional;
	}

}
