package edu.icet.dto;

import lombok.*;
import org.w3c.dom.Text;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QuestionsDTO {
    private Long id;
    private Long quizId;
    private Text questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
}
