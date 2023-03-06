package com.sparta.board.service;

import com.sparta.board.dto.BoardRequestDto;
import com.sparta.board.dto.BoardResponeDto;
import com.sparta.board.entity.Board;
import com.sparta.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public List<Board> getBoards() {
        return boardRepository.findAllByOrderByModifiedAtDesc();
    }

    @Transactional
    public Optional<Board> getBoardId(Long id, BoardRequestDto boardRequestDto){
        Board board = boardRepository.findAllById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않는다.")
        );
        board.getBoardId(boardRequestDto);
        return boardRepository.findAllById(id);
    }

    @Transactional
    public Board createBoard(BoardRequestDto boardRequestDto) {
        Board board = new Board(boardRequestDto);
        boardRepository.save(board);
        return board;
    }

    @Transactional
    public Optional<Board> update(Long id, BoardRequestDto boardRequestDto,String password) {
        Board board = boardRepository.findAllById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않는다.")
        );
        if (board.getPassword().equals(password)) {
            board.update(boardRequestDto);
            return boardRepository.findAllById(id);
        }
        return null;
    }

    @Transactional
    public BoardResponeDto delete(Long id, String password) {
        Board board = boardRepository.findAllById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        BoardResponeDto result = new BoardResponeDto();
        if (board.getPassword().equals(password)) {
            boardRepository.deleteById(id);
            result.setResult("success", "게시물이 삭제되었습니다.");
            return result;
        } else {
            result.setResult("failed","실패입니다.");
            return result;
        }
    }
}
