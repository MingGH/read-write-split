package run.runnable.readwritesplit.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import run.runnable.readwritesplit.ReadWriteSplitApplication;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ReadWriteSplitApplication.class)
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @Test
    public void list() {
        Object list = userController.list();
        System.out.println(list);

    }

    @Test
    public void add() {
        for (int i = 0; i < 100; i++) {
            userController.add();
        }

    }
}