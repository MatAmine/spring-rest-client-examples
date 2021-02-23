package guru.springframework.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location implements Serializable {
    private static final long serialVersionUID = -8487302089081033040L;

    private String street;
    private String city;
    private String state;
    private String postcode;
}
