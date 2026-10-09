package tn.esprit.autoloc.Services;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.repository.IAgenceRepository;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements tn.esprit.autoloc.Services.IAgenceService {

    private final IAgenceRepository agenceRepository;

    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> retrieveAllAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence retrieveAgence(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }
}
