package mg.springboot.service;

import mg.springboot.entity.Utilisateur;
import mg.springboot.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtilisateurService {
    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    public Optional<Utilisateur> findByLoginAndMotDePasse(String login, String motDePasse) {
        return utilisateurRepository.findByLoginAndMotDePasse(login, motDePasse);
    }
}
