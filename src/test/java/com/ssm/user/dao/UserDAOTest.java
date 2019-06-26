package com.ssm.user.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.ssm.user.base.BaseTest;
import com.ssm.user.dao.UserDAO;
import com.ssm.user.dto.UserDTO;

public class UserDAOTest extends BaseTest {

	@Autowired
	private UserDAO userDAO;

	/** 查询 */
	@Test
	public void find() {
		UserDTO dto = userDAO.findById(1);
		System.out.println(dto);
	}

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
		Object result = userDAO.insert(dto);
		System.out.println("result=" + result);
	}

	/** 修改 */
	@Test
	public void updateById() {
		UserDTO dto = new UserDTO();
		dto.setId(8);
		dto.setName("222");
		dto.setPassword("222");
		dto.setAge(22);
		dto.setSex("222");
		dto.setBirthday("222");
		dto.setIdcard("222");
		Object result = userDAO.updateById(dto);
		System.out.println("result=" + result);
	}

	/** 刪除 */
	@Test
	public void deleteById() {
		Object result = userDAO.deleteById(5);
		System.out.println("result=" + result);
	}

	/** 通过id查询 */
	@Test
	public void findById() {
		Object result = userDAO.findById(1);
		System.out.println("result=" + result);
	}

	/** 查询 */
	@Test
	public void findByCondition() {
		Object result = userDAO.findByCondition();
		System.out.println("result=" + result);
	}

}
