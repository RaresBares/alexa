package de.alexa.virus.communication.client;

import de.alexa.virus.communication.transfer.Request;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Client {


    private InputStream inputStream;
    private OutputStream outputStream;



    private void send(String str) throws IOException {
        outputStream.write(Integer.parseInt(str));
        outputStream.flush();
    }

    public void quit() throws IOException {
        outputStream.write(Integer.parseInt(KeyWords.CHANNEL_TRANSMISSION_END.psn));
    }

    public void respond(Request request) throws IOException {
        send(request.getResMessage());
    }
}
