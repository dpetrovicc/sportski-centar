package rs.dp.sa.domen;

import java.util.Objects;

public class Trener {

	private Long trenerId;
	private String ime;
	private String prezime;
	private String telefon;
	private Sala sala;
	
	public Trener() {
		// TODO Auto-generated constructor stub
	}

	public Trener(Long trenerId, String ime, String prezime, String telefon, Sala sala) {
		super();
		this.trenerId = trenerId;
		this.ime = ime;
		this.prezime = prezime;
		this.telefon = telefon;
		this.sala = sala;
	}

	public Long getTrenerId() {
		return trenerId;
	}

	public void setTrenerId(Long trenerId) {
		this.trenerId = trenerId;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ime, prezime, telefon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trener other = (Trener) obj;
		return Objects.equals(ime, other.ime) && Objects.equals(prezime, other.prezime)
				&& Objects.equals(telefon, other.telefon);
	}

	@Override
	public String toString() {
		return ime + " " + prezime;
	}
	
	
	
}
