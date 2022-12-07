package bo.gob.impuestos.sin.java101.democomportamiento.mediator;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(LocalDateTime.now() + " [" +
                           user.getName() + "]: " + message);
    }

}
