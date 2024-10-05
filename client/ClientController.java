package com.myapp.client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ClientController {
    @FXML
    private TextField messageField;

    @FXML
    private TextArea responseArea;

    @FXML
    private Button sendButton;

    @FXML
    private void sendMessage() {
        String message = messageField.getText();
        if (!message.isEmpty()) {
            Client client = ClientApp.getClient();
            client.sendMessage(message);
            messageField.clear();
            try {
                String response = client.receiveMessage();
                responseArea.appendText(response + "\n");
            } catch (IOException e) {
                responseArea.appendText("Error receiving message\n");
            }
        }
    }
}
