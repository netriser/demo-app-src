package local.mon_projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsernameRepository extends JpaRepository<Username, Long> {
}
