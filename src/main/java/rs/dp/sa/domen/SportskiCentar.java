package rs.dp.sa.domen;

import java.util.Objects;

public class SportskiCentar {

	private Long sportskiCentarId;
	private String naziv;
	private String adresa;
	private String telefon;
	
	public SportskiCentar() {
		// TODO Auto-generated constructor stub
	}

	public SportskiCentar(Long sportskiCentarId, String naziv, String adresa, String telefon) {
		super();
		this.sportskiCentarId = sportskiCentarId;
		this.naziv = naziv;
		this.adresa = adresa;
		this.telefon = telefon;
	}

	public Long getSportskiCentarId() {
		return sportskiCentarId;
	}

	public void setSportskiCentarId(Long sportskiCentarId) {
		this.sportskiCentarId = sportskiCentarId;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adresa, naziv);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SportskiCentar other = (SportskiCentar) obj;
		return Objects.equals(adresa, other.adresa) && Objects.equals(naziv, other.naziv);
	}

	@Override
	public String toString() {
		return naziv + ", " + adresa;
	}
	
	
	
}
