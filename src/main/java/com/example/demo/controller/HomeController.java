// filepath: c:\laragon\www\crudgeneratorsb\generated-project\src\main\java\com\example\demo\controller\HomeController.java
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    
    @GetMapping("/")
    @ResponseBody
    public String welcome() {
        return "<html><body style='font-family: Arial, sans-serif; margin: 40px;'>" +
               "<h1>Welcome to Qinko CRUD API</h1>" +
               "<p>Your API is running successfully!</p>" +
               "<h2>Available Endpoints:</h2>" +
               "<ul>" +
               "  <li><a href='/api/qinkos'>/api/qinkos</a> - Get all Qinkos</li>" +
               "  <li>/api/qinkos/{id} - Get, update or delete specific Qinko</li>" +
               "  <li><a href='/h2-console'>/h2-console</a> - Access H2 Database Console</li>" +
               "</ul>" +
               "</body></html>";
    }
}
