package com.example.casestudymodule4.model.DTO.response;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class JwtResponse {
    private Long id;
    private String token;
    private String type = "Bearer";
    private String gmail;
    private final Collection<? extends GrantedAuthority> roles;

    public JwtResponse(Long id, String token, String gmail, Collection<? extends GrantedAuthority> roles) {
        this.id = id;
        this.token = token;
        this.gmail = gmail;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Collection<? extends GrantedAuthority> getRoles() {
        return roles;
    }
}
