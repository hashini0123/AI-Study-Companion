package edu.icet.model;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Questions {
    private Long id;
    private Long quizId;
    private String question_text;
    private String option_a;
    private String option_b;
    private String option_c;
    private String option_d;
    private String correct_option;

}
