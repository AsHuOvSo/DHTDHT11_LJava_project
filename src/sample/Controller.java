package sample;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.Pane;

public class Controller {

    @FXML
    private Pane basePane;

    @FXML
    private LineChart<?, ?> lineChartTemp;

    @FXML
    private CategoryAxis lineChartTempCatAxis;

    @FXML
    private NumberAxis lineChartTempNumbAxis;

    @FXML
    private LineChart<?, ?> lineChartHum;

    @FXML
    private CategoryAxis lineChartHumCatAxis;

    @FXML
    private NumberAxis lineChartHumNumbAxis;

}