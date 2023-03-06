package com.example.springmvc;

import com.example.springmvc.Star;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/response")
public class HelloResponseController {

    private static long visitCount = 0;

    @GetMapping("/html/redirect")
    public String htmlFile() {
        return "redirect:/hello.html"; // hello.html을 반환하면 좋을 것 같습니다.
    }

    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";
    }

    @ResponseBody
    @GetMapping("/body/html")
    public String helloStringHTML() {
        return "<!DOCTYPE html>" +
                "<html>" +
                "<head><meta charset=\"UTF-8\"><title>By @ResponseBody</title></head>" +
                "<body> Hello, 정적 웹 페이지!!</body>" +
                "</html>";
    }

    @GetMapping("/html/dynamic")
    public String helloHtmlFile(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }

    @ResponseBody
    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"르세라핌\",\"age\":20}";
    }

    @ResponseBody
    @GetMapping("/json/class")
    public Star helloJson() {
        return new Star("르세라핌", 20);
    }
}