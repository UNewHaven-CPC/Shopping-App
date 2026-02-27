module org.yashgamer.shoppingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.yashgamer.shoppingapp to javafx.fxml;
    exports org.yashgamer.shoppingapp;
}