package com.huarui.springboot_152_5.controller;

import com.huarui.springboot_152_5.pojo.Girl;
import com.huarui.springboot_152_5.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @ Author       : 蒋亚平
 * @ Date         : Created in 14:57 2019/3/14
 * @ Description  :
 */
@Controller
@RequestMapping("/girls")
public class GirlController {
    @Autowired
    GirlService girlService;

    @PostMapping
    public void addGirl(Girl girl, HttpServletResponse response){
        boolean flag =false;
        if(girl.getId()==null) {
            flag = girlService.insertGirl(girl);
        }else {
            flag =girlService.updateGirl(girl);
        }
        response.setCharacterEncoding("gb2312");
        if(flag) {
            PrintWriter writer = null;
            try {
                writer = response.getWriter();
                if(girl.getId()==null) {
                    writer.print("<script>alert('增加成功');location.href='/girls';</script>");
                }else{
                    writer.print("<script>alert('修改成功');location.href='/girls';</script>");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("girl",new Girl());
        return "form";
    }

    @GetMapping("/modify/{id}")
    public String modify(@PathVariable("id") Integer id,Model model){
        Girl girl = girlService.selectByPrimaryKey(id);
        model.addAttribute("girl",girl);
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String deleteGirl(@PathVariable("id") Integer id){
        boolean flag = girlService.deleteGirlById(id);
        return "redirect:/girls";
    }

    @GetMapping
    public String listGirls(Model model){
        List<Girl> girls = girlService.findAll();
        model.addAttribute("girls",girls);
        return "list";
    }
}
