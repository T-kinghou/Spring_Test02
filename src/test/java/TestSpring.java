import com.hyd.Service.UserService;
import com.hyd.model.MyClass;
import com.hyd.model.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 侯贻达
 * version 1.0
 */
public class TestSpring {
    @Test
    public void testIOC(){
        String path = "applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        //从容器获得对象
        MyClass myClass1 = context.getBean("myClass", MyClass.class);
        System.out.println(myClass1.hashCode());
        // 如果是单例,每次都是同一个地址
        // 如果是多例,每次地址都不一样
        MyClass myClass2 = context.getBean("myClass", MyClass.class);
        System.out.println(myClass2.hashCode());

        MyClass myClass3 = context.getBean("myClass", MyClass.class);
        System.out.println(myClass3.hashCode());
    }

    @Test
    public void testIOCandDIByAnno(){
        String path = "applicationContext2.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        // 使用注解,默认id即对象名,是类名首字母小写
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.findUserById();
    }

    @Test
    public void testIOCandDIByAnno2(){
        String path = "applicationContext2.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
