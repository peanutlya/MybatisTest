package dao;

import entity.SysUser;

import java.util.List;

public interface SysUserDao {
    SysUser queryById(Long id);
    List<SysUser> queryAll();
    List<SysUser> queryAll2();

    int insert(SysUser user);

    int insert2(SysUser user);

    int insert3(SysUser user);
}
