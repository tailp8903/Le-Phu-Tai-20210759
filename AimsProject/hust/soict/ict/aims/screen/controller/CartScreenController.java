package AimsProject.hust.soict.ict.aims.screen.controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView;

import AimsProject.hust.soict.ict.aims.cart.Cart;
import AimsProject.hust.soict.ict.aims.media.Media;

public class CartScreenController {
    private Cart cart;
    private JButton btnPlay, btnRemove;

    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private TableColumn<Media, String> colMediaTitle;

    @FXML
    private TableColumn<Media, String> colMediacategory;

    @FXML
    private TableColumn<Media, Float> colMediaCost;

    public CartScreenController(Cart cart){
        super();
        this.cart = cart;
    }

    @FXML
    private void initialize(){
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediacategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, Float>("cost"));
        tblMedia.setItems(this.cart.getNumberOfItem());

        btnPlay.setVisible(false);
        btnRemove.setVisible(false);

        tblMedia.getSelectionMode().selectedItemProperty().addListener(
            new ChangeListener<Media>() {
                @Override
                public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue){
                    if (newValue != null){
                        updateButtonBar(newValue);
                    }
                }

                void updateButtonBar(Media media){
                    btnRemove.setVisible(true);
                    if (media instanceof Playable){
                        btnPlay.setVisible(true);
                    }else{
                        btnPlay.setVisible(false);
                    }
                }
            };
        )
    }

    @FXML
    void btnRemovePressed(ActionEvent event){
        Media media = tblMedia.getSelectionMode().getSelectedItem();
        cart.removeMedia(media);
    }
}
