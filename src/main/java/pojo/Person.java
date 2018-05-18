package pojo;

import com.opensymphony.xwork2.inject.Scope;
import com.sun.jndi.cosnaming.IiopUrl;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.GenericGenerator;
import pojo.Address;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
@Entity
// 定义辨别者列的列名为person_type，列类型为字符串
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="person_inf")
@NamedQuery(name="myNameQuery", query = "from Person  as p where  p.id=?")
public class Person
{
    // 标识属性
    @Id @Column(name="person_id")
    // 由于不能使用identity主键生成策略，故此处采用hilo主键生成策略
    @GenericGenerator(name="person_hilo" , strategy="hilo")
    @GeneratedValue(generator="person_hilo")
    private Integer id;
    private String name;
    private char gender;
    // 定义该Person实体的组件属性：address
    private Address address;
    // 无参数的构造器
    public Person()
    {
    }
    // 初始化全部成员变量的构造器
    public Person(Integer id , String name , char gender)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    // id的setter和getter方法
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getId()
    {
        return this.id;
    }

    // name的setter和getter方法
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    // gender的setter和getter方法
    public void setGender(char gender)
    {
        this.gender = gender;
    }
    public char getGender()
    {
        return this.gender;
    }

    // address的setter和getter方法
    public void setAddress(Address address)
    {
        this.address = address;
    }
    public Address getAddress()
    {
        return this.address;
    }
}
