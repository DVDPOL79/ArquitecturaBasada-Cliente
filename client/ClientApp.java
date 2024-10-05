package com.myapp.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClientApp extends Application {
    private static Client client;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("client_view.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Client Interface");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        try {
            client = new Client("localhost", 12345); // Conectar al servidor local en el puerto 12345
        } catch (IOException e) {
            e.printStackTrace();
        }
        launch(args);
    }

    public static Client getClient() {
        return client;
    }
}
