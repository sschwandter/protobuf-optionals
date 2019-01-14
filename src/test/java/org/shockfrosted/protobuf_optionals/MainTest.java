package org.shockfrosted.protobuf_optionals;

import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Test;

public class MainTest {

    @Test
    public void subMessageSet() throws InvalidProtocolBufferException {
        byte[] messageArray = Testproto.MyMessage
                .newBuilder()
                .setMessage(Testproto.MySubMessage
                        .newBuilder()
                        .setMyInt(2)
                        .build())
                .build()
                .toByteArray();

        Testproto.MyMessage message = Testproto.MyMessage.parseFrom(messageArray);

        System.out.println("Submessage set - message.hasMessage:" + (message.hasMessage()) );
    }

    @Test
    public void subMessageSetToDefault() throws InvalidProtocolBufferException {
        byte[] messageArray = Testproto.MyMessage
                .newBuilder()
                .setMessage(Testproto.MySubMessage.getDefaultInstance())
                .build().toByteArray();

        Testproto.MyMessage message = Testproto.MyMessage.parseFrom(messageArray);

        System.out.println("Submessage set to default instance - message.hasMessage:" + (message.hasMessage()) );
    }

    @Test
    public void subMessageSetToDefaultMemberInstance() throws InvalidProtocolBufferException {
        byte[] messageArray = Testproto.MyMessage
                .newBuilder()
                .setMessage(Testproto.MySubMessage
                        .newBuilder()
                        .setMyInt(0)
                        .build())
                .build()
                .toByteArray();

        Testproto.MyMessage message = Testproto.MyMessage.parseFrom(messageArray);

        System.out.println("Int in Submessage set to default value - message.hasMessage:" + (message.hasMessage()) );
    }

    @Test
    public void subMessageMissing() throws InvalidProtocolBufferException {
        byte[] messageArray = Testproto.MyMessage
                .newBuilder()
                .build()
                .toByteArray();

        Testproto.MyMessage message = Testproto.MyMessage.parseFrom(messageArray);

        System.out.println("Submessage missing - message.hasMessage:" + (message.hasMessage()));
    }

}
