package rs.dp.sa.domen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

public class Korisnik extends ApstraktniDomenskiObjekat {

	private Long korisnikId;
	private String ime;
	private String prezime;
	private String email;
	private String telefon;
	
	public Korisnik() {
		// TODO Auto-generated constructor stub
	}

	public Korisnik(Long korisnikId, String ime, String prezime, String email, String telefon) {
		super();
		this.korisnikId = korisnikId;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.telefon = telefon;
	}

	public Long getKorisnikId() {
		return korisnikId;
	}

	public void setKorisnikId(Long korisnikId) {
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

	@Override
	public String nazivTabele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alijas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String join() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<ApstraktniDomenskiObjekat> vratiListu(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String koloneZaInsert() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vrednostiZaInsert() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vrednostiZaUpdate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String uslov() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String uslovZaSelect() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
