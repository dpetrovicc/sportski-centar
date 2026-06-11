package rs.dp.sa.baza;

import java.sql.Connection;
import java.util.ArrayList;

import rs.dp.sa.domen.ApstraktniDomenskiObjekat;

public class DBBroker {

	private static DBBroker instance;
	private Connection connection;
	
	private DBBroker() {
		// TODO Auto-generated constructor stub
	}
	
	public static DBBroker getInstance(){
		if(instance == null) {
			instance = new DBBroker();
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}

	public void insert(ApstraktniDomenskiObjekat ado) {
		System.out.println("insert metoda " + ado.nazivTabele());
	}
	
	public ArrayList<ApstraktniDomenskiObjekat> select(ApstraktniDomenskiObjekat ado){
		System.out.println("select metoda za tabelu " + ado.nazivTabele());
		return new ArrayList<>();
	}
	
	
	
}
