package rs.dp.sa.domen;

import java.util.Objects;

public class Korisnik {

	private Long korisnikId;
	private String ime;
	private String prezime;
	private String email;
	private String telefon;
	
	public Korisnik() {
		// TODO Auto-generated constructor stub
	}

	public Korisnik(long korisnikId, String ime, String prezime, String email, String telefon) {
		super();
		this.korisnikId = korisnikId;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.telefon = telefon;
	}

	public long getKorisnikId() {
		return korisnikId;
	}

	public void setKorisnikId(long korisnikId) {
		this.korisnikId = korisnikId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Korisnik other = (Korisnik) obj;
		return Objects.equals(email, other.email);
	}

	@Override
	public String toString() {
		return ime + " " + prezime;
	}
	
	
	
}
