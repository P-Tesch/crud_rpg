package com.tesch.rpg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tesch.rpg.dtos.SheetDTO;
import com.tesch.rpg.dtos.UserDTO;
import com.tesch.rpg.services.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    
    @Operation(summary = "Register endpoint")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "User registered", content = @Content(schema = @Schema(implementation = Long.class))),
        @ApiResponse(responseCode = "400", description = "Registration error", content = @Content(schema = @Schema(implementation = String.class)))
    })
    @PostMapping("/register")
    public ResponseEntity<Long> registerUser(@RequestBody final UserDTO userDTO) {
        return new ResponseEntity<Long>(this.userService.registerUser(userDTO), HttpStatus.CREATED);
    }

    @Operation(summary = "Login endpoint")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = UserDTO.class))),
        @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = String.class)))
    })
    @PostMapping("/login")
    public ResponseEntity<SheetDTO> LoginUser(@RequestBody final UserDTO userDTO) {
        return ResponseEntity.ok(this.userService.loginUser(userDTO));
    }
}
