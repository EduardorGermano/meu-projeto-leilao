package com.leilao.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leilao.backend.model.Profile;
import com.leilao.backend.service.ProfileService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/profile")
public class ProfileController {
    
    @Autowired
    private ProfileService profileService;

    @PostMapping
    public Profile create(@RequestBody Profile profile){
        return profileService.create(profile);
    }

    @PutMapping
    public Profile update(Profile profile){
        return profileService.update(profile);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathParam("id")Long id) {
        profileService.delete(id);
    }

    @GetMapping
    public List<Profile>listAll(){
        return profileService.listAll();
    }
}
