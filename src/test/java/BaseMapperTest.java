import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;

public abstract class BaseMapperTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            System.out.println("SysUserMapperTest init");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(inputStream != null){
                inputStream.close();
            }
        }
    }

    public SqlSession getSqlSession(){
        return this.sqlSessionFactory.openSession();
    }
}
