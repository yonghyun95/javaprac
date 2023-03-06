package com.sparta.board.entity;

import com.sparta.board.dto.BoardRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Board extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String password;

    public Board(BoardRequestDto boardRequestDto) {
        this.title = boardRequestDto.getTitle();
        this.author = boardRequestDto.getAuthor();
        this.content = boardRequestDto.getContent();
        this.password = boardRequestDto.getPassword();
    }

    public void getBoardId(BoardRequestDto boardRequestDto) {
        this.title = boardRequestDto.getTitle();
        this.author = boardRequestDto.getAuthor();
        this.content = boardRequestDto.getContent();
        this.password = boardRequestDto.getPassword();
    }

    public Board(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void update(BoardRequestDto boardRequestDto) {
        this.title = boardRequestDto.getTitle();
        this.author = boardRequestDto.getAuthor();
        this.content = boardRequestDto.getContent();
    }
}
