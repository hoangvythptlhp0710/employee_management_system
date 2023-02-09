package com.example.Employee_Management_System.service.impl;

import com.example.Employee_Management_System.dto.request.CreateTaskRequest;
import com.example.Employee_Management_System.dto.response.Response;
import com.example.Employee_Management_System.mapper.ManagerMapper;
import com.example.Employee_Management_System.repository.ManagerRepository;
import com.example.Employee_Management_System.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerRepository managerRepository;
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public ResponseEntity<Response> createTask(CreateTaskRequest request) {

    }

    @Override
    public ResponseEntity<Response> getAllReports() {
        return null;
    }

    @Override
    public ResponseEntity<Response> getReportById(long employeeId) {
        return null;
    }

    @Override
    public ResponseEntity<Response> getReportEmployeeId(long employeeId) {
        return null;
    }

    @Override
    public ResponseEntity<Response> getWorkingSchedule(long monthNumber) {
        return null;
    }
}
