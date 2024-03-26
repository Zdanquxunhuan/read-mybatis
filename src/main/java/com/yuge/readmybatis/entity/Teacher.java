package com.yuge.readmybatis.entity;

import java.io.Serializable;

/**
 * @Author zhongcanyu
 * @Date 2024/1/21
 */
public class Teacher implements Serializable {

    private static final long serialVersionUID = -339516038496533943L;

    private Integer id;
    private String name;
    private Integer age;
    private String toClass;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", toClass='" + toClass + '\'' +
                '}';
    }
}
