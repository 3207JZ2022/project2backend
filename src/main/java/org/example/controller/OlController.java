package org.example.controller;

import org.example.Mapper.OlMapper;
import org.example.Bean.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ol")
public class OlController {
    @Autowired
    private OlMapper olMapper;
    @GetMapping("/all")
    public List<Video> searchAll(){
        return olMapper.searchAll();
    };
}
