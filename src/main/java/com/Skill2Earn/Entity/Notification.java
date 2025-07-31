package com.Skill2Earn.Entity;

import java.time.LocalDateTime;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Notification {
    @Id
    @GeneratedValue
    private Long id;

    private String message;
    private boolean seen;
    private LocalDateTime timestamp = LocalDateTime.now();

    @ManyToOne
    private User user; // Can be admin or skill owner

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSeen() {
        return this.seen;
    }

    public boolean getSeen() {
        return this.seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public LocalDateTime getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
