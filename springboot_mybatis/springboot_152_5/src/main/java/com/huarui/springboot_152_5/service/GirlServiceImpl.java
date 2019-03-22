package com.huarui.springboot_152_5.service;

import com.huarui.springboot_152_5.mapper.GirlMapper;
import com.huarui.springboot_152_5.pojo.Girl;
import com.huarui.springboot_152_5.pojo.GirlExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 14:38 2019/3/14
 * @ Description  :
 */
@Service
public class GirlServiceImpl implements GirlService {
    @Autowired
    GirlMapper girlMapper;

    @Override
    public List<Girl> findAll() {
        GirlExample girlExample=new GirlExample();
        return girlMapper.selectByExample(girlExample);
    }

    @Override
    public boolean insertGirl(Girl girl) {
        int insert = girlMapper.insert(girl);
        return insert>0;
    }

    @Override
    public boolean deleteGirlById(Integer id) {
        int i = girlMapper.deleteByPrimaryKey(id);
        return i>0;
    }

    @Override
    public Girl selectByPrimaryKey(Integer id) {
        return girlMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateGirl(Girl girl) {
        int i = girlMapper.updateByPrimaryKey(girl);
        return i>0;
    }
}
