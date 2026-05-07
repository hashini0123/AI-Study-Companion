package edu.icet.model;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Quizzes {
    private Long id;
    private Long documentId;
    private String title;
    private LocalDateTime createdAt;

}
