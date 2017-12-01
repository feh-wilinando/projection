package br.com.caelum.data.projection.repositories;

import br.com.caelum.data.projection.domain.Livro;
import br.com.caelum.data.projection.projections.SimpleLivro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;


public interface LivroRepository extends Repository<Livro, Long>{

    @Query("select l.titulo as titulo, l.preco as preco from Livro l where l.titulo like :titulo")
    Page<SimpleLivro> listar(@Param("titulo") String titulo, Pageable pageable);

    void save(Livro livro);
}
