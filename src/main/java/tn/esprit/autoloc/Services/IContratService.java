package tn.esprit.autoloc.Services;

import java.util.List;
import tn.esprit.autoloc.domain.Contrat;

public interface IContratService {
    Contrat addContrat(Contrat contrat);
    void deleteContrat(Long id);
    List<Contrat> retrieveAllContrats();
    Contrat retrieveContrat(Long id);
    Contrat updateContrat(Contrat contrat);
}
