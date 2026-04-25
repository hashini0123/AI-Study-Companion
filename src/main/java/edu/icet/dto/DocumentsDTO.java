package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
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
