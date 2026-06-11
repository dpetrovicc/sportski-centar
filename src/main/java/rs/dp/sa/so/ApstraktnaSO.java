package rs.dp.sa.so;

import java.sql.SQLException;

import rs.dp.sa.baza.DBBroker;
import rs.dp.sa.domen.ApstraktniDomenskiObjekat;

public abstract class ApstraktnaSO {

	protected abstract void validate(ApstraktniDomenskiObjekat ado);
	protected abstract void execute(ApstraktniDomenskiObjekat ado);
	
	public void templateExecute(ApstraktniDomenskiObjekat ado) {
		try {
			validate(ado);
			execute(ado);
			commit();
		}catch (Exception e) {
			rollback();
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public void commit() throws SQLException {
		if(DBBroker.getInstance().getConnection() != null) {
			try {
				DBBroker.getInstance().getConnection().commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;
			}
		}
	}
	
	public void rollback() {
		if(DBBroker.getInstance().getConnection() != null) {
			try {
				DBBroker.getInstance().getConnection().rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
