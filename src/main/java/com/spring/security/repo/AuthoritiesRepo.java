package com.spring.security.repo;

import com.spring.security.model.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesRepo extends JpaRepository<Authorities, Long> {
}
