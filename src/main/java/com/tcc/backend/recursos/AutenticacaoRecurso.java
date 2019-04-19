package com.tcc.backend.recursos;

import javax.servlet.http.HttpServletResponse;

import com.tcc.backend.seguranca.JWTUtil;
import com.tcc.backend.seguranca.Usuario;
import com.tcc.backend.servicos.AlunoServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class AutenticacaoRecurso {

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "/refresh_token", method = RequestMethod.POST)
    public ResponseEntity<Void> refreshToken(HttpServletResponse response) {
        Usuario user = AlunoServico.authenticated();
        String token = jwtUtil.gerarToken(user.getUsername());
        response.addHeader("Authorization", "Bearer " + token);
        return ResponseEntity.noContent().build();
    }

}