package com.cydeo.mapper;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    @Autowired
    ModelMapper mapper;
    public Role convertToEntity(RoleDTO dto){
      return  mapper.map(dto , Role.class);
    }

    public RoleDTO convertToDTO(Role entity){
      return   mapper.map(entity , RoleDTO.class);
    }
}
