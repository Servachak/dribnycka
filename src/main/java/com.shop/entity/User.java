package com.shop.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by adavi on 01.09.2017.
 */
/**Анотація Entity вказує на те що цей клас е сутністю**/
@Entity
/** --- @Table --- Дає можливість самим назвати свою таблицю**/
//@Table(name = "Покупці")
public class User implements UserDetails{

    @Id   /** Вказує що дане поле є унікальним визначником**/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /** Автоматично буде збільшувати на 1 число id**/
    private int id;

    private String name;
    private String email;
    private String password;
    private String phoneNumber;

    @Enumerated
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Dress> dressList = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Orders> ordersList = new ArrayList<>();

    public User () {

    }

    public User(String name, String email, String password, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add( new SimpleGrantedAuthority(role.name()));
        return authorities ;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return String.valueOf(id);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
