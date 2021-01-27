package com.springboot.chapter2.config;

import com.springboot.chapter2.pojo.DataBase;
import com.springboot.chapter2.pojo.User;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(value = "com.springboot.chapter2.*")  //,excludeFilters={@ComponentScan.Filter(classes = Service.class)}
public class Appconfig {
//    @Autowired
//    private DataBase dataBase;
//    @Autowired
//    private User user;

//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  //设置单例，还是原型
    @Bean(name = "user1")
    public User inituser(){
        User user=new User();
        user.setId(1);
        user.setNote("111");
        return user;
    }

    @Bean
//    @Conditional(DatabaseConditional.class)
    public DataSource getDataSource(
            @Value("${data.driverName}") String driverName,
            @Value("${data.url}") String url,
            @Value("${data.username}") String username,
            @Value("${data.password}") String password
    ){
        Properties props= new Properties();
        props.setProperty("driver",driverName);
        props.setProperty( "url",url);
        props.setProperty("username",username);
        props.setProperty("password",password);
        DataSource dataSource=null;
        try{
            dataSource= BasicDataSourceFactory.createDataSource(props);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  dataSource;
    }


}
