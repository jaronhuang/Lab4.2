import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class BarGraph extends Application {
    final static String Brooklyn = "Brooklyn";
    final static String Bronx = "Bronx";
    final static String Manhattan = "Manhattan";
    final static String Queens = "Queens";
    final static String StatenIsland = "Staten Island";
 
    @Override public void start(Stage stage) {
        stage.setTitle("Park Crime per Borough");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Park Crime per Borough");
        xAxis.setLabel("Borough");       
        yAxis.setLabel("Crime Amount");
 
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Q3 of 2017");       
        series1.getData().add(new XYChart.Data(Brooklyn, 25601.34));
        series1.getData().add(new XYChart.Data(Bronx, 20148.82));
        series1.getData().add(new XYChart.Data(Manhattan, 10000));
        series1.getData().add(new XYChart.Data(Queens, 35407.15));
        series1.getData().add(new XYChart.Data(StatenIsland, 12000));      
        
        
        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}