package com.example;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Kind;
import io.fabric8.kubernetes.model.annotation.Plural;
import io.fabric8.kubernetes.model.annotation.Version;

@Version("v1")
@Group("example.com")
@Kind("ExposedApp")
@Plural("exposedapps")
public class ExposedApp extends CustomResource<ExposedAppSpec, ExposedAppStatus>
    implements Namespaced {}

