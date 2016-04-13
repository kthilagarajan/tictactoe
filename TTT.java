/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Thilagarajan K
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TTT {
                

    static int totalInstance = 0;
    static int checkInstance = 0;
    static int getCheckInstance;
    static JLabel labelPlayer = new JLabel();
    static JLabel result = new JLabel();
    static JButton a1 = new JButton();
    static JButton a2 = new JButton();
    static JButton a3 = new JButton();
    static JButton b1 = new JButton();
    static JButton b2 = new JButton();
    static JButton b3 = new JButton();
    static JButton c1 = new JButton();
    static JButton c2 = new JButton();
    static JButton c3 = new JButton();
    static String a = "", aa = "", aaa = "", b = "", bb = "", bbb = "", c = "", cc = "", ccc = "";
    static JFrame f = new JFrame();
    
    public static void main(String[] args) {
        f = new JFrame();//creating instance of JFrame  

        a1 = new JButton("");//creating instance of JButton  
        a1.setBounds(80, 100, 60, 40);//x axis, y axis, width, height  
        a2 = new JButton("");//creating instance of JButton  
        a2.setBounds(160, 100, 60, 40);//x axis, y axis, width, height  
        a3 = new JButton("");//creating instance of JButton  
        a3.setBounds(240, 100, 60, 40);//x axis, y axis, width, height  

        b1 = new JButton("");//creating instance of JButton  
        b1.setBounds(80, 180, 60, 40);//x axis, y axis, width, height  
        b2 = new JButton("");//creating instance of JButton  
        b2.setBounds(160, 180, 60, 40);//x axis, y axis, width, height  
        b3 = new JButton("");//creating instance of JButton  
        b3.setBounds(240, 180, 60, 40);//x axis, y axis, width, height  

        c1 = new JButton("");//creating instance of JButton  
        c1.setBounds(80, 260, 60, 40);//x axis, y axis, width, height  
        c2 = new JButton("");//creating instance of JButton  
        c2.setBounds(160, 260, 60, 40);//x axis, y axis, width, height  
        c3 = new JButton("");//creating instance of JButton  
        c3.setBounds(240, 260, 60, 40);//x axis, y axis, width, height  

        final JButton reset = new JButton("Reset");//creating instance of JButton  
        reset.setBounds(90, 340, 200, 40);//x axis, y axis, width, height  

        labelPlayer = new JLabel("Player 1 Turn");
        labelPlayer.setBounds(140, 380, 200, 40);//x axis, y axis, width, height  
        
        result.setBounds(140, 380, 200, 40);//x axis, y axis, width, height  

        a1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCheckInstance = checkInstance();
                System.out.println("getCheckInstance :" + getCheckInstance);
                if (getCheckInstance == 1) {
                    labelPlayer.setText("Player 2 Turn");
                    a1.setBackground(Color.ORANGE);
                    a1.setName("orange");
                    a1.setEnabled(false);
                    System.out.println("a1 Orange - Instance :" + totalInstance());
                } else if (getCheckInstance == 2) {
                    labelPlayer.setText("Player 1 Turn");
                    a1.setBackground(Color.BLUE);
                    a1.setName("blue");
                    a1.setEnabled(false);
                    System.out.println("a1 Blue - Instance :" + totalInstance());
                }
            }
        });
        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCheckInstance = checkInstance();
                System.out.println("getCheckInstance :" + getCheckInstance);
                if (getCheckInstance == 1) {
                    labelPlayer.setText("Player 2 Turn");
                    a2.setBackground(Color.ORANGE);
                    a2.setName("orange");
                    a2.setEnabled(false);
                    System.out.println("a2 Orange - Instance :" + totalInstance());
                } else if (getCheckInstance == 2) {
                    labelPlayer.setText("Player 1 Turn");
                    a2.setBackground(Color.BLUE);
                    a2.setName("blue");
                    a2.setEnabled(false);
                    System.out.println("a2 Blue- Instance :" + totalInstance());
                }
            }
        });
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCheckInstance = checkInstance();
                System.out.println("getCheckInstance :" + getCheckInstance);
                if (getCheckInstance == 1) {
                    labelPlayer.setText("Player 2 Turn");
                    a3.setBackground(Color.ORANGE);
                    a3.setName("orange");
                    a3.setEnabled(false);
                    System.out.println("a3 Orange - Instance :" + totalInstance());
                } else if (getCheckInstance == 2) {
                    labelPlayer.setText("Player 1 Turn");
                    a3.setBackground(Color.BLUE);
                    a3.setName("blue");
                    a3.setEnabled(false);
                    System.out.println("a3 Blue - Instance :" + totalInstance());
                }
            }
        });

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCheckInstance = checkInstance();
                System.out.println("getCheckInstance :" + getCheckInstance);
                if (getCheckInstance == 1) {
                    labelPlayer.setText("Player 2 Turn");
                    b1.setBackground(Color.ORANGE);
                    b1.setName("orange");
                    b1.setEnabled(false);
                    System.out.println("b1 Orange - Instance :" + totalInstance());
                } else if (getCheckInstance == 2) {
                    labelPlayer.setText("Player 1 Turn");
                    b1.setBackground(Color.BLUE);
                    b1.setName("blue");
                    b1.setEnabled(false);
                    System.out.println("b1 Blue - Instance :" + totalInstance());
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCheckInstance = checkInstance();
                System.out.println("getCheckInstance :" + getCheckInstance);
                if (getCheckInstance == 1) {
                    labelPlayer.setText("Player 2 Turn");
                    b2.setBackground(Color.ORANGE);
                    b2.setName("orange");
                    b2.setEnabled(false);
                    System.out.println("b2 Orange - Instance :" + totalInstance());
                } else if (getCheckInstance == 2) {
                    labelPlayer.setText("Player 1 Turn");
                    b2.setBackground(Color.BLUE);
                    b2.setName("blue");
                    b2.setEnabled(false);
                    System.out.println("b2 Blue - Instance :" + totalInstance());
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCheckInstance = checkInstance();
                System.out.println("getCheckInstance :" + getCheckInstance);
                if (getCheckInstance == 1) {
                    labelPlayer.setText("Player 2 Turn");
                    b3.setBackground(Color.ORANGE);
                    b3.setName("orange");
                    b3.setEnabled(false);
                    System.out.println("b3 Orange - Instance :" + totalInstance());
                } else if (getCheckInstance == 2) {
                    labelPlayer.setText("Player 1 Turn");
                    b3.setBackground(Color.BLUE);
                    b3.setName("blue");
                    b3.setEnabled(false);
                    System.out.println("b3 Blue - Instance :" + totalInstance());
                }
            }
        });
        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCheckInstance = checkInstance();
                System.out.println("getCheckInstance :" + getCheckInstance);
                if (getCheckInstance == 1) {
                    labelPlayer.setText("Player 2 Turn");
                    c1.setBackground(Color.ORANGE);
                    c1.setName("orange");
                    c1.setEnabled(false);
                    System.out.println("c1 Orange - Instance :" + totalInstance());
                } else if (getCheckInstance == 2) {
                    labelPlayer.setText("Player 1 Turn");
                    c1.setBackground(Color.BLUE);
                    c1.setName("blue");
                    c1.setEnabled(false);
                    System.out.println("c1 Blue - Instance :" + totalInstance());
                }
            }
        });
        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCheckInstance = checkInstance();
                System.out.println("getCheckInstance :" + getCheckInstance);
                if (getCheckInstance == 1) {
                    labelPlayer.setText("Player 2 Turn");
                    c2.setBackground(Color.ORANGE);
                    c2.setName("orange");
                    c2.setEnabled(false);
                    System.out.println("c2 Orange - Instance :" + totalInstance());
                } else if (getCheckInstance == 2) {
                    labelPlayer.setText("Player 1 Turn");
                    c2.setBackground(Color.BLUE);
                    c2.setName("blue");
                    c2.setEnabled(false);
                    System.out.println("c2 Blue - Instance :" + totalInstance());
                }
            }
        });
        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCheckInstance = checkInstance();
                System.out.println("getCheckInstance :" + getCheckInstance);
                if (getCheckInstance == 1) {
                    labelPlayer.setText("Player 2 Turn");
                    c3.setBackground(Color.ORANGE);
                    c3.setName("orange");
                    c3.setEnabled(false);
                    System.out.println("c3 Orange - Instance :" + totalInstance());
                } else if (getCheckInstance == 2) {
                    labelPlayer.setText("Player 1 Turn");
                    c3.setBackground(Color.BLUE);
                    c3.setName("blue");
                    c3.setEnabled(false);
                    System.out.println("c3 Blue - Instance :" + totalInstance());
                }
            }
        });

        reset.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                resetEverything();
            }
        });

        f.add(a1);//adding button in JFrame  
        f.add(a2);//adding button in JFrame  
        f.add(a3);//adding button in JFrame  
        f.add(b1);//adding button in JFrame  
        f.add(b2);//adding button in JFrame  
        f.add(b3);//adding button in JFrame  
        f.add(c1);//adding button in JFrame  
        f.add(c2);//adding button in JFrame  
        f.add(c3);//adding button in JFrame  
        f.add(reset);//adding button in JFrame  
        f.add(labelPlayer);//adding button in JFrame  

        f.setSize(400, 500);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
    }

    public static int checkInstance() {
        if (checkInstance == 0) {
            checkInstance = 1;
        } else if (checkInstance == 1) {
            checkInstance = 2;
        } else if (checkInstance == 2) {
            checkInstance = 1;
        }
        return checkInstance;
    }

    public static int totalInstance() {

        totalInstance++;
        if (totalInstance == 9) {
            if (checkWinning() != true) {
                
                labelPlayer.setText("Game Draw !!!Click Reset!!");
                JOptionPane.showMessageDialog(f, "Game Draw !!!Click Reset!!");  
                resetEverything();
            } else if (checkWinning() == true) {
                if (checkInstance == 1) {
                    
                    labelPlayer.setText("Player 1 Wins !!!Click Reset!!");
                    JOptionPane.showMessageDialog(f, "Player 1 Wins !!!Click Reset!!");  
                    resetEverything();
                } else if (checkInstance == 2) {
                    
                    labelPlayer.setText("Player 2 Wins !!!Click Reset!!");
                    JOptionPane.showMessageDialog(f, "Player 2 Wins !!!Click Reset!!");  
                    resetEverything();
                }
            }
        } else {
            if (checkWinning() == true) {
                if (checkInstance == 1) {
                    
                    labelPlayer.setText("Player 1 Wins !!!Click Reset!!");
//                    Thread.sleep(1000);
                    JOptionPane.showMessageDialog(f, "Player 1 Wins !!!Click Reset!!");  
                    resetEverything();
                } else if (checkInstance == 2) {
                    
                    labelPlayer.setText("Player 2 Wins !!!Click Reset!!");
                    JOptionPane.showMessageDialog(f, "Player 2 Wins !!!Click Reset!!");  
                    resetEverything();
                }
            }
        }
        return totalInstance;
    }

    public static Boolean checkWinning() {
        try {
            System.out.println("/***********************/");
            a = a1.getName();
            if (a == null) {
                a = "";
            }
            System.out.println("A1 - " + a);
            aa = a2.getName();
            if (aa == null) {
                aa = "";
            }
            System.out.println("A2 - " + aa);
            aaa = a3.getName();
            if (aaa == null) {
                aaa = "";
            }
            System.out.println("A3 - " + aaa);

            b = b1.getName();
            if (b == null) {
                b = "";
            }
            System.out.println("B1 - " + b);
            bb = b2.getName();
            if (bb == null) {
                bb = "";
            }
            System.out.println("B2 - " + bb);
            bbb = b3.getName();
            if (bbb == null) {
                bbb = "";
            }
            System.out.println("B3 - " + bbb);

            c = c1.getName();
            if (c == null) {
                c = "";
            }
            System.out.println("C1 - " + c);
            cc = c2.getName();
            if (cc == null) {
                cc = "";
            }
            System.out.println("C2 - " + cc);
            ccc = c3.getName();
            if (ccc == null) {
                ccc = "";
            }
            System.out.println("C3 - " + ccc);
            System.out.println("/************************/");

            if (a.equals("orange") && aa.equals("orange") && aaa.equals("orange")) {
                return true;
            } else if (b.equals("orange") && bb.equals("orange") && bbb.equals("orange")) {
                return true;
            } else if (c.equals("orange") && cc.equals("orange") && ccc.equals("orange")) {
                return true;
            } else if (a.equals("orange") && b.equals("orange") && c.equals("orange")) {
                return true;
            } else if (aa.equals("orange") && bb.equals("orange") && cc.equals("orange")) {
                return true;
            } else if (aaa.equals("orange") && bbb.equals("orange") && ccc.equals("orange")) {
                return true;
            } else if (a.equals("orange") && bb.equals("orange") && ccc.equals("orange")) {
                return true;
            } else if (aaa.equals("orange") && bb.equals("orange") && c.equals("orange")) {
                return true;
            } else if (a.equals("blue") && aa.equals("blue") && aaa.equals("blue")) {
                return true;
            } else if (b.equals("blue") && bb.equals("blue") && bbb.equals("blue")) {
                return true;
            } else if (c.equals("blue") && cc.equals("blue") && ccc.equals("blue")) {
                return true;
            } else if (a.equals("blue") && b.equals("blue") && c.equals("blue")) {
                return true;
            } else if (aa.equals("blue") && bb.equals("blue") && cc.equals("blue")) {
                return true;
            } else if (aaa.equals("blue") && bbb.equals("blue") && ccc.equals("blue")) {
                return true;
            } else if (a.equals("blue") && bb.equals("blue") && ccc.equals("blue")) {
                return true;
            } else if (aaa.equals("blue") && bb.equals("blue") && c.equals("blue")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public static void resetEverything() {
        a1.setEnabled(true);
        a1.setBackground(null);
        a1.setName("");

        a2.setEnabled(true);
        a2.setBackground(null);
        a2.setName("");

        a3.setEnabled(true);
        a3.setBackground(null);
        a3.setName("");

        b1.setEnabled(true);
        b1.setBackground(null);
        b1.setName("");

        b2.setEnabled(true);
        b2.setBackground(null);
        b2.setName("");

        b3.setEnabled(true);
        b3.setBackground(null);
        b3.setName("");

        c1.setEnabled(true);
        c1.setBackground(null);
        c1.setName("");

        c2.setEnabled(true);
        c2.setBackground(null);
        c2.setName("");

        c3.setEnabled(true);
        c3.setBackground(null);
        c3.setName("");

        totalInstance = 0;
        checkInstance = 0;
        a = "";
        aa = "";
        aaa = "";
        b = "";
        bb = "";
        bbb = "";
        c = "";
        cc = "";
        ccc = "";
        labelPlayer.setText("Player 1 Turn");

    }
    
}
