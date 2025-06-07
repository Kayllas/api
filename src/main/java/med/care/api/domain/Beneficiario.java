package med.care.api.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "beneficiarios")
@Entity(name = "Beneficiario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Beneficiario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String nomeCompleto;

    private Boolean ativo;

    public Beneficiario(String email, String senha, String nomeCompleto) {
        this.email = email;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }
}
