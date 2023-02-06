/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ump;

/**
 *
 * @author hp
 */
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * A pie chart with no section labels.
 */
public class PieChartDemo5 extends ApplicationFrame {

    /**
     * Creates a new demo instance.
     *
     * @param title  the frame title.
     */
    public PieChartDemo5(final String title) {
        super(title);
        final PieDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);

        // add the chart to a panel...
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);
    }

   
    private PieDataset createDataset() {
        final DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Faculty", new Double(43.2));
        dataset.setValue("Hod", new Double(10.0));
        dataset.setValue("User", new Double(27.5));
        dataset.setValue("Student", new Double(17.5));
        dataset.setValue("Dean", new Double(11.0));
        dataset.setValue("Admin", new Double(19.4));
        return dataset;       
    }
    
   
    
    private JFreeChart createChart(final PieDataset dataset) {
        
        final JFreeChart chart = ChartFactory.createPieChart(
            "University Management Portal",  // chart title
            dataset,             // dataset
            true,                // include legend
            true,
            false
        );
        final PiePlot plot = (PiePlot) chart.getPlot();
        plot.setNoDataMessage("No data available");
        plot.setExplodePercent(1, 0.30);
        return chart;
    }
    
    
    public static void main(final String[] args) {

       
        final PieChartDemo5 demo = new PieChartDemo5("Pie Chart");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}
