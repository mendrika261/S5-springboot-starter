package mg.springboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "mot_de_passe", nullable = false)
    private String motDePasse;

    @Column(name = "level")
    private int level;
}