package edu.icet.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UsersDTO {
    private Long id;
    private String userName;
    private String email;
    private LocalDateTime created_at;
}