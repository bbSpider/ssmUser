package com.ssm.user.service;

import java.util.List;
import com.ssm.user.dto.UserDTO;

/**
 * 类名：UserService
 * 功能：用户管理Service接口
 * @author	tianmi
 * @Date	2019-06-24 18:13:11
 */
public interface UserService {

	/** 新增 */
    public long insert(UserDTO dto); 

    /** 修改 */
    public int updateById(UserDTO dto); 

    /** 刪除 */
    public int deleteById(Integer id); 

    /** 通过id查询 */
    public UserDTO findById(Integer id); 

    /** 查询 */
    public List<UserDTO> findByCondition(); 

}
