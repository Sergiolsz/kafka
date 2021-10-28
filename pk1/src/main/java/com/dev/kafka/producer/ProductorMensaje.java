package com.dev.kafka.producer;

import com.dev.kafka.model.Mensaje;
import java.util.Random;
import java.util.function.Supplier;
import org.springframework.stereotype.Component;

@Component
public class ProductorMensaje implements Supplier<Mensaje> {

  private String[] users = { "user60", "user70", "user80", "user90", "user100" };

  @Override
  public Mensaje get() {

    try {
      Thread.sleep(1000);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    Mensaje mensaje = new Mensaje(this.users[new Random().nextInt(5)], this.generarCuerpoMensaje());
    System.out.println("Enviando el Mensaje con id: " + mensaje.getId());
    return mensaje;
  }

  private String generarCuerpoMensaje() {
    String letrasMensaje = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    StringBuilder cadena = new StringBuilder();
    int longitudCadena = letrasMensaje.length();
    int numero = new Random().nextInt(longitudCadena);
    for (int x = 0; x < numero; x++) {
      char caracterAleatorio = letrasMensaje.charAt(new Random().nextInt(longitudCadena));
      cadena.append(caracterAleatorio);
    }
    return cadena.toString();
  }

}
