package tn.esprit.autoloc.service;

import java.util.List;
import tn.esprit.autoloc.domain.Employe;

public interface IEmployeService {
    Employe addEmploye(Employe employe);
    void deleteEmploye(Long id);
    List<Employe> retrieveAllEmployes();
    Employe retrieveEmploye(Long id);
    Employe updateEmploye(Employe employe);
}
