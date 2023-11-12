package com.example.its.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Select;

import com.example.its.model.UserModel;

public interface UserRepository {
	
	@Select("select * from users where usename = #{username}")
	Optional<UserModel> findByUseername(String username);
	
	@Select("select * from users")
	List<UserModel> findAll();
	
//    @Select("select * from issues where id = #{issueId}")
//    IssueEntity findById(long issueId);

}
