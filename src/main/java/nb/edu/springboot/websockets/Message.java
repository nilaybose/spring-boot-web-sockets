package nb.edu.springboot.websockets;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Message {
    private String command;
    private String text;
}
