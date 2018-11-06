package com.example.demo.bean.definition;

import java.util.List;

import com.example.demo.bean.Tuser;

public interface JdbcTmplTuserService {
  public Tuser getTuser(Long id);
  public List<Tuser> findTusers(String userName,String note);
  public int insertTuser(Tuser tuser);
  public int updateTuser(Tuser tuser);
  public int deleteTuser(Long id);
}
