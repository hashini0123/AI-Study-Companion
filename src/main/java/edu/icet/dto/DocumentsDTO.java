package edu.icet.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DocumentsDTO {
    private Long document_id;
    private String user_id;
    private String filea_name;
    private String file_path;
    private LocalDateTime uploaded_at;
}
