package com.Skill2Earn.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Skill2Earn.Entity.SkillPost;
import com.Skill2Earn.Repository.SkillPostRepository;

@Service
public class SkillPostService {

    @Autowired
    private SkillPostRepository skillPostRepository;

    public Optional<SkillPost> getSkillById(Long id) {
        return skillPostRepository.findById(id);
    }

    public SkillPost updateSkill(Long id, SkillPost updatedPost) {
        SkillPost existing = skillPostRepository.findById(id).orElseThrow();

        existing.setTitle(updatedPost.getTitle());
        existing.setDescription(updatedPost.getDescription());
        existing.setCategory(updatedPost.getCategory());
        existing.setLocation(updatedPost.getLocation());

        return skillPostRepository.save(existing);
    }
}
