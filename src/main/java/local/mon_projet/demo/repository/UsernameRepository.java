package local.mon.projet.demo.repository;

import local.mon.projet.demo.entity.Username;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsernameRepository extends JpaRepository<Username, Long> {
}
