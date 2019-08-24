package com.codebot.springconsole;

import com.codebot.springconsole.application.SpringConsoleApplication;
import com.codebot.springconsole.component.Runner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringConsoleApplication.class)
public class SpringConsoleApplicationTests {

    @Autowired
    private Runner runner;

    @Test
    public void contextLoads() {
        assertThat(runner).isNotNull();
    }

}
