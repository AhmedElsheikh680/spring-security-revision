package com.spring.security.bootstrap;

import com.spring.security.model.User;
import com.spring.security.repo.AuthoritiesRepo;
import com.spring.security.repo.RoleRepo;
import com.spring.security.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service

public class DBInit  implements CommandLineRunner {

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    private final AuthoritiesRepo authoritiesRepo;

    @Autowired
    public DBInit(UserRepo userRepo, RoleRepo roleRepo, AuthoritiesRepo authoritiesRepo) {
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
        this.authoritiesRepo = authoritiesRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User("ahmed.elsheikh@yahoo.com", "ahmed123", "25", "Cairo", 1);
        user.setRoles(roleRepo.findAll());
        user.setAuthorities(authoritiesRepo.findAll());
        userRepo.save(user);

    }
}
