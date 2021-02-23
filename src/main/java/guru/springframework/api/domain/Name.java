package guru.springframework.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Name implements Serializable {

    private static final long serialVersionUID = -4449253147370930410L;

    private String title;
    private String first;
    private String last;
}
