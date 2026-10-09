package tn.esprit.autoloc.Services;

import java.util.List;
import tn.esprit.autoloc.domain.Agence;

public interface IAgenceService {
    Agence addAgence(Agence agence);
    void deleteAgence(Long id);
    List<Agence> retrieveAllAgences();
    Agence retrieveAgence(Long id);
    Agence updateAgence(Agence agence);
}
