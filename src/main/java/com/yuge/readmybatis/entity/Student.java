package com.yuge.readmybatis.entity;

import java.io.Serializable;

/**
 * @Author zhongcanyu
 * @Date 2024/1/16
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -339516038496531943L;

    /**
     * 学号
     */
    private String sno;
    private String name;
    private String sex;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
