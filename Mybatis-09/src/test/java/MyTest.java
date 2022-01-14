import com.lanclaw.dao.UserMapper;
import com.lanclaw.pojo.User;
import com.lanclaw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class MyTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        System.out.println("========================================================");
        User user2 = mapper.queryUserById(2);
        System.out.println(user2);

        System.out.println(user == user2);

        sqlSession.close();
    }

    @Test
    public void cache2(){
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user = mapper1.queryUserById(1);
        System.out.println(user);
        sqlSession1.close();

        System.out.println("========================================================");
        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);
        System.out.println(user == user2);

        sqlSession2.close();
    }
}
