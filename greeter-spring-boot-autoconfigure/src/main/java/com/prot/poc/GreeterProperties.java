/*
 * Copyright © 2018 Capco. All rights reserved.
 * Capco BlockWorkx
 *
 * You may obtain a copy of the License at
 *
 * capco-blockworkx-license.txt file under the top-level jar file
 *
 */
package com.prot.poc;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "poc.greeter")
public class GreeterProperties {
    private String userName;
    private String morningMessage;
    private String afternoonMessage;
    private String eveningMessage;
    private String nightMessage;
}
