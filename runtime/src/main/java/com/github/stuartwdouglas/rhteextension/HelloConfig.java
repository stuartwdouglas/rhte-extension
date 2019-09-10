package com.github.stuartwdouglas.rhteextension;

import io.quarkus.runtime.annotations.ConfigItem;
import io.quarkus.runtime.annotations.ConfigPhase;
import io.quarkus.runtime.annotations.ConfigRoot;

@ConfigRoot(phase = ConfigPhase.RUN_TIME)
public class HelloConfig {

    /**
     * The greeting
     */
    @ConfigItem(defaultValue = "Hello")
    String greeting;
}
