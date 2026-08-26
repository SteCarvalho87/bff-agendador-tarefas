package com.stephanie.bff_agendador_tarefas.business.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTO {
    private Long id;
    private Long numero;
    private Long ddd;

}
