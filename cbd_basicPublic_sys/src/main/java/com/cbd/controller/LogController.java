package com.cbd.controller;

import com.cbd.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Autowired
    private ILogService service;


}
