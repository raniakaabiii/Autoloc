package tn.esprit.autoloc.Services;

import java.util.List;
import tn.esprit.autoloc.domain.Maintenance;

public interface IMaintenanceService {
    Maintenance addMaintenance(Maintenance maintenance);
    void deleteMaintenance(Long id);
    List<Maintenance> retrieveAllMaintenances();
    Maintenance retrieveMaintenance(Long id);
    Maintenance updateMaintenance(Maintenance maintenance);
}
