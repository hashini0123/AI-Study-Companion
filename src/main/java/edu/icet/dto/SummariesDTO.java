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
    private Long document_id;
    private String summary_text;
    private LocalDateTime created_at;

}
