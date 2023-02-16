package com.example.print;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Controller extends javax.swing.JFrame {

    public TextField Cheezan;
    public TextField Tadad;
    public TextField Rate;
    public TextField Small_Total;
    public TextField kul_total;
    public TextField Diya;
    public Button jButton1ActionPerformed;
    public Button jButton2ActionPerformed;
    public TextField Bakaya;
    String Query;

    
    Main obj1 = new Main();
    
    String[] listData = {"Jan", "Feb", "Mar"};
    
    Date data[];
    String connectQuery = null;

    BorderPane root = new BorderPane();


    //  String billNo="";
    Double totalAmount = 0.0;
    Double cash = 0.0;
    Double balance = 0.0;
    Double bHeight = 0.0;

    final ArrayList<String> itemName = new ArrayList<>();
    final ArrayList<String> quantity = new ArrayList<>();
    final ArrayList<String> itemPrice = new ArrayList<>();
    final ArrayList<String> subtotal = new ArrayList<>();


    //    public Controller() {
//        initComponents();
//    }
//
//    private void initComponents() {
//    }


    @FXML
    private void jButton2ActionPerformed(ActionEvent actionEvent) {//GEN-FIRST:event_jButton2ActionPerformed
        bHeight = (double) itemName.size();
        //JOptionPane.showMessageDialog(rootPane, bHeight);

        PrinterJob pj = PrinterJob.getPrinterJob();
        pj.setPrintable(new BillPrintable(connectQuery), getPageFormat(pj));
       // pj.setPrintable(new Report_PrintForAll(connectQuery), getPageFormat(pj));

        try {
            pj.print();

        } catch (PrinterException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    public PageFormat getPageFormat(PrinterJob pj) {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double bodyHeight = bHeight;
        double headerHeight = 7.0;
        double footerHeight = 5.0;
        double width = cm_to_pp(8);
        double height = cm_to_pp(headerHeight + bodyHeight + footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(0, 10, width, height - cm_to_pp(1));

        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);

        return pf;
    }


    protected static double cm_to_pp(double cm) {
        return toPPI(cm * 0.393600787);
    }

    protected static double toPPI(double inch) {
        return inch * 72d;
    }


    class BillPrintable implements Printable {

        String Query;
        DatabaseConnection connectNow;
        Connection connectDB;

        public BillPrintable(String connectQuery) {
        }


        public void Controller(String query) {
            Query = query;
        }

        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
                throws PrinterException {

            int r = 10;
            ImageIcon icon = new ImageIcon("D:\\Program Files\\Intellij Projects\\Seven Star\\src\\main\\resources\\Images\\2.png.jpeg");
            int result = NO_SUCH_PAGE;
            if (pageIndex == 0) {


                Graphics2D g2d = (Graphics2D) graphics;
                double width = pageFormat.getImageableWidth();
                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());


//                float necessaryWidth = 523f;
//                IRenderer tableRenderer = table.createRendererSubTree().setParent(doc.getRenderer());
//                LayoutResult tableLayoutResult = tableRenderer.layout(new LayoutContext(new LayoutArea(0, new Rectangle(necessaryWidth, 1000))));
//                float tableHeightTotal = tableLayoutResult.getOccupiedArea().getBBox().getHeight();
//
//
//                Document doc2 = new Document(pdfDoc2,  new PageSize(tableWidthTotal, tableHeightTotal));
//                doc2.setMargins(0,0,0,0);
//                doc2.add(table);


//  FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));


//  FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));

                try {
                    int y = 20;
                    int yShift = 10;
                    int headerRectHeight = 15;
                    // int headerRectHeighta=40;


                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                    g2d.drawImage(icon.getImage(), 20, 0, 180, 90, rootPane);

                    y += yShift + 55;
                    g2d.drawString("-------------------------------------", 12, y);
//                        y += yShift;
//                        g2d.drawString("           CodeGuid.com        ", 12, y);
                    y += yShift;
                    g2d.drawString("   Shop # ____,I/11-4 Fruit Market", 12, y);
                    y += yShift + 5;
                    g2d.drawString("              Islamabad    ", 12, y);
                    y += yShift + 5;
                    g2d.drawString("    1st  Phone No.# 03__________ ", 12, y);
                    y += yShift;
                    g2d.drawString("    2nd  Phone No.# 03__________ ", 12, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 12, y);
                    y += headerRectHeight;

//                if(itemName == itemName ) {
//                    for (int s = 0; s < r; s++) {
//                        g2d.drawString(" " + itemName.get(s) + "                            ", 10, y);
//                        y += yShift;
//                        g2d.drawString("      " + quantity.get(s) + " * " + itemPrice.get(s), 10, y);
//                        g2d.drawString(subtotal.get(s), 160, y);
//                        y += yShift;
//
//                    }
//                }

                    connectNow = new DatabaseConnection();
                    connectDB = connectNow.getConnection();
                    String connectQuery = "" ;
                    connectQuery = Query;
                    String connectQuery5 = "SELECT SUM( kul_total ) AS OverAll_Total,COUNT(*) AS Total_Customers,SUM( Type_Of_Products_Sold_CashIn ) AS Product_Type FROM cash_in_sell WHERE Date BETWEEN DATE_SUB(NOW(), INTERVAL 7 DAY) AND NOW()" ;

                    Statement statement = null;
                    int udhaar = 0;
                    int diya = 0;
                    int kulltotal = 0;
                    int OverAll_Total = 0;
                    int Product_Type = 0;
                    int Total_Customers = 0;
                    try {
                        statement = connectDB.createStatement();
                        ResultSet queryOutput = statement.executeQuery(connectQuery);
                        g2d.drawString(" NAME         CHEEZAN         TOTAL ", 10, y);
                        y += yShift + 5;

                        int grandTotal = 0;
                        while (queryOutput.next()) {
                            g2d.drawString(" " + queryOutput.getString("Name"), 10, y);
                            g2d.drawString(String.valueOf(queryOutput.getInt("kul_total")), 180, y);
                            y += yShift;


                        }
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }


                    try {
                        statement = connectDB.createStatement();
                        ResultSet queryOutput5 = statement.executeQuery(connectQuery5);


                        while (queryOutput5.next()) {
                            y += yShift;

                            OverAll_Total = queryOutput5.getInt("OverAll_Total");
                            Total_Customers = queryOutput5.getInt("Total_Customers");
                            Product_Type = queryOutput5.getInt("Product_Type");

                        }


                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }


                    g2d.drawString("-------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString(" Total amount:             " + kulltotal + "   ", 10, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString(" Total Cheezan:            " + Product_Type + "   ", 10, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString(" Total Customer:           " + Total_Customers + "   ", 10, y);
                    y += yShift;
                    g2d.drawString("-------------------------------------", 10, y);
                    y += yShift;
                    g2d.drawString("*************************************", 10, y);
                    y += yShift;
                    g2d.drawString("       THANK YOU FOR COMING            ", 10, y);
                    y += yShift + 3;
                    g2d.drawString("*************************************", 10, y);
                    y += yShift;
                    g2d.drawString("    Developer : Kashif Ur Rehman", 10, y);
                    y += yShift;
                    g2d.drawString("        CONTACT:xyrontech.com       ", 10, y);
                    y += yShift;


//                    print.TotalWidth = 400f;
//                    print.LockedWidth = true;
//                    Float h = table.TotalHeight;
//                    Document document = new Document(400, h, 0, 0, 0, 0);


                } catch (Exception e) {
                    e.printStackTrace();
                }

                result = PAGE_EXISTS;
            }
            return result;
        }

    }
}


