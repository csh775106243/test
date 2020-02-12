package cn.csh.dao;

import cn.csh.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author Sihao.Chen
 * @version V1.0
 * @Package cn.csh.dao
 * @date 2020/2/11 14:51
 */
public interface UserDao extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {
}
