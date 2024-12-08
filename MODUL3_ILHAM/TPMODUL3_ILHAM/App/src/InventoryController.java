import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {
    @FXML
    private TableView<Album> tabelAlbum;

    @FXML
    private TableColumn<Album, String> kolomNamaAlbum;

    @FXML
    private TableColumn<Album, String> kolomArtis;

    @FXML
    private TableColumn<Album, Integer> kolomTotal;

    @FXML
    private TableColumn<Album, Integer> kolomAvailable;

    @FXML
    private TextField namaAlbumField;

    @FXML
    private TextField artisField;

    @FXML
    private TextField totalField;

    @FXML
    private TextField rentedField;

    private final ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        kolomNamaAlbum.setCellValueFactory(new PropertyValueFactory<>("namaAlbum"));
        kolomArtis.setCellValueFactory(new PropertyValueFactory<>("artis"));
        kolomTotal.setCellValueFactory(new PropertyValueFactory<>("total"));
        kolomAvailable.setCellValueFactory(new PropertyValueFactory<>("available"));
        tabelAlbum.setItems(albumList);
    }

    @FXML
    public void tambah() {
        try {
            String namaAlbum = namaAlbumField.getText();
            String artis = artisField.getText();
            int total = Integer.parseInt(totalField.getText());
            int rented = Integer.parseInt(rentedField.getText());
            int available = total - rented;
            albumList.add(new Album(namaAlbum, artis, total, available, rented));
            clearFields();
            showAlert("INFO", "Berhasil", "Album berhasil ditambahkan");
        } catch (NumberFormatException e) {
            showAlert("ERROR", "Input Salah", "Jumlah harus berupa angka.");
        }
    }

    @FXML
    public void hapus() {
        Album selectedAlbum = tabelAlbum.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            clearFields();
            showAlert("INFO", "Berhasil", "Album berhasil dihapus");
        } else {
            showAlert("ERROR", "Hapus Gagal", "Pilih album untuk dihapus.");
        }
    }

    @FXML
    public void update() {
        Album selectedAlbum = tabelAlbum.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                String namaAlbum = namaAlbumField.getText();
                String artis = artisField.getText();
                int total = Integer.parseInt(totalField.getText());
                int rented = Integer.parseInt(rentedField.getText());
                int available = total - rented;
                selectedAlbum.setNamaAlbum(namaAlbum);
                selectedAlbum.setArtis(artis);
                selectedAlbum.setTotal(total);
                selectedAlbum.setAvailable(available);
                selectedAlbum.setRented(rented);
                tabelAlbum.refresh();
                clearFields();
                showAlert("INFO", "Berhasil", "Album berhasil diperbarui");
            } catch (NumberFormatException e) {
                showAlert("ERROR", "Input Salah", "Jumlah harus berupa angka.");
            }
        } else {
            showAlert("ERROR", "Update Gagal", "Pilih album untuk diupdate.");
        }
    }

    @FXML
    public void sewa() {
        Album selectedAlbum = tabelAlbum.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            if (selectedAlbum.getAvailable() > 0) {
                selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
                selectedAlbum.setRented(selectedAlbum.getRented() + 1);
                tabelAlbum.refresh();
                showAlert("INFO", "Berhasil", "Album berhasil disewa");
            } else {
                showAlert("ERROR", "Sewa Gagal", "Tidak ada album yang tersedia untuk disewa");
            }
        } else {
            showAlert("ERROR", "Sewa Gagal", "Pilih album untuk disewa.");
        }
    }

    private void clearFields() {
        namaAlbumField.clear();
        artisField.clear();
        totalField.clear();
        rentedField.clear();
    }

    private void showAlert(String alertType, String title, String message) {
        Alert alert = new Alert(Alert.AlertType.valueOf(alertType));
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
