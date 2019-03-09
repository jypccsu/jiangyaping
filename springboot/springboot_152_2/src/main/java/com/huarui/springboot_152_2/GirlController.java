package com.huarui.springboot_152_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 15:31 2019/3/8
 * @ Description  : Girl控制器
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    //查询所有女生
    @GetMapping("/girls")
    public List<Girl> girlList(){
        List<Girl> all = girlRepository.findAll();
        return all;
    }

    //增加
    @PostMapping("/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                        @RequestParam("age") Integer age){
        Girl girl=new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return girlRepository.save(girl);
    }

    //查询单个女生
    @GetMapping("/girls/{id}")
    public Optional<Girl> girlFindOne(@PathVariable("id") Integer id){
        Girl girl=new Girl();
        girl.setId(id);
        Example<Girl> example = Example.of(girl);
        return girlRepository.findOne(example);
    }

    //更新
    @PutMapping("/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl=new Girl(cupSize,age);
        girl.setId(id);
        return girlRepository.save(girl);
    }

    //删除
    @DeleteMapping("/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        Girl girl=new Girl();
        girl.setId(id);
        girlRepository.delete(girl);
    }

    //根据年龄查询女生
    @GetMapping("/girls/age/{age}")
    public List<Girl> girlByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }
}
