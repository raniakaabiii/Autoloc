package tn.esprit.autoloc.service;

import java.util.List;
import tn.esprit.autoloc.domain.Vehicule;

public interface IVehiculeService {
    Vehicule addVehicule(Vehicule vehicule);
    void deleteVehicule(Long id);
    List<Vehicule> retrieveAllVehicules();
    Vehicule retrieveVehicule(Long id);
    Vehicule updateVehicule(Vehicule vehicule);
}
