package com.example.insuranceapplication.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.insuranceapplication.entity.Plan;
import com.example.insuranceapplication.service.PlanService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class FileUploadController {
	
	@Autowired
	PlanService planService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.getOriginalFilename().endsWith(".json")) {
            try {
                InputStream inputStream = file.getInputStream();
                ObjectMapper objectMapper = new ObjectMapper();
                List<Plan> plans = objectMapper.readValue(inputStream, new TypeReference<List<Plan>> () {});
                planService.savePlans(plans);
                return ResponseEntity.ok("File uploaded and processed successfully.");
            } 
            catch (IOException e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error processing JSON file.");
            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid file format. Supported formats: JSON, Excel.");
    }
}
