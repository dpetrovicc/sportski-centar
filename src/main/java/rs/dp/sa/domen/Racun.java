package rs.dp.sa.domen;

import java.util.Date;
import java.util.Objects;

public class Racun {

	
	private Long racunId;
	private Date datumIzdavanja;
	private Double ukupnaCena;
	private String statusPlacanja;
	
	public Racun() {
		// TODO Auto-generated constructor stub
	}

	public Racun(Long racunId, Date datumIzdavanja, Double ukupnaCena, String statusPlacanja) {
		super();
		this.racunId = racunId;
		this.datumIzdavanja = datumIzdavanja;
		this.ukupnaCena = ukupnaCena;
		this.statusPlacanja = statusPlacanja;
	}

	public Long getRacunId() {
		return racunId;
	}

	public void setRacunId(Long racunId) {
		this.racunId = racunId;
	}

	public Date getDatumIzdavanja() {
		return datumIzdavanja;
	}

	public void setDatumIzdavanja(Date datumIzdavanja) {
		this.datumIzdavanja = datumIzdavanja;
	}

	public Double getUkupnaCena() {
		return ukupnaCena;
	}

	public void setUkupnaCena(Double ukupnaCena) {
		this.ukupnaCena = ukupnaCena;
	}

	public String getStatusPlacanja() {
		return statusPlacanja;
	}

	public void setStatusPlacanja(String statusPlacanja) {
		this.statusPlacanja = statusPlacanja;
	}

	@Override
	public int hashCode() {
		return Objects.hash(racunId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Racun other = (Racun) obj;
		return Objects.equals(racunId, other.racunId);
	}

	@Override
	public String toString() {
		return "Racun [datumIzdavanja=" + datumIzdavanja + ", ukupnaCena=" + ukupnaCena + ", statusPlacanja="
				+ statusPlacanja + "]";
	}
	
	
	
}
