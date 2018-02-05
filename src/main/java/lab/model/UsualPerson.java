package lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Getter
@AllArgsConstructor
@Component("person")
public class UsualPerson implements Person {
    private int id;
    private String firstName;
    private String lastName;
    private Country country;
    private int age;
    private float height;
    private boolean isProgrammer;
    private boolean isBroke;
    private List contacts;

    @Override
    public void setBroke(boolean b) {
        isBroke = b;
    }
}