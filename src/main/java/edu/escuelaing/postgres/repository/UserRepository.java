package edu.escuelaing.postgres.repository;

import edu.escuelaing.postgres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

