package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.CSVService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CSVExportController {

    private final CSVService csvService;

    public CSVExportController(CSVService csvService) {
        this.csvService = csvService;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/download/employee.csv")
    public void downloadCSVFile(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition","attachment; file=employee.csv");
        csvService.downloadCSVFile(response.getWriter(),createDataTest());
    }

    private List<Employee> createDataTest(){
        List<Employee> data = new ArrayList<>();
        data.add(new Employee(1,"Test Firstname 1", "Test Lastname 1"));
        data.add(new Employee(2,"Test Firstname 2", "Test Lastname 2"));
        data.add(new Employee(3,"Test Firstname 3", "Test Lastname 3"));
        data.add(new Employee(4,"Test Firstname 4", "Test Lastname 4"));
        data.add(new Employee(5,"Test Firstname 5", "Test Lastname 5"));
        return data;
    }

}
