package rs.dp.sa.so;

import rs.dp.sa.baza.DBBroker;
import rs.dp.sa.domen.ApstraktniDomenskiObjekat;
import rs.dp.sa.domen.Korisnik;

public class KreirajKorisnikaSO extends ApstraktnaSO {

	@Override
	protected void validate(ApstraktniDomenskiObjekat ado) throws Exception {
		if(!(ado instanceof Korisnik)) {
			throw new Exception("Prosledjeni objekat nije klase Korisnik");
		}
		
		Korisnik k = (Korisnik) ado;
		
		if(k.getIme() == null || k.getIme().trim().isEmpty()) {
			throw new Exception("Ime je obavezno polje");
		}
		
		if(k.getPrezime() == null || k.getPrezime().trim().isEmpty()) {
			throw new Exception("Prezme je obavezno polje");
		}
		
		if(k.getEmail() == null || k.getEmail().trim().isEmpty()) {
			throw new Exception("Email je obavezno polje");
		}
		
		if(!(k.getEmail().contains("@"))) {
			throw new Exception("Email mora sadrzati @ karakter");
		}
		
		

	}

	@Override
	protected void execute(ApstraktniDomenskiObjekat ado) throws Exception {
		//TODO odradi kasnije
		DBBroker.getInstance().insert(ado);

	}

}
