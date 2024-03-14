package com.careerit.jfs.cbook;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contact {
    private long cid;
    private String name;
    private String email;
    private String mobile;
}
