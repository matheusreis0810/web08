package com.ads.loja;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ClienteController {

    @GetMapping("/api/cliente/{codigo}")
    public Cliente carregarDetalhe(@PathVariable("codigo") int id) {
        var obj = new Cliente();
        obj.setCodigo(id);
        obj.setNome("João da Silva");
        obj.setEmail("joao@email.com");
        obj.setTelefone("11999999999");
        return obj;
    }

    @PostMapping("/api/cliente/")
    public String gravar(@RequestBody Cliente obj) {
        return "Cliente gravado com sucesso " + obj.getNome();
    }

    @PutMapping("/api/cliente/")
    public String atualizar(@RequestBody Cliente obj) {
        return "Cliente " + obj.getCodigo() + " atualizado com sucesso " + obj.getNome();
    }

    @DeleteMapping("/api/cliente/{codigo}")
    public String excluir(@PathVariable("codigo") int id) {
        return "Cliente " + id + " excluído com sucesso";
    }
}