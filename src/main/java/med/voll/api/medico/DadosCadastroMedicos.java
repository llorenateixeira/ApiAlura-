package med.voll.api.medico;

import med.voll.api.endereco.DadosEnderecos;

//DTO
public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade especialidade, DadosEnderecos endereco) {
}
