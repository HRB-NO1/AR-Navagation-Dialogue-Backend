package com.example.myproject.mapper;

import com.example.myproject.model.Dialogue;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DialogueMapper {
    @Select("SELECT * FROM dialogue")
    List<Dialogue> findAll();

    @Select("SELECT * FROM dialogue WHERE building_name = #{building_name}")
    Dialogue findByBuildingName(String building_name);
}
