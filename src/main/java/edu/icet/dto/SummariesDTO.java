package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.w3c.dom.Text;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SummariesDTO {

    private String id;

    private String documentId;

    private Text summaryText;

    private LocalDateTime createdAt;

}
