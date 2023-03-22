package nb.edu.springboot.websockets;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OutputMessage {
    private String command;
    private String text;
    private String time;
}
