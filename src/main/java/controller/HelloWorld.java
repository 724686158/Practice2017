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
        return "/index";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list()
    {
        return "/list";
    }

    @RequestMapping(value = "/aboutus",method = RequestMethod.GET)
    public String aboutus()
    {
        return "/aboutus";
    }

    @RequestMapping(value = "/checkout",method = RequestMethod.GET)
    public String checkout()
    {
        return "/checkout";
    }

    @RequestMapping(value = "/contactus",method = RequestMethod.GET)
    public String contactus()
    {
        return "/contactus";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index()
    {
        return "/index";
    }

    @RequestMapping(value = "/new",method = RequestMethod.GET)
    public String New()
    {
        return "/new";
    }

    @RequestMapping(value = "/order-complete",method = RequestMethod.GET)
    public String order_complete()
    {
        return "/order-complete";
    }

    @RequestMapping(value = "/status",method = RequestMethod.GET)
    public String status()
    {
        return "/status";
    }

    @RequestMapping(value = "/view",method = RequestMethod.GET)
    public String view()
    {
        return "/view";
    }

}
