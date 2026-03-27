module org.yashgamer.shoppingapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    exports org.yashgamer.shoppingapp;

    opens org.yashgamer.shoppingapp to javafx.fxml;
    opens org.yashgamer.shoppingapp.view to javafx.fxml, javafx.graphics;
}