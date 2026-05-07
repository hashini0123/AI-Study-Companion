package edu.icet.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DocumentsDTO {
    private String id;
    private String userId;
    private String fileName;
    private String filePath;
    private LocalDateTime uploadedAt;
}
