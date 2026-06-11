package rs.dp.sa.domen;

import java.util.Objects;

public class StavkaRezervacije {

	private Long stavkaId;
	private Double cena;
	private String napomena;
	private Integer brojSati;
	private Sala sala;
	private RezervacijaTermina rezervacijaTermina;
	private Racun racun;
	
	public StavkaRezervacije() {
		// TODO Auto-generated constructor stub
	}

	public StavkaRezervacije(Long stavkaId, Double cena, String napomena, Integer brojSati, Sala sala,
			RezervacijaTermina rezervacijaTermina, Racun racun) {
		super();
		this.stavkaId = stavkaId;
		this.cena = cena;
		this.napomena = napomena;
		this.brojSati = brojSati;
		this.sala = sala;
		this.rezervacijaTermina = rezervacijaTermina;
		this.racun = racun;
	}

	public Long getStavkaId() {
		return stavkaId;
	}

	public void setStavkaId(Long stavkaId) {
		this.stavkaId = stavkaId;
	}

	public Double getCena() {
		return cena;
	}

	public void setCena(Double cena) {
		this.cena = cena;
	}

	public String getNapomena() {
		return napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public Integer getBrojSati() {
		return brojSati;
	}

	public void setBrojSati(Integer brojSati) {
		this.brojSati = brojSati;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public RezervacijaTermina getRezervacijaTermina() {
		return rezervacijaTermina;
	}

	public void setRezervacijaTermina(RezervacijaTermina rezervacijaTermina) {
		this.rezervacijaTermina = rezervacijaTermina;
	}

	public Racun getRacun() {
		return racun;
	}

	public void setRacun(Racun racun) {
		this.racun = racun;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rezervacijaTermina, stavkaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StavkaRezervacije other = (StavkaRezervacije) obj;
		return Objects.equals(rezervacijaTermina, other.rezervacijaTermina) && Objects.equals(stavkaId, other.stavkaId);
	}

	@Override
	public String toString() {
		return "StavkaRezervacije [cena=" + cena + ", napomena=" + napomena + ", brojSati=" + brojSati + "]";
	}
	
	
	
}
