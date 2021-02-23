package guru.springframework.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card implements Serializable {
    private static final long serialVersionUID = -5408861289567917086L;

    private String type;
    private String number;
    private ExpirationDate expirationDate;
}
