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
    private Long documentId;
    private String summaryText;
    private LocalDateTime createdAt;
}
