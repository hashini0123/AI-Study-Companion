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
    private Long document_id;
    private String title;
    private LocalDateTime created_at;

}
