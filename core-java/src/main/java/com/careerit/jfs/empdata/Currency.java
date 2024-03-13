package com.careerit.jfs.empdata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Currency {

        private String code;
        private String name;
        private String symbol;
        @JsonProperty("decimal_digits")
        private int decimalDigits;
}
