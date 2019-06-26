package com.ssm.user.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssm.user.dao.UserDAO;
import com.ssm.user.service.UserService;
import com.ssm.user.dto.UserDTO;

/**
 * 类名：UserServiceImpl 功能：用户管理Service实现类
 * 
 * @author tianmi
 * @Date 2019-06-24 18:13:11
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	/** 查询 */
	@Override
	public long insert(UserDTO dto) {
		userDAO.insert(dto);
		return dto.getId();
	}

	/** 修改 */
	@Override
	public int updateById(UserDTO dto) {
		return userDAO.updateById(dto);
	}

	/** 刪除 */
	@Override
	public int deleteById(Integer id) {
		return userDAO.deleteById(id);
	}

	/** 通过id查询 */
	@Override
	public UserDTO findById(Integer id) {
		return userDAO.findById(id);
	}

	/** 查询 */
	@Override
	public List<UserDTO> findByCondition() {
		return userDAO.findByCondition();
	}
}
