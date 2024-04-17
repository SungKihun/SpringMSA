package covi.springmsa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMsaApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
    }
}
