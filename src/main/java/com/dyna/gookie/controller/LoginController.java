package com.dyna.gookie.controller;

import com.dyna.gookie.entity.Member;
import com.dyna.gookie.service.LoginService;
import com.dyna.gookie.utils.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/login")
public class LoginController {

    private final LoginService loginService;

    //TODO 로그인
    @PostMapping
    public ResponseEntity login(@RequestParam(value = "memberLoginId") String memberLoginId, @RequestParam(value = "memberLoginPw") String memberLoginPw, HttpServletRequest request) throws Exception{
        HttpHeaders httpHeaders = new HttpHeaders();

        String result = loginService.login(memberLoginId, memberLoginPw, request);

        Response response = new Response(200, "성공", result);

        return new ResponseEntity<>(response, httpHeaders, HttpStatus.OK);
    }

}
