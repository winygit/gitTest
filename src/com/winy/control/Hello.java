package com.winy.control;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.winy.bean.OTAconfig;

@Controller
public class Hello {

    @Autowired
    private OTAconfig otAconfig;
    @RequestMapping("/helloTest")
    public String helloTest(@RequestParam("name") String name, ModelMap map) {
        System.out.println("hello  " + name + new Date());

        map.put("name", name);
        return "ok";

    }

    @ModelAttribute("name")
    public String getLxx() {
        System.out.println("lxx");
        return "lxx and sj";
    }
    @RequestMapping("/helloTest2")
    public String helloTest2(String name) {
        // name = "lxx ";
        System.out.println("   with  " + name);
        return "ok";

    }

    @RequestMapping("/helloTest3")
    public ModelAndView helloTest3(String name) {
        // name = "lxx ";

        ModelAndView mav = new ModelAndView("ok");
        mav.addObject("name2", name);
        System.out.println("  with  " + name);
        return mav;

    }

    @RequestMapping("/helloTest4")
    public ModelAndView helloTest4(String name) {

        ModelAndView mav = new ModelAndView("ok");
        mav.addObject("name2", name);
        System.out.println("********" + otAconfig);
        System.out.println("  with  " + name);
        return mav;

    }


}
