package edu.icet.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QuizzesDTO {
    private Long id;
    private Long document_id;
    private String title;
    private LocalDateTime created_at;
}
