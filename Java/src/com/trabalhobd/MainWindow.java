package com.trabalhobd;

import com.trabalhobd.classes.Clinica;
import com.trabalhobd.classes.OracleDB;
import com.trabalhobd.models.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    //UI
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane3;
    private JTable utilizadoresTable;
    JPanel adminWindow;
    private JTabbedPane tabbedPane4;
    private JTextField unomeField;
    private JTextField uMoradaField;
    private JTextField uTelefoneField;
    private JTextField uUsernameField;
    private JLabel uPasswordField;
    private JTextField uEmailField;
    private JButton uInserirButton;
    private JTable medicosTable;
    private JTextField mINomeField;
    private JTextField mIMoradaField;
    private JTextField textField1;
    private JButton inserirMedicoButton;
    private JTextField mRNomeField;
    private JButton mRemoverButton;
    private JTextField uRNomeField;
    private JButton removerButton;
    private JTable analisesTable;
    private JTextField textField2;
    private JButton aITipoButton;
    private JTextField aRTipoField;
    private JButton aRemoverButton;
    private JTable examesTable;
    private JTextField eTipoField;
    private JButton eInserirButton;
    private JTextField eRemoverField;
    private JButton eRemoverButton;
    private JTable consultasTable;
    private JTextField cInserirField;
    private JButton cInserirButton;
    private JTextField cRemoverField;
    private JButton cRemoverButton;
    private JTextField vRemoverField;
    private JButton vRemoverButton;
    private JTextField vInserirField;
    private JButton vInserirButton;
    private JTable vacinasTable;
    private JButton loadButton;
    private JButton saveButton;

    private Clinica clinica;
    private OracleDB oracle;
    private UtilizadorModel uModel;
    private MedicoModel mModel;
    private AnalisesModel aModel;
    private ConsultaModel cModel;
    private ExameModel eModel;
    private VacinaModel vModel;


    public MainWindow() {
        this.clinica = new Clinica();
        //        this.oracle = new OracleDB(clinica);


        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Object obj = actionEvent.getSource();
                if (obj == loadButton) {
//                    try {
//                        oracle.populateClinica();
//                    } catch (SQLException e) {
//                        e.printStackTrace();
//                    }
                    if(clinica != null)
                    clinica.dumpData();
                    uModel = new UtilizadorModel(clinica.getUtilizadores());
                    utilizadoresTable.setModel(uModel);

                    mModel = new MedicoModel(clinica.getMedicos());
                    medicosTable.setModel(mModel);

                    aModel = new AnalisesModel(clinica.getTipoAnalise());
                    analisesTable.setModel(aModel);

                    cModel = new ConsultaModel(clinica.getTipoConsulta());
                    consultasTable.setModel(cModel);

                    eModel = new ExameModel(clinica.getTipoExame());
                    examesTable.setModel(eModel);

                    vModel = new VacinaModel(clinica.getTipoVacina());
                    vacinasTable.setModel(vModel);
                }
            }
        });
    }

    public void createWindow() {
        JFrame mainWindow = new JFrame("Administração");
        mainWindow.setContentPane(new MainWindow().adminWindow);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.pack();
        mainWindow.setVisible(true);
    }
}
