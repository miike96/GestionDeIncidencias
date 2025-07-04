package app.service;

import app.dto.ClienteDTO;
import app.model.Cliente;
import app.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService{

    private final ClienteRepository clienteRepository;

    @Override
    public ClienteDTO crearCliente(ClienteDTO dto) {
        Cliente cliente = Cliente.builder()
                .nombre(dto.getNombre())
                .email(dto.getEmail())
                .telefono(dto.getTelefono())
                .build();

        Cliente guardado = clienteRepository.save(cliente);
        return mapToDTO(guardado);
    }

    @Override
    public List<ClienteDTO> obtenerTodos() {
        return clienteRepository.findAll()
                .stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ClienteDTO> obtenerPorId(Long id) {
        return clienteRepository.findById(id)
                .map(this::mapToDTO);
    }

    @Override
    public Optional<ClienteDTO> obtenerPorEmail(String email) {
        return clienteRepository.findByEmail(email)
                .map(this::mapToDTO);
    }

    @Override
    public ClienteDTO actualizarCliente(Long id, ClienteDTO dto) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));

        cliente.setNombre(dto.getNombre());
        cliente.setEmail(dto.getEmail());
        cliente.setTelefono(dto.getTelefono());

        return mapToDTO(clienteRepository.save(cliente));
    }

    @Override
    public void eliminarCliente(Long id) {
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("Cliente no encontrado");
        }
        clienteRepository.deleteById(id);
    }

    private ClienteDTO mapToDTO(Cliente cliente) {
        return ClienteDTO.builder()
                .id(cliente.getId())
                .nombre(cliente.getNombre())
                .email(cliente.getEmail())
                .telefono(cliente.getTelefono())
                .build();
    }
}
