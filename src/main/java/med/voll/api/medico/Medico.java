package med.voll.api.medico;


import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

//JPA
@Table(name = "medicos")
@Entity(nome = "Medico")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

       @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
       private Long id;
       private String nome;
       private String email;
       private String crm;

       @Enumerated(EnumType.STRING)
       private Especialidade especialidade;

       @Enumerated
       private Endereco endereco;
}
