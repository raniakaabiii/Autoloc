package tn.esprit.autoloc.Services;

import java.util.List;
import tn.esprit.autoloc.domain.Paiement;

public interface IPaiementService {
    List<Paiement> retrieveAllPaiements();
    Paiement retrievePaiement(Long id);
}
