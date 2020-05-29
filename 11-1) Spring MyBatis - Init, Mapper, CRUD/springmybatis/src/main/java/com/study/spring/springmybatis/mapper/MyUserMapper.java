package com.study.spring.springmybatis.mapper;

import java.util.List;
import com.study.spring.springmybatis.model.MyUser;

public interface MyUserMapper {
  public void create(MyUser myUser);
  
  public MyUser findById(Integer id);
  public List<MyUser> findAll();
  public long count();
  
  public long update(MyUser myUser);
  
  public long delete(Integer id);
}
