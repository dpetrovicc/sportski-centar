package rs.dp.sa.so;

import java.util.ArrayList;

import rs.dp.sa.baza.DBBroker;
import rs.dp.sa.domen.ApstraktniDomenskiObjekat;
import rs.dp.sa.domen.Korisnik;

public class PronadjiKorisnikeSO extends ApstraktnaSO {

	private ArrayList<ApstraktniDomenskiObjekat> korisnici;
	@Override
	protected void validate(ApstraktniDomenskiObjekat ado) throws Exception {
		if(!(ado instanceof Korisnik)) {
			throw new Exception("Prosledjeni objekat mora biti instanca klase Korisnik");
		}
		
	}

	@Override
	protected void execute(ApstraktniDomenskiObjekat ado) throws Exception {
		//TODO odradi kasnije
		korisnici = DBBroker.getInstance().select(ado);

	}
	
	public ArrayList<ApstraktniDomenskiObjekat> vratiListuKorisnika(){
		return korisnici;
	}

}
