package com.sparta.springpostwork01.controller;

import com.sparta.springpostwork01.domain.Post;
import com.sparta.springpostwork01.domain.PostPasswordDto;
import com.sparta.springpostwork01.domain.PostRepository;
import com.sparta.springpostwork01.domain.PostRequestDto;
import com.sparta.springpostwork01.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //응답을 전부 JSON 형태로 응답하겠다는 뜻
@RequiredArgsConstructor
public class PostController {

    private final PostRepository postRepository;
    private final PostService postService;

    @PostMapping("/api/posts") //게시글 작성 API
    public Post createPost(@RequestBody PostRequestDto requestDto) {
        return postRepository.save(new Post(requestDto));
    }


    @GetMapping("/api/posts") //전체 게시글 목록 조회 API
    public List<Post> getPosts() {
        return postRepository.findAllByOrderByModifiedAtDesc();
    }


    @GetMapping("/api/posts/{id}") //선택 게시글 조회 API
    public Post getPrivatePosts(@PathVariable Long id) {
        return postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
    }


    @PutMapping("/api/posts/{id}") //게시글 수정 API
    public Long updatePosts(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        postService.update(id, requestDto);
        return id;
    }


    @DeleteMapping("/api/posts/{id}") //게시글 삭제 API
    public Long deletePosts(@PathVariable Long id) {
        postRepository.deleteById(id);
        return id;
    }


    @PostMapping("/api/posts/{id}") //비밀번호 일치 여부 확인 API
    public String checkPasswordPosts(@PathVariable Long id, @RequestBody PostPasswordDto passwordDto, @RequestBody PostRequestDto requestDto) {
//        Post post = postRepository.findById(id).orElseThrow(
//                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
//        );

        if (requestDto.getPassword().equals(passwordDto.getPassword())) { //비밀번호가 일치한다
            return "비밀번호가 일치합니다.";
        }
        else { //비밀번호가 틀립니다.
            return "비밀번호가 맞지 않습니다.";
        }
    }

}
