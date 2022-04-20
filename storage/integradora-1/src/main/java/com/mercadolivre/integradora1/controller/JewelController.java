package com.mercadolivre.integradora1.controller;

import com.mercadolivre.integradora1.dto.JewelDTO;
import com.mercadolivre.integradora1.entity.Jewel;
import com.mercadolivre.integradora1.service.JewelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(JewelController.baseUri)
public class JewelController {

    public static final String baseUri = "/jewel";
    @Autowired
    private JewelService jewelService;

    @GetMapping("/list")
    public ResponseEntity<List<JewelDTO>> listJewels(){
        List<JewelDTO> result = jewelService.listJewels().stream().map(JewelDTO::map).collect(Collectors.toList());
        return ResponseEntity.ok(result);
    }

    @PostMapping("/new")
    public ResponseEntity<JewelDTO> addJewel(@RequestBody JewelDTO jewelDTO, UriComponentsBuilder uriBuilder){
        Jewel jewel = jewelDTO.map();
        jewelService.addJewel(jewel);

        URI uri = uriBuilder
                .path(JewelController.baseUri.concat("/{id}"))
                .buildAndExpand(jewel.getId())
                .toUri();

        JewelDTO jewelSaved = JewelDTO.map(jewel);
        return ResponseEntity.created(uri).body(jewelSaved);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> removeJewel(@PathVariable Long id){
        jewelService.removeJewel(id);
        return ResponseEntity.ok("Jewel deleted.");
    }
}
