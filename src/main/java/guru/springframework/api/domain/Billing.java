package guru.springframework.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Billing implements Serializable {
    private static final long serialVersionUID = -4448018068264532737L;

    private Card card;
    private String iban;
    private String swift;
}
