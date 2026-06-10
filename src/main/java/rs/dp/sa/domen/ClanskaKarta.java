package rs.dp.sa.domen;

import java.util.Date;
import java.util.Objects;

public class ClanskaKarta {

	private Long kartaId;
	private Date datumAktivacije;
	private Date vaziDo;
	private Korisnik korisnik;
	
	public ClanskaKarta() {
		// TODO Auto-generated constructor stub
	}

	public ClanskaKarta(Long kartaId, Date datumAktivacije, Date vaziDo, Korisnik korisnik) {
		super();
		this.kartaId = kartaId;
		this.datumAktivacije = datumAktivacije;
		this.vaziDo = vaziDo;
		this.korisnik = korisnik;
	}

	public Long getKartaId() {
		return kartaId;
	}

	public void setKartaId(Long kartaId) {
		this.kartaId = kartaId;
	}

	public Date getDatumAktivacije() {
		return datumAktivacije;
	}

	public void setDatumAktivacije(Date datumAktivacije) {
		this.datumAktivacije = datumAktivacije;
	}

	public Date getVaziDo() {
		return vaziDo;
	}

	public void setVaziDo(Date vaziDo) {
		this.vaziDo = vaziDo;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kartaId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClanskaKarta other = (ClanskaKarta) obj;
		return Objects.equals(kartaId, other.kartaId);
	}

	@Override
	public String toString() {
		return "ClanskaKarta [kartaId=" + kartaId + ", datumAktivacije=" + datumAktivacije + ", vaziDo=" + vaziDo + "]";
	}
	
	
}
