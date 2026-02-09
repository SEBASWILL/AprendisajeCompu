package Interfaz;

import Mundo.MATRIZ;
import Mundo.Solver;

import javax.swing.*;
import java.awt.*;

public class PuzzleUI extends JFrame {

    private MATRIZ matriz;
    private JButton[][] botones;
    private JLabel lblMovimientos;

    private final Color VERDE_FONDO = new Color(200, 240, 200);
    private final Color VERDE_FICHA = new Color(250, 250, 250);
    private final Color BLANCO_VACIO = new Color(230, 230, 230);

    public PuzzleUI() {
        matriz = new MATRIZ();
        botones = new JButton[4][4];
        crearUI();
        conectarMatrizConUI();
        refrescarTablero();
    }

    private void crearUI() {
        setTitle("15 Puzzle");
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(VERDE_FONDO);


        lblMovimientos = new JLabel("Movimientos: ", SwingConstants.CENTER);
        lblMovimientos.setFont(new Font("Arial", Font.BOLD, 18));
        lblMovimientos.setOpaque(true);
        lblMovimientos.setBackground(new Color(200, 240, 200));
        lblMovimientos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(lblMovimientos, BorderLayout.NORTH);


        JPanel panelTablero = new JPanel(new GridLayout(4, 4, 8, 8));
        panelTablero.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panelTablero.setBackground(VERDE_FONDO);

        Font fuente = new Font("Arial", Font.BOLD, 22);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int x = i;
                int y = j;
                JButton btn = new JButton();
                btn.setFont(fuente);
                btn.setFocusPainted(false);
                btn.setOpaque(true);
                btn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                btn.addActionListener(e-> intentarmover(x ,y ));
                botones[i][j] = btn;
                panelTablero.add(btn);
            }
        }

        add(panelTablero, BorderLayout.CENTER);

    
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(VERDE_FONDO);

        JButton btnResolver = new JButton("Resolver");
        btnResolver.setFont(new Font("Arial", Font.BOLD, 16));

        btnResolver.setPreferredSize(new Dimension(130, 45));
        btnResolver.setBackground(new Color(120, 180, 255)); // azul
        btnResolver.setFocusPainted(false);
        panelBotones.add(btnResolver);

        JButton btnRevolver = new JButton("Revolver");
        btnRevolver.setFont(new Font("Arial", Font.BOLD, 16));

        btnRevolver.setPreferredSize(new Dimension(130, 45));
        btnRevolver.setBackground(new Color(255, 120, 120)); 
        btnRevolver.setFocusPainted(false);
        panelBotones.add(btnRevolver);
        btnRevolver.addActionListener(e -> revolerpuzzle());
        btnResolver.addActionListener(e -> resolverPuzzle());
        add(panelBotones, BorderLayout.SOUTH);
    }

    private void conectarMatrizConUI() {
        matriz.setActualizarInterfaz(() -> {
            SwingUtilities.invokeLater(this::refrescarTablero);
        });
    }

    private void refrescarTablero() {
        String[][] estado = matriz.get();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton btn = botones[i][j];
                String valor = estado[i][j];

                if (valor.equals(" ")) {
                    btn.setText("");
                    btn.setBackground(BLANCO_VACIO);
                    btn.setEnabled(false);
                } else {
                    btn.setText(valor);
                    btn.setBackground(VERDE_FICHA);
                    btn.setEnabled(true);
                }
            }
        }

        lblMovimientos.setText("Movimientos: " + matriz.getNPasos());
    }

    private void resolverPuzzle() {

        new Thread(() -> {
            Solver.ordenar(matriz);

        }).start();
    }

    private void revolerpuzzle() {

        new Thread(() -> {
            Solver.desordenar(matriz);

        }).start();

    }
    private void intentarmover(int i, int j){
        matriz.intmvover(i, j);
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PuzzleUI().setVisible(true));
    }
}
