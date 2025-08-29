package med.voll.api.medico;


import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@Getter
@NoArgsConstructor
@EqualsAndHashCode

public class Endereco {
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String uf;

}
