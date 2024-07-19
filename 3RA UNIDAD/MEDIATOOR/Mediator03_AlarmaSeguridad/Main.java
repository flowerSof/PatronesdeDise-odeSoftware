/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mediator03_AlarmaSeguridad;

/**
 *
 * @author SOFIA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaSeguridad sistema = new SistemaSeguridad();

        Sensor alarmao = new Alarma(sistema);
        Sensor rociador = new Rociadores(sistema);

        sistema.agregarSensor(alarmao);
        sistema.agregarSensor(rociador);

        alarmao.enviar("Detectado humo en el piso 1.");
    }
    
}
