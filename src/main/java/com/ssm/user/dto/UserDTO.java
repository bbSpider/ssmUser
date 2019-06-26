package com.ssm.user.dto;


/**
 * 类名：UserDTO
 * 功能：用户管理
 * @author	tianmi
 * @Date	2019-06-24 18:13:11
 */
public class UserDTO{

    private Integer id;
    private String name;
    private String password;
    private Integer age;
    private String sex;
    private String birthday;
    private String idcard;

    public void setId(Integer id) {
        this.id = id; 
    }

    public Integer getId() {
        return id; 
    }
    
    public void setName(String name) {
        this.name = name; 
    }

    public String getName() {
        return name; 
    }
    
    public void setPassword(String password) {
        this.password = password; 
    }

    public String getPassword() {
        return password; 
    }
    
    public void setAge(Integer age) {
        this.age = age; 
    }

    public Integer getAge() {
        return age; 
    }
    
    public void setSex(String sex) {
        this.sex = sex; 
    }

    public String getSex() {
        return sex; 
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday; 
    }

    public String getBirthday() {
        return birthday; 
    }
    
    public void setIdcard(String idcard) {
        this.idcard = idcard; 
    }

    public String getIdcard() {
        return idcard; 
    }

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", sex=" + sex
				+ ", birthday=" + birthday + ", idcard=" + idcard + "]";
	}
    
}
