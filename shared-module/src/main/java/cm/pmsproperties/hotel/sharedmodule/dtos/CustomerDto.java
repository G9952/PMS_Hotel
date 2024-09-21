package cm.pmsproperties.hotel.sharedmodule.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CustomerDto(
        Long id,

        @Size(min = 2, max = 50)
        String name,

        @Size(min = 2, max = 50)
        String address,

        @Size(min = 2, max = 50)
        @Pattern(regexp = "^\\+(?:[0-9] ?){6,14}[0-9]$")
        String phone,

        @Email
        @Size(min = 2, max = 50)
        String email
) {
}
