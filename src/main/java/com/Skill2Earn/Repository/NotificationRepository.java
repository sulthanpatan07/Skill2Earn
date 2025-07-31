package com.Skill2Earn.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Skill2Earn.Entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByUserIdAndSeenFalse(Long userId);
}