package com.turkcell.findex.api.controllers;

import com.turkcell.findex.business.abstracts.FindexService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/findex")
public class FindexController {
    private FindexService findexService;

    @GetMapping("/{nationalId}")
    public ResponseEntity<Integer> getScore(@PathVariable String nationalId) {
        return new ResponseEntity<>(findexService.getFindexScore(nationalId), HttpStatus.OK);
    }
}
