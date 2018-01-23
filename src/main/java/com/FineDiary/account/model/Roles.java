package com.FineDiary.account.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="roles")
public class Roles {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

@Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<Users> user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Users> getUser() {
        return user;
    }

    public void setUser(Set<Users> user) {
        this.user = user;
    }
}
