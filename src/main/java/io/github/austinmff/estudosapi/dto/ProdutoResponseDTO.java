package io.github.austinmff.estudosapi.dto;

public class ProdutoResponseDTO {

    private String id;
    private String nome;
    private String descricao;
    private Double preco;

    public ProdutoResponseDTO(String id, String nome, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }
}
