

1.工厂设计模式 : Spring使用工厂模式通过 BeanFactory、ApplicationContext 创建 bean 对象。
2.代理设计模式 : Spring AOP 功能的实现。
3.单例设计模式 : Spring 中的 Bean 默认都是单例的。
4.模板方法模式 : Spring 中 jdbcTemplate、hibernateTemplate 等以 Template 结尾的对数据库操作的类，它们就使用到了模板模式。
5.包装器设计模式 : 我们的项目需要连接多个数据库，而且不同的客户在每次访问中根据需要会去访问不同的数据库。这种模式让我们可以根据客户的需求能够动态切换不同的数据源。
6.观察者模式: Spring 事件驱动模型就是观察者模式很经典的一个应用。Event ApplicationListener
7.适配器模式: Spring AOP 的增强或通知(Advice)使用到了适配器模式、spring MVC 中也是用到了适配器模式适配Controller。
8.访问者模式: Spring AOP 的拦截器链执行传入CglibMethodInvocation

