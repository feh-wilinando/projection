package br.com.caelum.data.peojection;

import br.com.caelum.data.projection.ProjectionApplication;
import br.com.caelum.data.projection.domain.Livro;
import br.com.caelum.data.projection.projections.SimpleLivro;
import br.com.caelum.data.projection.repositories.LivroRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProjectionApplication.class)
public class ProjectionApplicationTests {


    @Autowired
    private LivroRepository livroRepository;

    @Test
	public void contextLoads() {


        livroRepository.save(new Livro("OCA", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("OCP", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("OCD", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("OCX", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("OCE", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("OCT", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("OCY", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("TCY", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("YCY", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("HCY", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("DCY", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("ACY", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("SCY", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("CCY", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("XCY", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("ZCY", "123", BigDecimal.TEN));
        livroRepository.save(new Livro("QCY", "123", BigDecimal.TEN));


        Page<SimpleLivro> livros = livroRepository.listar("OC%", new PageRequest(0, 5));

        livros.getContent().forEach(l -> System.out.println(l.getTitulo() + " " + l.getPreco()));


    }

}
