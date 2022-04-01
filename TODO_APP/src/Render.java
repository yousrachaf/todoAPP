import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Render  extends Application {
    String namePage; // name est utiliser pour afficher le mois sur le stage starttodo
    Image ArPlan; // les images en arriere plan pour les stages

    public void startMois(Stage theStageMois) {
        theStageMois.hide();
        theStageMois.setTitle("Task management tool 1.0");
        //creation canvas
        Group root = new Group();
        Scene theScene = new Scene(root);
        theStageMois.setScene(theScene);
        Canvas canvas = new Canvas(423, 699);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        ArPlan = new Image( "Moistodo.png" );
        gc.drawImage( ArPlan, 0, 0 );

        //creer un boutton pour le mois de janvier
        Button button_janvier = new Button("January");
        root.getChildren().add(button_janvier);
        button_janvier.setTranslateX(61);
        button_janvier.setTranslateY(107);
        button_janvier.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="January";
                startTodo(theStageMois);
            }
        });
        ////creer un boutton pour le mois de fevrier
        Button button_fevrier = new Button("February");
        root.getChildren().add(button_fevrier);
        button_fevrier.setTranslateX(189);
        button_fevrier.setTranslateY(107);
        button_fevrier.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="February";
                startTodo(theStageMois);
            }
        });
        //creer un boutton pour le mois de Mars
        Button button_Mars = new Button("March");
        root.getChildren().add(button_Mars);
        button_Mars.setTranslateX(318);
        button_Mars.setTranslateY(107);
        button_Mars.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="March";
                startTodo(theStageMois);
            }
        });
        //creer un boutton pour le mois d'arvil
        Button button_Avril = new Button("April");
        root.getChildren().add(button_Avril);
        button_Avril.setTranslateX(61);
        button_Avril.setTranslateY(250);
        button_Avril.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="April";
                startTodo(theStageMois);
            }
        });
        //creer un boutton pour le mois de mai
        Button button_Mai = new Button("May");
        root.getChildren().add(button_Mai);
        button_Mai.setTranslateX(189);
        button_Mai.setTranslateY(250);
        button_Mai.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="May";
                startTodo(theStageMois);
            }
        });
        //creer un boutton pour le mois de juin
        Button button_Juin = new Button("June");
        root.getChildren().add(button_Juin);
        button_Juin.setTranslateX(318);
        button_Juin.setTranslateY(250);
        button_Juin.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="June";
                startTodo(theStageMois);
            }
        });
        //creer un boutton pour le mois de juillet
        Button button_Juillet = new Button("July");
        root.getChildren().add(button_Juillet);
        button_Juillet.setTranslateX(61);
        button_Juillet.setTranslateY(396);
        button_Juillet.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="July";
                startTodo(theStageMois);
            }
        });
        //creer un boutton pour le mois de aout
        Button button_Aout = new Button("August");
        root.getChildren().add(button_Aout);
        button_Aout.setTranslateX(189);
        button_Aout.setTranslateY(396);
        button_Aout.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="August";
                startTodo(theStageMois);
            }
        });
        //creer un boutton pour le mois de septembre
        Button button_Septembre = new Button("September");
        root.getChildren().add(button_Septembre);
        button_Septembre.setTranslateX(309);
        button_Septembre.setTranslateY(396);
        button_Septembre.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="September";
                startTodo(theStageMois);
            }
        });
        //creer un boutton pour le mois de octobre
        Button button_Octobre = new Button("October");
        root.getChildren().add(button_Octobre);
        button_Octobre.setTranslateX(61);
        button_Octobre.setTranslateY(540);
        button_Octobre.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="October";
                startTodo(theStageMois);
            }
        });
        //creer un boutton pour le mois de novembre
        Button button_Novembre = new Button("November");
        root.getChildren().add(button_Novembre);
        button_Novembre.setTranslateX(185);
        button_Novembre.setTranslateY(540);
        button_Novembre.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="November";
                startTodo(theStageMois);
            }
        });
        //creer un boutton pour le mois de decembre
        Button button_Decembre = new Button("December");
        root.getChildren().add(button_Decembre);
        button_Decembre.setTranslateX(310);
        button_Decembre.setTranslateY(540);
        button_Decembre.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                namePage="December";
                startTodo(theStageMois);
            }
        });

        // Creation du boutton pour ajouter une liste des taches
        Button button_addList = new Button("Add List");
        root.getChildren().add(button_addList);
        button_addList.setTranslateX(27);
        button_addList.setTranslateY(21);
        button_addList.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                popStage();
            }
        });

        theStageMois.show();
    }
    public void startTodo(Stage TheStageTodo) {
        TheStageTodo.hide();
        TheStageTodo.setTitle("Task management tool 1.0");
        Group root = new Group();
        Scene theScene = new Scene(root);
        TheStageTodo.setScene(theScene);
        Canvas canvas = new Canvas(423, 699);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        ArPlan = new Image( "page_vide.png" );
        gc.drawImage( ArPlan, 0, 0 );
        //titre de la page de chaque mois
        gc.setFill( Color.PURPLE );
        gc.setStroke( Color.BLACK );
        gc.setLineWidth(2);
        Font theFont = Font.font( "Garamond", FontWeight.BOLD, 38 );
        gc.setFont(theFont);
        gc.strokeText( namePage,150, 65 );
        gc.fillText(namePage, 151, 66);
        // name page change en cliquant sur les boutons de mois
        // creation de boutton pour retourner a la page principale.
        Button button_Retour = new Button("Back");
        root.getChildren().add(button_Retour);
        button_Retour.setTranslateX(25);
        button_Retour.setTranslateY(18);
        button_Retour.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                startMois(TheStageTodo);
            }
        });

        TheStageTodo.show();
    }

    @Override
    public void start(Stage stage) {
        stage.hide();
        stage.setTitle("Task management tool 1.0");
        Group root = new Group();
        Scene theScene = new Scene(root);
        stage.setScene(theScene);
        Canvas canvas = new Canvas(423, 699);
        root.getChildren().add(canvas);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        ArPlan = new Image( "startpa.png" );
        gc.drawImage( ArPlan, 0, 0 );
        theScene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                startMois(stage);
            }
        });

        stage.show();
    }


    private static Desktop desktop = Desktop.getDesktop();

    public static void popStage() {

        Stage newStage = new Stage();

        final FileChooser fileChooser = new FileChooser();


        VBox vBox1 = new VBox(); // Creer une box verticale.
        Scene scene1 = new Scene(vBox1);
        vBox1.setSpacing(1); // l'espace entre les box

        // Creer une box horizontale.
        HBox hbox1 = new HBox();
        hbox1.setSpacing(8);
        hbox1.setPadding(new Insets(10, 10, 10, 10));


         //On cree une tabletri (TableView) pour pouvoir ajouter, supprimer et modifier nos taches
        final TableView<TacheDO.Task> tabletri = new TableView<TacheDO.Task>();
        final ObservableList<TacheDO.Task> data = FXCollections.observableArrayList(
                new TacheDO.Task("01-03-2022", "exemple tache", "15/04/2022", "high", "tom21"));

        tabletri.setEditable(true); //Permet d'ajouter et modifier du texte dans les cases de ma table

        // Nommer les colonnes de la tabletri.
        TableColumn dayCol = new TableColumn("Day");
        TableColumn descriptionCol = new TableColumn("Description");
        TableColumn deadlineCol = new TableColumn("Deadline");
        TableColumn priorityCol = new TableColumn("Priority");
        TableColumn shareCol = new TableColumn("Share With");


        // setCellValueFactory : Ajouter et remplir toutes les cellules dans ma table, fournit une instance de cette derniere.
        // Permet que les mises à jour immédiates de la valeur soient reflétées à l'écran.
        dayCol.setCellValueFactory(new PropertyValueFactory<TacheDO.Task, String>("Day"));
        dayCol.setCellFactory(TextFieldTableCell.forTableColumn());
        dayCol.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<TacheDO.Task, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<TacheDO.Task, String> t) {
                        ((TacheDO.Task) t.getTableView().getItems().get(t.getTablePosition().getRow())).setDay(t.getNewValue());
                    }
                }
        );


        deadlineCol.setCellValueFactory(new PropertyValueFactory<TacheDO.Task, String>("Deadline"));
        deadlineCol.setCellFactory(TextFieldTableCell.forTableColumn());
        deadlineCol.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<TacheDO.Task, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<TacheDO.Task, String> t) {
                        ((TacheDO.Task) t.getTableView().getItems().get(t.getTablePosition().getRow())).setDeadline(t.getNewValue());
                    }
                }
        );
        descriptionCol.setCellValueFactory(new PropertyValueFactory<TacheDO.Task, String>("Description"));
        descriptionCol.setCellFactory(TextFieldTableCell.forTableColumn());
        descriptionCol.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<TacheDO.Task, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<TacheDO.Task, String> t) {
                        ((TacheDO.Task) t.getTableView().getItems().get(t.getTablePosition().getRow())).setDescription(t.getNewValue());
                    }
                }
        );

        priorityCol.setCellValueFactory(new PropertyValueFactory<TacheDO.Task, String>("Priority"));
        priorityCol.setCellFactory(TextFieldTableCell.forTableColumn());
        priorityCol.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<TacheDO.Task, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<TacheDO.Task, String> t) {
                        ((TacheDO.Task) t.getTableView().getItems().get(t.getTablePosition().getRow())).setPriority(t.getNewValue());
                    }
                }
        );

        shareCol.setCellValueFactory(new PropertyValueFactory<TacheDO.Task, String>("Share"));
        shareCol.setCellFactory(TextFieldTableCell.forTableColumn());
        shareCol.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<TacheDO.Task, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<TacheDO.Task, String> t) {
                        ((TacheDO.Task) t.getTableView().getItems().get(t.getTablePosition().getRow())).setShare(t.getNewValue());
                    }
                }
        );

        tabletri.setItems(data);
        tabletri.getColumns().addAll(dayCol, descriptionCol, deadlineCol, priorityCol, shareCol); // Place the column headings in tabletri.

        // On définit la largeur : width
        tabletri.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        dayCol.setMinWidth(80);
        descriptionCol.setMinWidth(280);
        deadlineCol.setMinWidth(80);
        priorityCol.setMinWidth(60);
        shareCol.setMinWidth(60);

        //Créez des champs de texte afin que l’utilisateur puisse entrer de nouvelles tâches dans le tableau.
        DatePicker addDay = new DatePicker();
        TextField addDescription = new TextField();
        DatePicker addDeadline = new DatePicker();
        TextField addPriority = new TextField();
        TextField addShare = new TextField();

        // Définir le texte initial dans les champs.
        addDay.setValue(LocalDate.now());
        addDescription.setText("Task description");
        addDeadline.setValue(LocalDate.now());
        addPriority.setText("Priority level..?");
        addShare.setText("Enter the User Name");

        // Définir la longueur
        addDay.setPrefWidth(120);
        addDescription.setPrefWidth(200);
        addDeadline.setPrefWidth(120);
        addPriority.setPrefWidth(65);
        addShare.setPrefWidth(65);

        // // Creation du boutton pour ajouter des taches
        Button btnAdd = new Button("Add Task");
        btnAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e)  {
                data.add(new TacheDO.Task(addDay.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                        addDescription.getText(),
                        addDay.getValue().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                        addPriority.getText(),
                        addShare.getText()));
            }
        });



        // Creer un menu qui va nous permettre d'ouvrir et de sauver un fichier
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("_File");
        MenuItem open = new MenuItem("Load..");
        MenuItem save = new MenuItem("Save As..");

        fileMenu.getItems().add(open);
        fileMenu.getItems().add(save);

        menuBar.getMenus().add(fileMenu);


        open.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(final ActionEvent e) {
                File opensFile = fileChooser.showOpenDialog(newStage);
                if (opensFile != null) {openFile(opensFile);
                }
            }
        });

        save.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent e) {
                fileChooser.setTitle("Save");
                fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("All Files", "*.*"));
                File savesFile = fileChooser.showSaveDialog(newStage);
                if (savesFile != null) {
                    saveFile(savesFile,data);
                }
            }
        });

        //Obtenir les champs de saisie (entry fields) utilisateur dans une ligne (row) horizontale.
        hbox1.getChildren().addAll(addDay, addDescription, addDeadline, addPriority, addShare, btnAdd);
        //Obtenir tout les items dans un format d'empilement vertical
        vBox1.getChildren().addAll(menuBar,hbox1,tabletri);

        newStage.setTitle("liste des tâches");
        newStage.setScene(scene1);
        newStage.show();
    }

    private static void openFile(File opensFile) {
        try{
            desktop.open(opensFile);
        } catch (IOException ex) {Logger.getLogger(Render.class.getName()).log(Level.SEVERE, null, ex);}}


    //pour pouvoir stocker mes taches dans un fichier
    private static void saveFile(File savesFile,ObservableList<TacheDO.Task> data) {
        PrintWriter fw = null;
        try(BufferedWriter bw = new BufferedWriter(new PrintWriter(savesFile))){
            for (TacheDO.Task element:data
                 ) {
            bw.write(element.getDay());
            bw.write(", ");
            bw.write(element.getDescription());
            bw.write(", ");
            bw.write(element.getDeadline());
            bw.write(", ");
            bw.write(element.getPriority());
            bw.write(", ");
            bw.write(element.getShare());
            bw.newLine();
            }
            fw.close();
        } catch (IOException ex) {Logger.getLogger(Render.class.getName()).log(Level.SEVERE, null, ex);
        fw.close();
        }}
}


