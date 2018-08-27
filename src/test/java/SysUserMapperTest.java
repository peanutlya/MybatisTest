import dao.SysUserDao;
import entity.SysRole;
import entity.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;

public class SysUserMapperTest extends BaseMapperTest {

    @Test
    public void testQueryById(){
        try(SqlSession session = this.getSqlSession()){
            SysUser user = session.selectOne("queryById",2L);
            System.out.println(user);
            Assert.assertNull(user);
            //Assert.assertTrue(user != null);
        }
    }

    @Test
    public void testQueryById2(){
        try(SqlSession session = this.getSqlSession()){
            List<SysUser> users = session.selectList("queryById2",1L);
            System.out.println(users);
        }
    }

    @Test
    public void testQueryAll(){
        try(SqlSession session = this.getSqlSession()){
            List<SysUser> users = session.selectList("queryAll");
            System.out.println(users);
        }
    }

    @Test
    public void testQueryById3(){
        try(SqlSession session = this.getSqlSession()){
            SysUserDao userDao = session.getMapper(SysUserDao.class);
            SysUser user = userDao.queryById(1L);
            System.out.println(user);
        }
    }
    @Test
    public void testQueryRoleByUserid(){
        try( SqlSession session=this.getSqlSession();){
            List<SysRole> roles=session.selectList("queryRoleByUserid",1L);
            System.out.println(roles.size());
        }
    }
    @Test
    public void testQueryRoleUserid2(){
        try(SqlSession session=this.getSqlSession()){

            SysRole role=session.selectOne("queryRoleByUserid2",1001L);
            System.out.println(role.getUser().getUserName());
        }
    }
    @Test
    public void testInsert(){
        try(SqlSession session=this.getSqlSession()){
            SysUserDao userDao = session.getMapper(SysUserDao.class);
            SysUser user=new SysUser();
            user.setUserName("gueset");
            user.setUserPassword("guest");
            user.setUserEmail("gueset@qq.com");
            int result = userDao.insert(user);

            session.commit();
            System.out.println(result);
            System.out.println(user.getId());

        }
    }
    @Test
    public void testInsert2(){
        try(SqlSession session=this.getSqlSession()){
            SysUser user=new SysUser();
            user.setUserName("gueset");
            user.setUserPassword("guest");
            user.setUserEmail("gueset@qq.com");
            int result = session.insert("insert", user);
            System.out.println(result);
        }
    }
    @Test
    public void testInsert3(){
        try(SqlSession session=this.getSqlSession()){
            SysUserDao userDao = session.getMapper(SysUserDao.class);
            SysUser user = new SysUser();
            user.setUserName("guest");
            user.setUserPassword("guest");
            user.setUserEmail("guest@qq.com");
            user.setCreateTime1(LocalDateTime.now());
            int result = userDao.insert3(user);
            session.commit();
            System.out.println(user.getId());
        }
    }
    @Test
    public void testQuery(){
        try(SqlSession session = this.getSqlSession()){
            
        }
    }
}
