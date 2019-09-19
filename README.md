# spring 
##2019-9-18
1.1.1	Spring的概述
1.1.1.1	什么是Spring
λ	Spring：SE/EE开发的一站式框架。
ν	一站式框架：有EE开发的每一层解决方案。
υ	WEB层		：SpringMVC
υ	Service层	：Spring的Bean管理，Spring声明式事务
υ	DAO层		：Spring的Jdbc模板，Spring的ORM模块
1.1.1.2	为什么学习Spring

1.1.1.3	Spring的版本
Spring3.x和Spring4.x
1.1.2	Spring的入门（IOC）
1.1.2.1	什么IOC
λ	IOC: Inversion of Control(控制反转)。
ν	控制反转：将对象的创建权反转给（交给）Spring。
1.1.2.2	下载Spring的开发包
官网：http://spring.io/
1.1.2.3	解压Spring的开发包

λ	docs		：Spring的开发规范和API
λ	libs		：Spring的开发的jar和源码
λ	schema	：Spring的配置文件的约束
1.1.2.4	创建web项目，引入jar包


1.1.2.5	创建接口和类


λ	问题：
ν	如果底层的实现切换了，需要修改源代码，能不能不修改程序源代码对程序进行扩展？

1.1.2.6	将实现类交给Spring管理
在spring的解压路径下spring-framework-4.2.4.RELEASE\docs\spring-framework-reference\html\xsd-configuration.html

1.1.2.7	编写测试类

1.1.2.8	IOC和DI（*****）
λ	IOC：控制反转，将对象的创建权反转给了Spring。
ν	DI：依赖注入，前提必须有IOC的环境，Spring管理这个类的时候将类的依赖的属性注入（设置）进来。
λ	面向对象的时候
ν	依赖
Class A{

}

Class B{
	public void xxx(A a){

}
}
ν	继承:is a
Class A{

}
Class B extends A{

}
ν	聚合:has a
1.2	Spring的工厂类
1.2.1	Spring的工厂类
1.2.1.1	Spring工厂类的结构图

λ	ApplicationContext继承BeanFactory。
1.2.1.2	BeanFactory			：老版本的工厂类
λ	BeanFactory：调用getBean的时候，才会生成类的实例。
1.2.1.3	ApplicationContext	：新版本的工厂类
λ	ApplicationContext：加载配置文件的时候，就会将Spring管理的类都实例化。
λ	ApplicationContext有两个实现类
ν	ClassPathXmlApplicationContext	：加载类路径下的配置文件
ν	FileSystemXmlApplicationContext	：加载文件系统下的配置文件
1.3	Spring的配置
1.3.1	XML的提示配置
1.3.1.1	Schema的配置

1.3.2	Bean的相关的配置
1.3.2.1	<bean>标签的id和name的配置
λ	id		:使用了约束中的唯一约束。里面不能出现特殊字符的。
λ	name	:没有使用约束中的唯一约束（理论上可以出现重复的，但是实际开发不能出现的）。里面可以出现特殊字符。
ν	Spring和Struts1框架整合的时候
ν	<bean name=”/user” class=””/>
1.3.2.2	Bean的生命周期的配置（了解）
λ	init-method		:Bean被初始化的时候执行的方法
λ	destroy-method	:Bean被销毁的时候执行的方法（Bean是单例创建，工厂关闭）
1.3.2.3	Bean的作用范围的配置（重点）
λ	scope			：Bean的作用范围
ν	singleton		：默认的，Spring会采用单例模式创建这个对象。
ν	prototype	：多例模式。（Struts2和Spring整合一定会用到）
ν	request		：应用在web项目中，Spring创建这个类以后，将这个类存入到request范围中。
ν	session		：应用在web项目中，Spring创建这个类以后，将这个类存入到session范围中。
ν	globalsession	：应用在web项目中，必须在porlet环境下使用。但是如果没有这种环境，相对于session。
1.4	Spring的Bean管理（XML方式）
1.4.1	Spring的Bean的实例化方式（了解）
Bean已经都交给Spring管理，Spring创建这些类的时候，有几种方式：
1.4.1.1	无参构造方法的方式（默认）
λ	编写类

λ	编写配置

1.4.1.2	静态工厂实例化的方式
λ	编写Bean2的静态工厂

λ	配置

1.4.1.3	实例工厂实例化的方式
λ	Bean3的实例工厂

λ	配置

1.4.2	Spring的属性注入
1.4.2.1	构造方法的方式的属性注入
λ	构造方法的属性注入

1.4.2.2	Set方法的方式的属性注入
λ	Set方法的属性注入

λ	Set方法设置对象类型的属性

1.4.2.3	P名称空间的属性注入（Spring2.5以后）
λ	通过引入p名称空间完成属性的注入：
ν	写法：
υ	普通属性	p:属性名=”值”
υ	对象属性	p:属性名-ref=”值”
λ	P名称空间的引入

λ	使用p名称空间

1.4.2.4	SpEL的属性注入（Spring3.0以后）
λ	SpEL：Spring Expression Language，Spring的表达式语言。
ν	语法：
υ	#{SpEL}

1.4.3	集合类型属性注入(了解)
1.4.3.1	配置
	<!-- Spring的集合属性的注入============================ -->
	<!-- 注入数组类型 -->
	<bean id="collectionBean" class="com.itheima.spring.demo5.CollectionBean">
		<!-- 数组类型 -->
		<property name="arrs">
			<list>
				<value>王东</value>
				<value>赵洪</value>
				<value>李冠希</value>
			</list>
		</property>
		
		<!-- 注入list集合 -->
		<property name="list">
			<list>
				<value>李兵</value>
				<value>赵如何</value>
				<value>邓凤</value>
			</list>
		</property>
		
		<!-- 注入set集合 -->
		<property name="set">
			<set>
				<value>aaa</value>
				<value>bbb</value>
				<value>ccc</value>
			</set>
		</property>
		
		<!-- 注入Map集合 -->
		<property name="map">
			<map>
				<entry key="aaa" value="111"/>
				<entry key="bbb" value="222"/>
				<entry key="ccc" value="333"/>
			</map>
		</property>
	</bean>
1.5	Spring的分模块开发的配置
1.5.1	分模块配置
1.5.1.1	在加载配置文件的时候，加载多个

1.5.1.2	在一个配置文件中引入多个配置文件

##2019-9-19
 @Component:组件.(作用在类上) 
 Spring中提供@Component的三个衍生注解:(功能目前来讲是一致的) 
 * @Controller :WEB层 
 * @Service  :业务层 
 * @Repository :持久层  
 这三个注解是为了让标注类本身的用途清晰，Spring在后续版本会对其增强 
 
 属性注入的注解:(使用注解注入的方式,可以不用提供set方法.) 
 * @Value  :用于注入普通类型. 
 * @Autowired :自动装配: 
    * 默认按类型进行装配. 
    * 按名称注入: @Qualifier:强制使用名称注入. 
 * @Resource相当于: * @Autowired和@Qualifier一起使用. 
 
Bean的作用范围的注解: 
  @Scope: 
  * singleton:单例 
  * prototype:多例 
Bean的生命周期的配置: 
 @PostConstruct :相当于init-method
 @PreDestroy  :相当于destroy-method 
 
 XML和注解: 
 * XML :结构清晰. 
 * 注解 :开发方便.(属性注入.)  
 
 实际开发中还有一种XML和注解整合开发: 
 * Bean有XML配置.但是使用的属性使用注解注入.
 
 
 
 * AOP解决OOP中遇到的一些问题.是OOP的延续和扩展. 
 *为什么学习AOP 对程序进行增强:不修改源码的情况下. 
 * AOP可以进行权限校验,日志记录,性能监控,事务控制. 
 * Spring的AOP的由来: AOP最早由AOP联盟的组织提出的,制定了一套规范.Spring将AOP思想引入到框架中,必须遵守AOP联盟的规范. 
 * 底层实现: 代理机制: 
    * Spring的AOP的底层用到两种代理机制：     
    * JDK的动态代理 :针对实现了接口的类产生代理.     
    * Cglib的动态代理 :针对没有实现接口的类产生代理. 应用的是底层的字节码增强的技术 生成当前类的子类对象. 
    