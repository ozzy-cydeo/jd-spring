package com.cybertek.controller;

import com.cybertek.datagenerator.DataGenerator;
import com.cybertek.model.Employee;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String employeeCreate(Model model){

        model.addAttribute("employee",new Employee());
        model.addAttribute("stateList", DataGenerator.getStateList());

        return "/employee/employee-create";
    }

    @PostMapping("/list")
    public String employeeList(@ModelAttribute("employee") Employee employee,Model model){

//        int birthYear = LocalDate.parse(employee.getAge()).getYear();
//        employee.setBirthYear(LocalDate.now().getYear() - birthYear);
//
//        DataGenerator.createEmployee(employee);
//        model.addAttribute("employeeList", DataGenerator.employees);

        model.addAttribute("employeeList",Arrays.asList(employee));


        int birthYear = LocalDate.parse(employee.getAge()).getYear();
        model.addAttribute("age", LocalDate.now().getYear() - birthYear);



        return "/employee/employee-list";
    }
}
