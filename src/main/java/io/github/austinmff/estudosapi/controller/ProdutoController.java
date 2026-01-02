package io.github.austinmff.estudosapi.controller;

import io.github.austinmff.estudosapi.dto.ProdutoRequestDTO;
import io.github.austinmff.estudosapi.dto.ProdutoResponseDTO;
import io.github.austinmff.estudosapi.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ProdutoResponseDTO salvar(@RequestBody ProdutoRequestDTO dto) {
        return produtoService.salvar(dto);
    }

    @GetMapping("/{id}")
    public ProdutoResponseDTO buscarPorId(@PathVariable String id) {
        return produtoService.buscarPorId(id);
    }

    @GetMapping
    public List<ProdutoResponseDTO> listarTodos() {
        return produtoService.listarTodos();
    }

    @PutMapping("/{id}")
    public ProdutoResponseDTO atualizar(
            @PathVariable String id,
            @RequestBody ProdutoRequestDTO dto) {
        return produtoService.atualizar(id, dto);
    }

    @GetMapping("/buscar")
    public List<ProdutoResponseDTO> buscarPorNome(@RequestParam String nome) {
        return produtoService.buscarPorNome(nome);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) {
        produtoService.excluir(id);
    }
}

