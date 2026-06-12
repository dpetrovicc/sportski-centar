package rs.dp.sa.so;

import java.util.Calendar;
import java.util.Date;

import rs.dp.sa.baza.DBBroker;
import rs.dp.sa.domen.ApstraktniDomenskiObjekat;
import rs.dp.sa.domen.ClanskaKarta;

public class KreirajClanskuKartuSO extends ApstraktnaSO {

	@Override
	protected void validate(ApstraktniDomenskiObjekat ado) throws Exception {
		if(!(ado instanceof ClanskaKarta)) {
			throw new Exception("Prosledjeni objekat nije klase ClanskaKarta");
		}
		
		ClanskaKarta ck = (ClanskaKarta) ado;
		
		if(ck.getKorisnik() == null || ck.getKorisnik().getKorisnikId() == null) {
			throw new Exception("Clanska karta mora imati korisnika");
		}
		

	}

	@Override
	protected void execute(ApstraktniDomenskiObjekat ado) throws Exception {
		//TODO odradi kasnije
		ClanskaKarta ck = (ClanskaKarta)ado;
		
		Date sada = new Date();
		ck.setDatumAktivacije(sada);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(sada);
		cal.add(Calendar.YEAR, 1);
		ck.setVaziDo(cal.getTime());
		
		System.out.println("Datum aktivacije: " + ck.getDatumAktivacije());
		System.out.println("Datum isteka: " + ck.getVaziDo());
		
		DBBroker.getInstance().insert(ado);

	}

}
