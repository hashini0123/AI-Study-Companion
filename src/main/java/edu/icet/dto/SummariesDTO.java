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
    private String id;
    private String documentId;
    private Text summaryText;
    private LocalDateTime createdAt;
}
