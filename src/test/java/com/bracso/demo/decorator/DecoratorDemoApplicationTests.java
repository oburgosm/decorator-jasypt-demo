package com.bracso.demo.decorator;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsNull.nullValue;

@SpringBootTest
class DecoratorDemoApplicationTests {

    @Autowired(required = false)
    DataSource ds;

    @Test
    void contextLoads() {
        assertThat(this.ds, is(not(nullValue())));
    }

}
