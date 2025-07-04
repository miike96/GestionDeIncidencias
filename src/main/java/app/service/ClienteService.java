package app.service;

import app.dto.ClienteDTO;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    ClienteDTO crearCliente(ClienteDTO clienteDTO);
    List<ClienteDTO> obtenerTodos();
    Optional<ClienteDTO> obtenerPorId(Long id);
    Optional<ClienteDTO> obtenerPorEmail(String email);
    ClienteDTO actualizarCliente(Long id, ClienteDTO clienteDTO);
    void eliminarCliente(Long id);

}
