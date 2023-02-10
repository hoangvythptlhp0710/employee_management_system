package com.example.Employee_Management_System.mapper;

import com.example.Employee_Management_System.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO users (first_name, last_name, password, email, role, avatar, is_locked) VALUES (#{firstName}, #{lastName}, #{password}, #{email}, #{role}, #{avatar}, #{isLocked})")
    void save(User user);

    Optional<User> findByEmail(String email);

    Optional<User> findById(Long id);
}
