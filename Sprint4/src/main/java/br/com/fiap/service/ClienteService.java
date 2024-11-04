package br.com.fiap.service;

import br.com.fiap.beans.Cliente;
import br.com.fiap.dao.ClienteDAO;
import java.util.List;

public class ClienteService {

    private ClienteDAO clienteDAO = new ClienteDAO();

    public void create(Cliente cliente) {
        if (cliente.getCpf() == null || cliente.getCpf().isEmpty()) {
            throw new IllegalArgumentException("CPF é obrigatório.");
        }
        clienteDAO.create(cliente);
    }

    public Cliente read(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF é obrigatório.");
        }
        return clienteDAO.read(cpf);
    }

    public void update(Cliente cliente) {
        if (cliente.getCpf() == null || cliente.getCpf().isEmpty()) {
            throw new IllegalArgumentException("CPF é obrigatório.");
        }
        clienteDAO.update(cliente);
    }

    public void delete(String cpf) {
        if (cpf == null || cpf.isEmpty()) {
            throw new IllegalArgumentException("CPF é obrigatório.");
        }
        clienteDAO.delete(cpf);
    }

    public List<Cliente> listAll() {
        return clienteDAO.listAll();
    }
}
