package br.com.jnb.productsapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private double preco;


}
