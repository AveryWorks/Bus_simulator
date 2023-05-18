/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Buses.Bus1;
import Buses.Bus10;
import Buses.Bus2;
import Buses.Bus3;
import Buses.Bus4;
import Buses.Bus5;
import Buses.Bus6;
import Buses.Bus7;
import Buses.Bus8;
import Buses.Bus9;
import Visual.ClienteView;

/**
 *
 * @author DerekMSI
 */
public class Reloj extends Thread {

    Bus1 HiloBus1 = new Bus1();
    Bus2 HiloBus2 = new Bus2();
    Bus3 HiloBus3 = new Bus3();
    Bus4 HiloBus4 = new Bus4();
    Bus5 HiloBus5 = new Bus5();
    Bus6 HiloBus6 = new Bus6();
    Bus7 HiloBus7 = new Bus7();
    Bus8 HiloBus8 = new Bus8();
    Bus9 HiloBus9 = new Bus9();
    Bus10 HiloBus10 = new Bus10();

    public int alpha = 0;
    public int tiempo = 1;

    public int hora = 0, minutos = 0, segundos = 0;
    public String returhora = "00", returminuto = "00", retursegundo = "00";
    public boolean activo = true;

    @Override
    public void run() {
        while (activo == true) {
            calcular();
            ClienteView.labelHora.setText(returhora + " : " + returminuto + " : " + retursegundo);
            if (hora == 5 && minutos == 0 && segundos == 0) {

                System.out.println("La jornada laboral ha empezado");

                if (HiloBus1.isAlive() == false) {
                    if (HiloBus2.isAlive() == false) {
                        if (HiloBus3.isAlive() == false) {
                            if (HiloBus4.isAlive() == false) {
                                if (HiloBus5.isAlive() == false) {
                                    if (HiloBus6.isAlive() == false) {
                                        if (HiloBus7.isAlive() == false) {
                                            if (HiloBus8.isAlive() == false) {
                                                if (HiloBus9.isAlive() == false) {
                                                    if (HiloBus10.isAlive() == false) {

                                                        HiloBus1 = new Bus1();
                                                        HiloBus2 = new Bus2();
                                                        HiloBus3 = new Bus3();
                                                        HiloBus4 = new Bus4();
                                                        HiloBus5 = new Bus5();
                                                        HiloBus6 = new Bus6();
                                                        HiloBus7 = new Bus7();
                                                        HiloBus8 = new Bus8();
                                                        HiloBus9 = new Bus9();
                                                        HiloBus10 = new Bus10();

                                                        HiloBus1.activo = true;
                                                        HiloBus2.activo = true;
                                                        HiloBus3.activo = true;
                                                        HiloBus4.activo = true;
                                                        HiloBus5.activo = true;
                                                        HiloBus6.activo = true;
                                                        HiloBus7.activo = true;
                                                        HiloBus8.activo = true;
                                                        HiloBus9.activo = true;
                                                        HiloBus10.activo = true;

                                                        HiloBus1.start();
                                                        HiloBus2.start();
                                                        HiloBus3.start();
                                                        HiloBus4.start();
                                                        HiloBus5.start();
                                                        HiloBus6.start();
                                                        HiloBus7.start();
                                                        HiloBus8.start();
                                                        HiloBus9.start();
                                                        HiloBus10.start();

                                                        alpha = 1;
                                                    }

                                                }

                                            }

                                        }

                                    }

                                }
                            }

                        }

                    }

                }
            }

            if (hora == 23 && minutos == 59 && segundos == 59) {
                System.out.println("La jornada laboral ha terminado");
                HiloBus1.activo = false;
                HiloBus2.activo = false;
                HiloBus3.activo = false;
                HiloBus4.activo = false;
                HiloBus5.activo = false;
                HiloBus6.activo = false;
                HiloBus7.activo = false;
                HiloBus8.activo = false;
                HiloBus9.activo = false;
                HiloBus10.activo = false;
            }
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
            }

        }
        HiloBus1.activo = false;
        HiloBus2.activo = false;
        HiloBus3.activo = false;
        HiloBus4.activo = false;
        HiloBus5.activo = false;
        HiloBus6.activo = false;
        HiloBus7.activo = false;
        HiloBus8.activo = false;
        HiloBus9.activo = false;
        HiloBus10.activo = false;

    }

    public void calcular() {
        segundos++;
        if (segundos > 59) {

            segundos = 0;
            minutos++;

            if (minutos > 59) {

                minutos = 0;
                hora++;

                if (hora > 24) {

                    hora = 0;
                    minutos = 0;
                    segundos = 0;

                }
            }
        }
        retursegundo = segundos > 9 ? segundos + "" : "0" + segundos;
        returminuto = minutos > 9 ? minutos + "" : "0" + minutos;
        returhora = hora > 9 ? hora + "" : "0" + hora;
    }

    public int getTiempo() {
        return tiempo;
    }

}
