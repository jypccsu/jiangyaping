package com.huarui.springboot_152_5.service;

import com.huarui.springboot_152_5.pojo.Girl;

import java.util.List;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 14:37 2019/3/14
 * @ Description  : 女神业务层
 */
public interface GirlService {
    List<Girl> findAll();

    boolean insertGirl(Girl girl);

    boolean deleteGirlById(Integer id);

    Girl selectByPrimaryKey(Integer id);

    boolean updateGirl(Girl girl);
}
