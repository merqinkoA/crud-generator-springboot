package com.example.demo.controller;

import com.example.demo.model.Qinko;
import com.example.demo.service.QinkoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/qinkos")
public class QinkoController {

    @Autowired
    private QinkoService qinkoService;

    @GetMapping
    public ResponseEntity<List<Qinko>> getAllQinkos() {
        List<Qinko> qinkos = qinkoService.getAllQinkos();
        return new ResponseEntity<>(qinkos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Qinko> getQinkoById(@PathVariable Long id) {
        Qinko qinko = qinkoService.getQinkoById(id);
        return new ResponseEntity<>(qinko, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Qinko> createQinko(@RequestBody Qinko qinko) {
        Qinko createdQinko = qinkoService.createQinko(qinko);
        return new ResponseEntity<>(createdQinko, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Qinko> updateQinko(@PathVariable Long id, @RequestBody Qinko qinko) {
        Qinko updatedQinko = qinkoService.updateQinko(id, qinko);
        return new ResponseEntity<>(updatedQinko, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQinko(@PathVariable Long id) {
        qinkoService.deleteQinko(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}