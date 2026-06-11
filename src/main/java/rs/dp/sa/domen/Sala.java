package rs.dp.sa.domen;

import java.util.Objects;

public class Sala {

	private Long salaId;
	private String naziv;
	private String naOtvorenom;
	private Double cenaPoSatu;
	private SportskiCentar sportskiCentar;
	
	public Sala() {
		// TODO Auto-generated constructor stub
	}

	public Sala(Long salaId, String naziv, String naOtvorenom, Double cenaPoSatu, SportskiCentar sportskiCentar) {
		super();
		this.salaId = salaId;
		this.naziv = naziv;
		this.naOtvorenom = naOtvorenom;
		this.cenaPoSatu = cenaPoSatu;
		this.sportskiCentar = sportskiCentar;
	}

	public Long getSalaId() {
		return salaId;
	}

	public void setSalaId(Long salaId) {
		this.salaId = salaId;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getNaOtvorenom() {
		return naOtvorenom;
	}

	public void setNaOtvorenom(String naOtvorenom) {
		this.naOtvorenom = naOtvorenom;
	}

	public Double getCenaPoSatu() {
		return cenaPoSatu;
	}

	public void setCenaPoSatu(Double cenaPoSatu) {
		this.cenaPoSatu = cenaPoSatu;
	}

	public SportskiCentar getSportskiCentar() {
		return sportskiCentar;
	}

	public void setSportskiCentar(SportskiCentar sportskiCentar) {
		this.sportskiCentar = sportskiCentar;
	}

	@Override
	public int hashCode() {
		return Objects.hash(naziv, salaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		return Objects.equals(naziv, other.naziv) && Objects.equals(salaId, other.salaId);
	}

	@Override
	public String toString() {
		return naziv;
	}
	
	
	
}
