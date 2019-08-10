package com.glv.org.dao;

import java.util.List;

import com.glv.org.entite.Client;

public interface IClientDAO {

	public boolean saveClient(Client client);
	public List<Client> getClients();
	public boolean deleteClient(Client client);
	public List<Client> getClientByID(Client client);
	public boolean updateClient(Client client);
}
