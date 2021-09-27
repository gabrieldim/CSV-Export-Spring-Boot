package com.example.demo.service.implementation;

import com.example.demo.model.Employee;
import com.example.demo.service.CSVService;
import org.springframework.stereotype.Service;

import java.io.PrintWriter;
import java.util.List;

@Service
public class CSVServiceImpl implements CSVService {

    @Override
    public void downloadCSVFile(PrintWriter printWriter, List<Employee> employees) {
            printWriter.write("Employee ID, First Name, Last Name \n");
            for(Employee employee: employees){
                printWriter.write(employee.getId()
                        + " " +
                        employee.getFirstName()
                        + " " +
                        employee.getLastName());
            }

    }
}
