package com.example;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.api.*;
import io.javaoperatorsdk.operator.api.Context;
import io.javaoperatorsdk.operator.processing.event.EventSourceManager;

@Controller
public class ExposedAppController implements ResourceController<ExposedApp> {

    private final KubernetesClient client;

    public ExposedAppController(KubernetesClient client) {
        this.client = client;
    }

    // TODO Fill in the rest of the controller

    @Override
    public void init(EventSourceManager eventSourceManager) {
        // TODO: fill in init
    }

    @Override
    public UpdateControl<ExposedApp> createOrUpdateResource(
        ExposedApp resource, Context<ExposedApp> context) {
        // TODO: fill in logic

        return UpdateControl.noUpdate();
    }
}

