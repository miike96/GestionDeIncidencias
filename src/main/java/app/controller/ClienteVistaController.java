package app.controller;

import app.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ClienteVistaController {

    private final ClienteService clienteService;

    @GetMapping("/clientes")
    public String mostrarClientes(Model model) {
        model.addAttribute("clientes", clienteService.obtenerTodos());
        return "clientes";
    }
}