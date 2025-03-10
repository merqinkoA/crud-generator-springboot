package com.example.demo.service;

import com.example.demo.model.Qinko;
import java.util.List;

public interface QinkoService {
    List<Qinko> getAllQinkos();
    Qinko getQinkoById(Long id);
    Qinko createQinko(Qinko qinko);
    Qinko updateQinko(Long id, Qinko qinko);
    void deleteQinko(Long id);
}