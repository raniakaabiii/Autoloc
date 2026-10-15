package tn.esprit.autoloc.Services;

import java.util.List;
import tn.esprit.autoloc.domain.Client;

public interface IClientService {
    Client addClient(Client client);
    void deleteClient(Long id);
    List<Client> retrieveAllClients();
    Client retrieveClient(Long id);
    Client updateClient(Client client);
}
