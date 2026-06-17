package edu.icet.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SummariesDTO {
    private Long id;
    private Long documentId;
    private String summaryText;
    private LocalDateTime createdAt;
}
