package org.shockfrosted.protobuf_optionals;

import org.junit.Test;

public class MainTest {

    @Test
    public void subMessageSet() {
        Testproto.MyMessage message = Testproto.MyMessage
                .newBuilder()
                .setMessage(Testproto.MySubMessage
                        .newBuilder()
                        .setMyInt(2)
                        .build())
                .build();

        System.out.println("Submessage set - message.hasMessage:" + (message.hasMessage()) );
    }

    @Test
    public void subMessageSetToDefault() {
        Testproto.MyMessage message = Testproto.MyMessage
                .newBuilder()
                .setMessage(Testproto.MySubMessage.getDefaultInstance())
                .build();

        System.out.println("Submessage set to default instance - message.hasMessage:" + (message.hasMessage()) );
    }

    @Test
    public void subMessageSetToDefaultMemberInstance() {
        Testproto.MyMessage message = Testproto.MyMessage
                .newBuilder()
                .setMessage(Testproto.MySubMessage
                        .newBuilder()
                        .setMyInt(0)
                        .build())
                .build();

        System.out.println("Int in Submessage set to default value - message.hasMessage:" + (message.hasMessage()) );
    }

    @Test
    public void subMessageMissing() {
        Testproto.MyMessage message = Testproto.MyMessage
                .newBuilder()
                .build();

        System.out.println("Submessage missing - message.hasMessage:" + (message.hasMessage()));
    }

}
