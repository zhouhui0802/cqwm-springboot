package com.zh.sky.service;

import com.zh.sky.dto.EmployeeDTO;
import com.zh.sky.dto.EmployeeLoginDTO;
import com.zh.sky.dto.EmployeePageQueryDTO;
import com.zh.sky.entity.Employee;
import com.zh.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 员工分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用禁用员工账户
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 根据iD查询用户信息
     * @param id
     * @return
     */
    Employee getById(Long id);

    /**
     * 编辑员工信息
     * @param employeeDTO
     */
    void update(EmployeeDTO employeeDTO);
}
