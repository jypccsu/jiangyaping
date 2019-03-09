package com.huarui.springboot_152_2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 15:29 2019/3/8
 * @ Description  : 资源库
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    //自定义查询（根据年龄）
    List<Girl> findByAge(Integer age);
}
