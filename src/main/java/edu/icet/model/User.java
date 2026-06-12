package edu.icet.model;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String userName;
    private String email;
    private String password;
    private LocalDateTime createdAt;
}