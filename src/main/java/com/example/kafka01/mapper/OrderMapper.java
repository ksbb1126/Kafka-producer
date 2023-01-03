package com.example.kafka01.mapper;

import com.example.kafka01.domain.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {
  @Select("SELECT * FROM orders")
  public List<Order> selectAll();
}

