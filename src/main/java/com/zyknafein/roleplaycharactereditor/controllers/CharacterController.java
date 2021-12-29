package com.zyknafein.roleplaycharactereditor.controllers;


import com.zyknafein.roleplaycharactereditor.services.CharacterService;
import com.zyknafein.roleplaycharactereditor.services.dto.CharacterDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/user/character")
@AllArgsConstructor
public class CharacterController {

    private final CharacterService characterService;

    @GetMapping("/{id}")
    public ResponseEntity<Character> getCharacter(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(characterService.getCharacter(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Character> addCharacter(@Validated @RequestBody CharacterDTO characterDTO) {
        Character characterToAdd = characterService.addCharacter(characterDTO);
        return new ResponseEntity<>(characterToAdd,HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Character> updateCharacter(@Valid @RequestBody CharacterDTO characterDTO) {
        Character characterToUpdate = characterService.updateCharacter(characterDTO);
        return new ResponseEntity<>(characterToUpdate, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integer> deleteCharacter(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(characterService.deleteCharacter(id), HttpStatus.OK);
    }

}
