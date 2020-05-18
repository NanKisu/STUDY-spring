package com.study.spring.springsecurity.vo;

import java.awt.List;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class MyUser extends User {

  private static final long serialVersionUID = 1L;

  public MyUser() {
    super("nankisu", "nankisu", true, true, true, true, AuthorityUtils.createAuthorityList("ROLE_USER"));
  }

  public MyUser(String username, String password, boolean enabled, boolean accountNonExpired,
      boolean credentialsNonExpired, boolean accountNonLocked,
      Collection<? extends GrantedAuthority> authorities) {
    super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked,
        authorities);
  }

}
