package br.com.caelum.data.projection.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Livro {
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String isbn;
    private BigDecimal preco;


    /**
     * @deprecated framework's only
     */
    private Livro() {}

    public Livro(String titulo, String isbn, BigDecimal preco) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public BigDecimal getPreco() {
        return preco;
    }
}
