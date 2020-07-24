package com.hr;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
class Springboot4ApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {

        System.out.println(dataSource.getClass());

        System.out.println(dataSource.getConnection());

    }

        @Autowired
        private JdbcTemplate template;

//        @Test
        public void test() throws SQLException {

            List<Map<String,Object>> list = template.queryForList("select* from car");

            System.out.println(list.get(0));

            for (Map<String,Object> m :list){

                System.out.println(m);
            }

        }





}
