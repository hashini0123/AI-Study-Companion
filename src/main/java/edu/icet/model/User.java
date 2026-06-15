package edu.icet.model;
import lombok.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String user_id;
    private String userName;
    private String email;
    private LocalDateTime createdAt;
}