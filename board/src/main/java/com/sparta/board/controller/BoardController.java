package com.sparta.board.controller;

import com.sparta.board.dto.BoardRequestDto;
import com.sparta.board.dto.BoardResponeDto;
import com.sparta.board.entity.Board;
import com.sparta.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/api/posts")
    public List<Board> getBoards(){
        return boardService.getBoards();
    }

    @GetMapping("/api/post/{id}")
    public Optional<Board> getBoard(@PathVariable Long id, @RequestBody BoardRequestDto boardRequestDto){
        return boardService.getBoardId(id, boardRequestDto);
    }

    @PostMapping("/api/post")
    public Board createBoard(@RequestBody BoardRequestDto boardRequestDto){
        return boardService.createBoard(boardRequestDto);
    }
    @PutMapping("/api/post/{id}")
    public Optional<Board> updateBoard(@PathVariable Long id, @RequestBody BoardRequestDto boardRequestDto){
        return boardService.update(id, boardRequestDto,boardRequestDto.getPassword());
    }

    @DeleteMapping("/api/post/{id}")
    public BoardResponeDto deleteBoard(@PathVariable Long id, @RequestBody BoardRequestDto boardRequestDto){
        return boardService.delete(id, boardRequestDto.getPassword());
    }
}
