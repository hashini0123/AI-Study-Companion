package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.w3c.dom.Text;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QuestionsDTO {

    private String id;

    private String quizId;

    private Text questionText;

    private String optionA;

    private String optionB;

    private String optionC;

    private String optionD;

}
