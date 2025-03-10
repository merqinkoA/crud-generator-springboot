package com.example.demo.service;

import com.example.demo.model.Qinko;
import com.example.demo.repository.QinkoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import jakarta.persistence.EntityNotFoundException;

@Service
public class QinkoServiceImpl implements QinkoService {

    @Autowired
    private QinkoRepository qinkoRepository;

    @Override
    public List<Qinko> getAllQinkos() {
        return qinkoRepository.findAll();
    }

    @Override
    public Qinko getQinkoById(Long id) {
        return qinkoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Qinko not found with id: " + id));
    }

    @Override
    public Qinko createQinko(Qinko qinko) {
        return qinkoRepository.save(qinko);
    }

    @Override
    public Qinko updateQinko(Long id, Qinko qinko) {
        if (!qinkoRepository.existsById(id)) {
            throw new EntityNotFoundException("Qinko not found with id: " + id);
        }
        qinko.setId(id);
        return qinkoRepository.save(qinko);
    }

    @Override
    public void deleteQinko(Long id) {
        if (!qinkoRepository.existsById(id)) {
            throw new EntityNotFoundException("Qinko not found with id: " + id);
        }
        qinkoRepository.deleteById(id);
    }
}