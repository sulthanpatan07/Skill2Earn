package com.Skill2Earn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Skill2Earn.Entity.SkillPost;
import com.Skill2Earn.Service.SkillPostService;

@RestController
@RequestMapping("/api/skills")
public class SkillPostController {

    @Autowired
    private SkillPostService skillPostService;

    @PutMapping("/update/{id}")
    public SkillPost updateSkillPost(@PathVariable Long id, @RequestBody SkillPost skillPost) {
        return skillPostService.updateSkill(id, skillPost);
    }
}
