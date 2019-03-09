package com.huarui.springboot_152_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 14:42 2019/3/8
 * @ Description  : 控制器
 */
//@RestController   //@ResponseBody +  @Controller
@Controller
public class TestController {
    //方式一：在地址传参
    //@RequestMapping(value = "/hi",method = RequestMethod.GET)
    /*@GetMapping("/say/{id}")
    public String hi(@PathVariable("id") Integer id) {
        System.out.println(id + "**************");
        return "index";
    }*/

    @GetMapping("/{id}/say")
    public String hi(@PathVariable("id") Integer id) {
        System.out.println(id + "**************");
        return "index";
    }

    //方式二 ?
    //url  ?name=kitty
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "cupSize",required = false,defaultValue = "C") String cupSize,
                        @RequestParam("age") Integer age){
        System.out.println(cupSize+"\t"+age);
        return "index";
    }
}
