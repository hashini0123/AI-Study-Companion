package edu.icet.dto;

import lombok.*;
import org.w3c.dom.Text;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SummariesDTO {
    private Long id;
    private Long documentId;
    private Text summaryText;
    private LocalDateTime createdAt;
}
