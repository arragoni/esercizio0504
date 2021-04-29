package it.epicode.esercizio0504.connection;

import java.sql.SQLException;
import java.util.List;

import it.epicode.esercizio0504.model.Fornitore;

public interface AbstractArchivioFornitore {
	
	List<Fornitore> listaFornitori() throws SQLException;
	
	void inserisciFornitore(Fornitore f) throws SQLException;

	void rimuoviFornitore(int codiceFornitore) throws SQLException;
	
	// METODO CHE METTO A COMMENTO PERCHE' AL MOMENTO DISABILITATO
//	List<Prodotto> listaProdotti() throws SQLException;
}
