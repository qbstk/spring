package com.ellden.spring.ioc;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IocTest {
    @Test
    /**
     * 传统方式调用
     */
    public void demo1(){
        UserDao user = new UserDaoJdbcImpl() ;
        ((UserDaoJdbcImpl) user).setUserName( "hello" );
        user.save();
    }

    @Test
    /**
     * spring ClassPathXmlApplicationContext  方式调用
     * ClassPathXmlApplicationContext 加载配置文件的时候生成实例化
     * BeanFactory   在调用getBean时实例化对象
     */
    public void demo2(){

        ApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" ) ;
        UserDao user = (UserDao) context.getBean( "userDao" );
        user.save();
    }
    @Test
    /**
     * spring FileSystemXmlApplicationContext  方式调用
     */
    public void demo3(){

        ApplicationContext context = new FileSystemXmlApplicationContext( "//Users//sheng.liu//code//applicationContext.xml" ) ;
        UserDao user = (UserDao) context.getBean( "userDao" );
        user.save();
    }
    @Test
    /**
     * 生命周期的配置
     */
    public void demo4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" ) ;
        UserDao user = (UserDao) context.getBean( "userDao" );
        user.save();
        context.close();
    }
    @Test
    /**
     * Bean的作用范围的配置
     */
    public void demo5(){
        ApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" ) ;
        UserDao user1 = (UserDao) context.getBean( "userDao" );
        user1.save();
        UserDao user2 = (UserDao) context.getBean( "userDao" );
        System.out.println(user1 == user2);
    }

    @Test
    /**
     * SPEL
     */
    public void demo6(){
        ApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" ) ;
        UserDao userDao2 = (UserDao) context.getBean( "userDao2" );
        userDao2.save();

    }

    @Test
    /**
     * 集合类型注入
     */
    public void demo7(){
        ApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" ) ;
        CollectionBean collectionBean = (CollectionBean) context.getBean( "collectionBean" );
        System.out.println(collectionBean);

    }
}
