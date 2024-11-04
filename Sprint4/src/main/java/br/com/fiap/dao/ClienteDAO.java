package br.com.fiap.dao;

import br.com.fiap.beans.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    // Método para criar um novo cliente
    public void create(Cliente cliente) {
        // Código para inserir o cliente no banco de dados
    }

    // Método para buscar um cliente pelo CPF
    public Cliente read(String cpf) {
        // Código para buscar o cliente no banco de dados pelo CPF
        return null;
    }

    // Método para atualizar um cliente
    public void update(Cliente cliente) {
        // Código para atualizar o cliente no banco de dados
    }

    // Método para deletar um cliente pelo CPF
    public void delete(String cpf) {
        // Código para deletar o cliente do banco de dados pelo CPF
    }

    // Método para listar todos os clientes
    public List<Cliente> listAll() {
        // Código para listar todos os clientes
        return new ArrayList<>();
    }
}
