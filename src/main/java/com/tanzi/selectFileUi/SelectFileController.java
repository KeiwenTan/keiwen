package com.tanzi.selectFileUi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class SelectFileController {

    @FXML
    private TextField fileText;
    @FXML
    private Button selectBtn;


    public void selectBtn_action(ActionEvent event) {
        Stage s = null;
        FileChooser f = new FileChooser();
        f.setTitle("请选择文件");
        f.setInitialDirectory(new File("D:\\client\\logs"));
        File file = f.showOpenDialog(s);
        if (file == null) return;
        fileText.setText(file.getPath() + file.getName());
    }
}
