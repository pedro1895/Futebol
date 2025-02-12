package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Escola;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EscolaRepository extends JpaRepository<Escola, Long> {
}
