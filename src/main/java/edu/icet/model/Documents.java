package edu.icet.model;
import lombok.*;
import org.apache.catalina.User;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Documents {
    private Long id;
    private String fileName;
    private String filePath;
    private LocalDateTime uploaded_at;
    private String userId;
}