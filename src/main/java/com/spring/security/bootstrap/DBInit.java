package com.spring.security.bootstrap;

import com.spring.security.model.Authorities;
import com.spring.security.model.Role;
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
        User user = this.userRepo.findByEmail("kareem.ayman@yahoo.com");
        System.out.println(user.getAddress());
//        userRepo.deleteAll();
//        User admin = new User("ahmed.elsheikh@yahoo.com", "ahmed123", "25", "Cairo", 1);
//        admin.setRoles(roleRepo.findAll());
//        admin.setAuthorities(authoritiesRepo.findAll());
//        userRepo.save(admin);
//        ////////////////////////////////////////////////
//        User manager = new User("yasser.ali@yahoo.com", "yasser123", "40", "Tanata", 1);
//        Role managerRole1 =  roleRepo.findById(2L).get();
//        Role managerRole2 = roleRepo.findById(3L).get();
//        Authorities managerAuthorities1 = authoritiesRepo.findById(2L).get();
//        Authorities managerAuthorities2 = authoritiesRepo.findById(3L).get();
//
//        manager.getRoles().add(managerRole1);
//        manager.getRoles().add(managerRole2);
//        manager.getAuthorities().add(managerAuthorities1);
//        manager.getAuthorities().add(managerAuthorities2);
//        userRepo.save(manager);
//        ///////////////////////////////////////////////
//        User user = new User("kareem.ayman@yahoo.com", "kareem123", "50", "Giza", 1);
//        Role userRole = roleRepo.findById(3L).get();
//        Authorities userAuthorities = authoritiesRepo.findById(3L).get();
//        user.getRoles().add(userRole);
//        user.getAuthorities().add(userAuthorities);
//        userRepo.save(user);

    }
}
