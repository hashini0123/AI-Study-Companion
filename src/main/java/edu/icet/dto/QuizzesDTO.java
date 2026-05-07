package edu.icet.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QuizzesDTO {
    private String id;
    private String documentId;
    private String title;
    private LocalDateTime createdAt;
}
