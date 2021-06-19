package com.spring.security.model;

import java.util.Set;

public class User {

    private long id;

    private String email;

    private String password;

    private String age;

    private String address;

    private int active;

    private Set<Role> roles;

    private Set<Authorities> authorities;
}
