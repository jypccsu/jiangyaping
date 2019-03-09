package com.huarui.springboot_152_2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 15:27 2019/3/8
 * @ Description  : Girl实体类
 */
@Entity
public class Girl {
    /** 编号 */
    @Id
    @GeneratedValue
    private Integer id;

    /** 罩杯    cup_size*/
    private String cupSize;

    /** 年龄 */
    private Integer age;

    public Girl() {
    }

    public Girl(String cupSize, Integer age) {
        this.cupSize = cupSize;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
