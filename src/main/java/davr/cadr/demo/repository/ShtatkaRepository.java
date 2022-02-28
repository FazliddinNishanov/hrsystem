package davr.cadr.demo.repository;

import davr.cadr.demo.entitiy.Shtatka;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShtatkaRepository extends JpaRepository<Shtatka , Integer> {

    boolean existsByWorkplaceName(String workplaceName);
}
