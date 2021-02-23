package guru.springframework.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpirationDate implements Serializable {
    private static final long serialVersionUID = -5644768933212232252L;

    private String date;
    private Integer timezoneType;
    private String timezone;
}
