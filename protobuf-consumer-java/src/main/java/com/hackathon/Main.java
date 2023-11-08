package com.hackathon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hackathon 2023! protobuf JAVA consumer");
        Event.EventEnvelope eventEnvelope = createEvent();
        System.out.println("**************************************************");
        System.out.println("*          EVENT generated by protobuf:          *");
        System.out.println("**************************************************");
        System.out.println(eventEnvelope);
        System.out.println("**************************************************");
    }

    private static Event.EventEnvelope createEvent() {
        return Event.EventEnvelope.newBuilder()
                .setInstanceId("SomeId")
                .setEventId("SomeEventId")
                .setSeverity(Event.EventEnvelope.Severity.INFORMATION)
                .setEventType("SPLENDID PROJECT")
                .setUserName("theKing")
                .setSourceComponent("SourceComponent")
                .setSourceDeviceRef("SourceDeviceRef")
                .setSourceDeviceName("SourceDeviceName")
                .setSourceIp("SourceIp")
                .setDestinationIp("DestinationIp")
                .setOperation("Operation")
                .setAuditable(true)
                .setResponseState("ResponseState")
                .setResourceRef("ResourceRef")
                .putCorrelationIds("CorrelationIds", "value")
                .build();
    }
}
