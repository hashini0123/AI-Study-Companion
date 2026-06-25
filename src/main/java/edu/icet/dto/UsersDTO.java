package edu.icet.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UsersDTO {
    private String id;
    private String username;
    private String email;
    private String password;
    private String role;
    private LocalDateTime created_at;
}