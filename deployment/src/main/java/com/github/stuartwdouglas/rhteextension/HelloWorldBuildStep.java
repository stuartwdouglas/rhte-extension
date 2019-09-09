package com.github.stuartwdouglas.rhteextension;

import javax.servlet.DispatcherType;

import org.jboss.jandex.DotName;

import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.CombinedIndexBuildItem;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.undertow.deployment.FilterBuildItem;

public class HelloWorldBuildStep {

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem("rhte-extension");
    }

    @BuildStep
    FilterBuildItem loggingFilter() {
        return FilterBuildItem.builder("log", LoggingFilter.class.getName())
                .addFilterUrlMapping("/*", DispatcherType.REQUEST)
                .build();
    }

    @BuildStep
    AdditionalBeanBuildItem filter(CombinedIndexBuildItem index) {
        if (index.getIndex().getAllKnownImplementors(DotName.createSimple(HelloService.class.getName())).isEmpty()) {
            return AdditionalBeanBuildItem.unremovableOf(DefaultHelloService.class);
        }
        return null;
    }


}
