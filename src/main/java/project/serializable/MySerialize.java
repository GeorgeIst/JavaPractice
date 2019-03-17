package project.serializable;

import java.io.Serializable;

public class MySerialize implements Serializable {

    private static final long serialVersionUID = -8357736529576106074L;
    private String firstName;

    public MySerialize(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    private String secondName;
}
