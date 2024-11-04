package br.com.fiap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.beans.Cliente;
import br.com.fiap.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public void create(@RequestBody Cliente cliente) {
        clienteService.create(cliente);
    }

    @GetMapping("/{cpf}")
    public Cliente read(@PathVariable String cpf) {
        return clienteService.read(cpf);
    }

    @PutMapping
    public void update(@RequestBody Cliente cliente) {
        clienteService.update(cliente);
    }

    @DeleteMapping("/{cpf}")
    public void delete(@PathVariable String cpf) {
        clienteService.delete(cpf);
    }

    @GetMapping
    public List<Cliente> listAll() {
        return clienteService.listAll();
    }
}
