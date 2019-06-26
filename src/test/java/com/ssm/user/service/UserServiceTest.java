package com.ssm.user.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.ssm.user.base.BaseTest;
import com.ssm.user.dto.UserDTO;
import com.ssm.user.service.UserService;

/**
 * 类名：UserServiceTest 功能：用户管理Service测试类
 * 
 * @author tianmi
 * @Date 2019-06-24 18:13:11
 */

public class UserServiceTest extends BaseTest{

	@Autowired
	private UserService service = null;

	/** 新增 */
	@Test
	public void insert() {
		UserDTO dto = new UserDTO();
		dto.setName("11");
		dto.setPassword("11");
		dto.setAge(1);
		dto.setSex("11");
		dto.setBirthday("11");
		dto.setIdcard("11");

		Object result = this.service.insert(dto);
		System.out.println("result=" + result);
	}

	/** 修改 */
	@Test
	public void updateById() {
		UserDTO dto = new UserDTO();
		dto.setId(9);
		dto.setName("222");
		dto.setPassword("222");
		dto.setAge(22);
		dto.setSex("222");
		dto.setBirthday("222");
		dto.setIdcard("222");

		Object result = this.service.updateById(dto);
		System.out.println("result=" + result);
	}

	/** 刪除 */
	@Test
	public void deleteById() {
		Object result = this.service.deleteById(5);
		System.out.println("result=" + result);
	}

	/** 通过id查询 */
	@Test
	public void findById() {

		Object result = this.service.findById(1);
		System.out.println("result=" + result);
	}

	 /** 查询 */
	@Test
	public void findByCondition() {
		Object result = this.service.findByCondition();
		System.out.println("result=" + result);
	}
}
