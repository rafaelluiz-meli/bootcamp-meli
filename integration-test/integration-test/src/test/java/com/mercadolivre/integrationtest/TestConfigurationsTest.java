package com.mercadolivre.integrationtest;

import com.mercadolivre.integrationtest.beans.BeanForTest;
import com.mercadolivre.integrationtest.beans.TestBean;
import com.mercadolivre.integrationtest.beans.TestConfs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest(classes = {TestBean.class, BeanForTest.class})
@Import(TestConfs.class)
public class TestConfigurationsTest {

    @Autowired
    private TestBean testBean;

    @Autowired
    private String beanForTests;

    @Autowired
    private String moreOneBean;

    @Test
    public void notRealBean(){
        Assertions.assertTrue(testBean.someMethod().equals("I am not a real bean"));
    }

    @Test
    public void beanForTests(){
        Assertions.assertTrue(beanForTests.equals("Use on tests only"));
    }

    @Test
    public void moreOneBean(){
        Assertions.assertTrue(moreOneBean.equals("More one bean for tests"));
    }

}
