package com.nttdata.hibernate1.inter;

import java.util.List;

public interface ClientDao {

	
	public void insert(Client insClient);
	public void delete(Client delClient);
	public void update(Client uptClient);
	public Client searchById(final Long clientId);
	public List<Client> searchAll();
	public List<Client> clientsearchByName(Client name, Client firstName,Client lastname);
}
