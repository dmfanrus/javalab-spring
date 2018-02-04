package commons;

import lab.model.SimpleContact;
import lab.model.SimpleCountry;
import lab.model.UsualPerson;

import java.util.Arrays;

public class Tests {

    public static String APPLICATION_CONTEXT_XML_FILE_NAME =
            "application-context.xml";

    public static UsualPerson getExpectedPerson() {
        return new UsualPerson(
                1,
                "John",
                "Smith",
                new SimpleCountry(1, "Russia", "RU"),
                true,
                1.8f,
                35,
                Arrays.asList(
                        new SimpleContact("TELEPHONE", "911-103-33-95"),
                        new SimpleContact("EMAIL","skraaa@skibibi.papa")));
    }
}
