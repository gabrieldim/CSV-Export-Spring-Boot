package com.example.demo.service;

import com.example.demo.model.Employee;

import java.io.PrintWriter;
import java.util.List;


public interface CSVService {

    public void downloadCSVFile(PrintWriter printWriter, List<Employee> employees);

}
