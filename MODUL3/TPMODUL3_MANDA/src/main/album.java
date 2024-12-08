package main;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class album {

    @FXML
    private TableView<album> albumTableView;

    @FXML
    private TableColumn<album, String> availableColumn;

    @FXML
    private TableColumn<album, String> totalColumn;

    @FXML
    private TableColumn<album, String> artistColumn;

    @FXML
    private TableColumn<album, String> albumNameColumn;

    @FXML
    private TextField judulAlbumField;

    @FXML
    private TextField namaArtisField;

    @FXML
    private TextField jumlahTotalField;

    @FXML
    private TextField jumlahRentedField;

    private ObservableList<album> albumList = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        // Initialize table columns
        availableColumn.setCellValueFactory(new PropertyValueFactory<>("available"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
        albumNameColumn.setCellValueFactory(new PropertyValueFactory<>("albumName"));

        // Populate the table with initial data (if any)
        albumList.addAll(getInitialAlbumData());
        albumTableView.setItems(albumList);
    }

    // Method to fetch initial album data (replace with your actual data source)
    private List<album> getInitialAlbumData() {
        List<album> initialAlbums = new ArrayList<>();
        // Add your albums here
        return initialAlbums;
    }

    @FXML
    void handleRentSelectedAction(ActionEvent event) {
        // Handle the "Rent Selected" button action
        // Get the selected album from the table and update its rented count
        album selectedAlbum = albumTableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            // Implement logic to update the selected album's rented count
            // ...
        } else {
            // Handle the case where no album is selected
            // ...
        }
    }
}


