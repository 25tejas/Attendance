package com.example.serviceimpl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.model.Student;
import com.example.repository.StudentRepository;
import com.example.utilfile.ExcelUtils;


@Service
public class FileServices{
	
	@Autowired
	StudentRepository studentRepository;
	
	// Store File Data to Database
	public void store(MultipartFile file){
		try {
			List<Student> lstCustomers = ExcelUtils.parseExcelFile(file.getInputStream());
    		// Save Customers to DataBase
    		studentRepository.saveAll(lstCustomers);
        } catch (IOException e) {
        	throw new RuntimeException("FAIL! -> message = " + e.getMessage());
        }
	}
	
	// Load Data to Excel File
    public ByteArrayInputStream loadFile() {
    	List<Student> customers = (List<Student>) studentRepository.findAll();
    	
    	try {
    		ByteArrayInputStream in = ExcelUtils.customersToExcel(customers);
    		return in;
		} catch (IOException e) {}
    	
        return null;
    }
}
