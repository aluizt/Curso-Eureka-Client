package br.com.alexandre.cursoeurekacliente.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/cursos")
public class CursoController {

    @GetMapping
    public ResponseEntity<Map> listarCursos(){

        Map<Long,String> mapa =  new HashMap<>();
        mapa.put(1l,"Java");
        mapa.put(2l,"Spring");
        mapa.put(3l,"Angular");
        mapa.put(4l,"Ionic");
        mapa.put(5l,"BongoDB");

        return ResponseEntity.ok(mapa);
    }
}
