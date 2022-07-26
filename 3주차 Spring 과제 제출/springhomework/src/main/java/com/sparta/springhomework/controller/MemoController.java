package com.sparta.springhomework.controller;

import com.sparta.springhomework.domain.Memo;
import com.sparta.springhomework.domain.MemoRepository;
import com.sparta.springhomework.domain.MemoRequestDto;
import com.sparta.springhomework.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MemoController {

    private final MemoRepository memoRepository;
    private final MemoService memoService;


    @PostMapping("/api/memos") //게시글 작성
    public Memo createMemo(@RequestBody MemoRequestDto requestDto) {
        Memo memo = new Memo(requestDto);
        return memoRepository.save(memo);
    }

    @GetMapping("/api/memos") //전체 게시글 조회
    public List<Memo> getMemos() {
        return memoRepository.findAllByOrderByModifiedAtDesc();
    }

    
    @GetMapping("/api/memos/{id}") //선택 게시글 조회
    public Memo getPrivateMemos(@PathVariable Long id) {
        return memoRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
    }

    @PutMapping("/api/memos/{id}") //게시글 수정
    public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        memoService.update(id, requestDto);
        return id;
    }

    @DeleteMapping("/api/memos/{id}") //게시글 삭제
    public Long deleteMemo(@PathVariable Long id) {
        memoRepository.deleteById(id);
        return id;
    }
}
