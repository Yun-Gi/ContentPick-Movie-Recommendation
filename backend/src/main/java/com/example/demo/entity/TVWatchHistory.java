package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TV_watch_history")
public class TVWatchHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // 자동 증가 설정

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "tmdb_id")
    private Long tmdbId;
    

    // 기본 생성자
    public TVWatchHistory() {}

    public TVWatchHistory(User user, Long tmdbId) {
        this.user = user;
        this.tmdbId = tmdbId;
    }


    // Getter 및 Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(Long tmdbId) {
        this.tmdbId = tmdbId;
    }
}
