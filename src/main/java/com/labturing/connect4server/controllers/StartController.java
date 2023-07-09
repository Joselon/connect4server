package com.labturing.connect4server.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.labturing.connect4server.services.StartService;
import com.labturing.connect4server.types.Color;

@RestController
public class StartController {

    @Autowired
    StartService startService;

    @GetMapping("/getBoardColors")
    public Color[][] getBoardColors() {
      return this.startService.getBoard();
    }
    
}
