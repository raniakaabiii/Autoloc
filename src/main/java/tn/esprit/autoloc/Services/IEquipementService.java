package tn.esprit.autoloc.service;

import java.util.List;
import tn.esprit.autoloc.domain.Equipement;

public interface IEquipementService {
    Equipement addEquipement(Equipement equipement);
    void deleteEquipement(Long id);
    List<Equipement> retrieveAllEquipements();
    Equipement retrieveEquipement(Long id);
    Equipement updateEquipement(Equipement equipement);
}
