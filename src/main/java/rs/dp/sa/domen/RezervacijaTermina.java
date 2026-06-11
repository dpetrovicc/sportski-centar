package rs.dp.sa.domen;

import java.util.Date;
import java.util.Objects;

public class RezervacijaTermina {

	private Long rezervacijaId;
	private Date datum;
	private Double ukupnaCena;
	private String odobreno;
	private Korisnik korisnik;
	private SportskiCentar sportskiCentar;
	
	public RezervacijaTermina() {
		// TODO Auto-generated constructor stub
	}

	public RezervacijaTermina(Long rezervacijaId, Date datum, Double ukupnaCena, String odobreno, Korisnik korisnik,
			SportskiCentar sportskiCentar) {
		super();
		this.rezervacijaId = rezervacijaId;
		this.datum = datum;
		this.ukupnaCena = ukupnaCena;
		this.odobreno = odobreno;
		this.korisnik = korisnik;
		this.sportskiCentar = sportskiCentar;
	}

	public Long getRezervacijaId() {
		return rezervacijaId;
	}

	public void setRezervacijaId(Long rezervacijaId) {
		this.rezervacijaId = rezervacijaId;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Double getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(Double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}

	public String getOdobreno() {
		return odobreno;
	}

	public void setOdobreno(String odobreno) {
		this.odobreno = odobreno;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	public SportskiCentar getSportskiCentar() {
		return sportskiCentar;
	}

	public void setSportskiCentar(SportskiCentar sportskiCentar) {
		this.sportskiCentar = sportskiCentar;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rezervacijaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RezervacijaTermina other = (RezervacijaTermina) obj;
		return Objects.equals(rezervacijaId, other.rezervacijaId);
	}

	@Override
	public String toString() {
		return "RezervacijaTermina [datum=" + datum + ", ukupnaCena=" + ukupnaCena + ", odobreno=" + odobreno + "]";
	}
	
	
	
}
