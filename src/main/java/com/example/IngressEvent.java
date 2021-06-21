package com.example;

import io.javaoperatorsdk.operator.processing.event.AbstractEvent;
import io.javaoperatorsdk.operator.processing.event.EventSource;

public class IngressEvent extends AbstractEvent {
    public IngressEvent(String relatedCustomResourceUid, EventSource eventSource) {
        super(relatedCustomResourceUid, eventSource);
    }
}
