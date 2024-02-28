package com.example.myproject.controller;

import com.example.myproject.mapper.DialogueMapper;
import com.example.myproject.model.Dialogue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dialogue")
public class DialogueController {

    @Autowired
    private DialogueMapper dialogueMapper;

    @GetMapping
    public List<Dialogue> getAllDialogue() {
        return dialogueMapper.findAll();
    }

    @GetMapping("/{building_name}")
    public String getDialogueByBuildingName(@PathVariable String building_name) {
        return dialogueMapper.findByBuildingName(building_name).getJsonFile();
    }

//    @GetMapping("/object/{building_name}")
//    public Dialogue getDialogueObjectByBuildingName(@PathVariable String building_name) {
//        return dialogueMapper.findByBuildingName(building_name);
//    }
}