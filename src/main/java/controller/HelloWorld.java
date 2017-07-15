package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/7/15.
 */
@Controller
public class HelloWorld {
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String hello()
    {
        System.out.println("Hello World!");
        return "/successful";
    }
}
