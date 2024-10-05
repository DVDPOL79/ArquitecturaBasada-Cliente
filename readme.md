# Cliente-Servidor en Java con Interfaz Gráfica (JavaFX)

Este proyecto implementa un sistema simple cliente-servidor utilizando **Java Sockets** para la comunicación entre el cliente y el servidor. La parte del cliente incluye una **interfaz gráfica de usuario (GUI)** desarrollada en **JavaFX**, lo que hace que la interacción sea más amigable e intuitiva.

## Características

- **Servidor multicliente**: El servidor puede manejar múltiples conexiones de clientes simultáneamente.
- **Interfaz gráfica con JavaFX**: El cliente tiene una interfaz de usuario sencilla que permite enviar y recibir mensajes del servidor.
- **Comunicación en tiempo real**: El cliente puede enviar mensajes al servidor, y este los devuelve como una respuesta (echo).

## Requisitos

Para ejecutar este proyecto, necesitarás lo siguiente:

- **Java Development Kit (JDK) 8 o superior**
- **JavaFX** (ya incluido en el JDK 11 o posterior)
- Un **IDE** como IntelliJ IDEA, Eclipse o NetBeans (con soporte para JavaFX)

## Estructura del Proyecto



- **client_view.fxml**: Define la interfaz gráfica de usuario.
- **Client.java**: Se encarga de la lógica de conexión con el servidor (enviar y recibir mensajes).
- **ClientApp.java**: Punto de entrada de la aplicación del cliente, inicializa la interfaz gráfica.
- **ClientController.java**: Controlador que maneja los eventos de la interfaz.
- **Server.java**: Servidor que maneja la comunicación con múltiples clientes.

## Instrucciones de Ejecución

### 1. Ejecutar el Servidor

1. Navega al archivo `Server.java` en el paquete `com.myapp.server`.
2. Ejecuta el archivo para iniciar el servidor. El servidor estará escuchando en el puerto `12345` para recibir conexiones.

### 2. Ejecutar el Cliente

1. Navega al archivo `ClientApp.java` en el paquete `com.myapp.client`.
2. Ejecuta `ClientApp.java`. Esto abrirá una ventana con una interfaz gráfica que permitirá interactuar con el servidor.
3. Introduce un mensaje en el campo de texto y presiona "Send" para enviarlo al servidor.
4. El servidor responderá con un eco del mensaje, que será mostrado en el área de texto de respuesta.

## Ejemplo de Uso

1. **Iniciar el servidor**:
   - Al ejecutar `Server.java`, verás que el servidor está esperando conexiones en el puerto `12345`.
   - Mensaje de consola:
     ```
     Server started on port 12345
     ```

2. **Iniciar el cliente**:
   - Al ejecutar `ClientApp.java`, aparecerá una ventana con una interfaz gráfica.
   - Introduce un mensaje (por ejemplo: "Hola, servidor!") en el campo de texto y haz clic en "Send".
   - Verás la respuesta del servidor en el área de texto de respuesta como:
     ```
     Echo: Hola, servidor!
     ```

## Extensiones Futuras

Este proyecto se puede extender de varias maneras para cumplir con requisitos más complejos:

- **Autenticación**: Añadir autenticación de usuario mediante un sistema de inicio de sesión.
- **Cifrado**: Implementar un cifrado en la comunicación (usando SSL/TLS) para mayor seguridad.
- **Persistencia**: Agregar una base de datos para almacenar mensajes o usuarios.
- **Manejo de errores**: Mejorar la gestión de errores para reconexiones o fallos en la conexión.



