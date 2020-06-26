package language.Instantiation;

import lombok.Data;

import java.util.List;

@Data
public class MyObject {
    private List<String> list;

    public MyObject(List<String> list) {
        this.list = list;
    }

}
