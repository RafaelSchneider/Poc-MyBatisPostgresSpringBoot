package br.com.rest.springrest.contract.v1.model;

/**
 * Created by schneider on 19/11/17.
 */
public class Pessoa {
    private Long id;
    private String nome;
    private Integer idade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
