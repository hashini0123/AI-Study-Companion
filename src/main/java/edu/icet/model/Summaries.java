package edu.icet.model;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Summaries {
    private Long id;
    private Long document_id;
    private String summary_text;
    private LocalDateTime created_at;
}
