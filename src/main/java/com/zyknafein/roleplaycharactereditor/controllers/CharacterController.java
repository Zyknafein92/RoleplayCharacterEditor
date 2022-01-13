package com.zyknafein.roleplaycharactereditor.controllers;


import com.zyknafein.roleplaycharactereditor.dto.CharacterDTO;
import com.zyknafein.roleplaycharactereditor.models.RoleplayCharacter;
import com.zyknafein.roleplaycharactereditor.services.RoleplayCharacterService;
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

    private final RoleplayCharacterService roleplayCharacterService;

    @GetMapping("/{id}")
    public ResponseEntity<RoleplayCharacter> getCharacter(@PathVariable("id") Long id) {
        return new ResponseEntity<>(roleplayCharacterService.getCharacter(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<RoleplayCharacter> addCharacter(@Validated @RequestBody CharacterDTO characterDTO) {
        RoleplayCharacter characterToAdd = roleplayCharacterService.addCharacter(characterDTO);
        return new ResponseEntity<>(characterToAdd,HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<RoleplayCharacter> updateCharacter(@Valid @RequestBody CharacterDTO characterDTO) {
        RoleplayCharacter characterToUpdate = roleplayCharacterService.updateCharacter(characterDTO);
        return new ResponseEntity<>(characterToUpdate, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleteCharacter(@PathVariable("id") Long id) {
        return new ResponseEntity<>(roleplayCharacterService.deleteCharacter(id), HttpStatus.OK);
    }

}
