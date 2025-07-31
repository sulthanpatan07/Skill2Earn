package com.Skill2Earn.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Skill2Earn.Entity.SkillPost;

public interface SkillPostRepository extends JpaRepository<SkillPost, Long> {
    List<SkillPost> findByUser_Id(Long userId);
}
