package com.stephanie.bff_agendador_tarefas.business;

import com.stephanie.bff_agendador_tarefas.business.dto.EnderecoDTO;
import com.stephanie.bff_agendador_tarefas.business.dto.TelefoneDTO;
import com.stephanie.bff_agendador_tarefas.business.dto.UsuarioDTO;
import com.stephanie.bff_agendador_tarefas.infrastructure.Client.UsuarioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioClient client;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO) {
        return client.salvaUsuario(usuarioDTO);
    }

    public String loginUsuario(UsuarioDTO usuarioDTO){
        return client.login(usuarioDTO);
    }

    public UsuarioDTO buscarUsuarioPorEmail(String email, String token){
        return client.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token) {
        client.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTO atualizarDadosUsuario(String token, UsuarioDTO dto){
        return client.atualizaDadosUsuario(dto, token);
    }

    public EnderecoDTO atualizaEndereco(Long idEndereco, EnderecoDTO enderecoDTO, String token){
        return client.atualizaEndereco(enderecoDTO, idEndereco, token);
    }

    public TelefoneDTO atualizaTelefone(Long idTelefone, TelefoneDTO dto, String token){
        return client.atualizaTelefone(dto, idTelefone, token);
    }

    public EnderecoDTO cadastraEndereco(String token, EnderecoDTO dto){
        return client.cadastraEndereco(dto, token);
    }

    public TelefoneDTO cadastraTelefone(String token, TelefoneDTO dto){
        return client.cadastraTelefone(dto, token);
    }
}