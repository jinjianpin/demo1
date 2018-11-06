package com.example.demo.service;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.demo.bean.Tuser;
import com.example.demo.bean.definition.JdbcTmplTuserService;
import com.example.demo.enums.SexEnum;

public class JdbcTmplTuserServiceImpl implements JdbcTmplTuserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private RowMapper<Tuser> getTuserMapper() {
		RowMapper<Tuser> tuserRowMapper = (ResultSet rs, int rownum) -> {
			Tuser tuser = new Tuser();
			tuser.setId(rs.getLong("id"));
			tuser.setUserName(rs.getString("user_name"));
			int intSexId = rs.getInt("sex");
			tuser.setSex(SexEnum.getEnumById(intSexId));
			tuser.setNote(rs.getString("note"));
			return tuser;
		};

		return tuserRowMapper;

	}

	@Override
	public Tuser getTuser(Long id) {
		String sql = "select id,user_name,sex,note from t_user where id=?";
		Object[] params = new Object[] { id };
		Tuser tuser = jdbcTemplate.queryForObject(sql, params, getTuserMapper());
		return tuser;
	}

	@Override
	public List<Tuser> findTusers(String username, String note) {
		String sql = "select id,user_name,sex,note from t_user" + " where user_name like concat('%',?,'%')"
				+ " and note like concat('%',?,'%')";

		Object[] params = new Object[] { username, note };
		List<Tuser> tuserList = jdbcTemplate.query(sql, params, getTuserMapper());

		return tuserList;

	}
	@Override
	public int insertTuser(Tuser tuser)
	{
		String sql="insert into t_user(user_name,sex,note) values(?,?,?);";
		return jdbcTemplate.update(sql,tuser.getUserName(),tuser.getSex().getId(),tuser.getNote());
		
	}
	@Override
	public int updateTuser(Tuser tuser)
	{
		String sql="update t_user set user_name=?,sex=?,note=?"
		+" where id=?";
		return jdbcTemplate.update(sql,tuser.getUserName(),tuser.getSex().getId(),tuser.getNote());
		
		
	}
	@Override
	public int deleteTuser(Long id)
	{
		String sql="delete from t_user where id=?";
		return jdbcTemplate.update(sql,id);
		
	}
}
