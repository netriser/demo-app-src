package local.mon_projet.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import local.mon_projet.demo.model.Username; // Import correct

@Repository
public interface UsernameRepository extends JpaRepository<Username, Long> {
}
