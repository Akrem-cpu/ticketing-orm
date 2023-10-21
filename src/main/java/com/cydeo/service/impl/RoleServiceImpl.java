package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.entity.Role;
import com.cydeo.repository.RoleRepository;
import com.cydeo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
   private RoleRepository roleRepository;


    @Override
    public List<RoleDTO> findAllRole() {
        List<Role> roleList = roleRepository.findAll();
        // convert entity to dto/ mapper
        return null;
    }

    @Override
    public RoleDTO findById(Long Id) {
        return null;
    }
}
