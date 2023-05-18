package Buses;

import Visual.ClienteView;
import javax.swing.ImageIcon;

/**
 *
 * @author Emapc
 */
public class Bus10 extends Thread {

    public boolean activo = true;
    public int i = 0;
    public int tiempo = 1000;

    public void run() {
        i = 1;
//        try {
//            sleep(tiempo*10);
//        } catch (InterruptedException ex) {
//        }
        while (activo == true) {
            if (i == 1) {
                ClienteView.N2.setIcon(new ImageIcon(ClienteView.imgparada));
                ClienteView.N3.setIcon(new ImageIcon(ClienteView.imgbus10));
                i++;
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
            }
            if (i == 2) {
                ClienteView.N3.setIcon(new ImageIcon(ClienteView.imgparada));
                ClienteView.N4.setIcon(new ImageIcon(ClienteView.imgbus10));
                i++;
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }
            }
            if (i == 3) {
                ClienteView.N4.setIcon(new ImageIcon(ClienteView.imgparada));
                ClienteView.N5.setIcon(new ImageIcon(ClienteView.imgbus10));
                i++;
                try {
                    sleep(tiempo);
                } catch (InterruptedException e) {
                }

                if (i == 4) {
                    ClienteView.N5.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N6.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }

                if (i == 5) {
                    ClienteView.N6.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N7.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 6) {
                    ClienteView.N7.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N8.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 7) {
                    ClienteView.N8.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N9.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 8) {
                    ClienteView.N9.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N10.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 9) {
                    ClienteView.N10.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N11.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 10) {
                    ClienteView.N11.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N12.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 11) {
                    ClienteView.N12.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N13.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 12) {
                    ClienteView.N13.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N14.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 13) {
                    ClienteView.N14.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N15.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 14) {
                    ClienteView.N15.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N16.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 15) {
                    ClienteView.N16.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N17.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 16) {
                    ClienteView.N17.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N18.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 17) {
                    ClienteView.N18.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N19.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 18) {
                    ClienteView.N19.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N20.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 19) {
                    ClienteView.N20.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N1.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i++;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }
                if (i == 20) {
                    ClienteView.N1.setIcon(new ImageIcon(ClienteView.imgparada));
                    ClienteView.N2.setIcon(new ImageIcon(ClienteView.imgbus10));
                    i = 1;
                    try {
                        sleep(tiempo);
                    } catch (InterruptedException e) {
                    }
                }

            }
        }
        System.out.println("Bus 10 se ha detenido");
    }
}
