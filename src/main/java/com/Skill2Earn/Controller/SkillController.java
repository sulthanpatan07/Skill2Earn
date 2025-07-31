package com.Skill2Earn.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Skill2Earn.Entity.Skill;
import com.Skill2Earn.Service.SkillService;

@RestController
@RequestMapping("/api/skills")
@CrossOrigin(origins = "http://localhost:5173") // React Vite URL
public class SkillController {

    @Autowired
    private SkillService skillService;

    @GetMapping("/search")
    public ResponseEntity<List<Skill>> searchSkills(
            @RequestParam(required = false) String category,
            @RequestParam(required = false) String location,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate postedAfter,
            @RequestParam(required = false) String sortBy) {
        return ResponseEntity.ok(skillService.searchAndSort(category, location, postedAfter, sortBy));
    }
}