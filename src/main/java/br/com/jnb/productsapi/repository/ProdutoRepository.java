package br.com.jnb.productsapi.repository;

import br.com.jnb.productsapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
