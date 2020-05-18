import java.util.*;
class PrintReport{
    public static void outputToPrinter(List<ReportItem> items){
        System.out.println("Output to printer");
        for(ReportItem item : items){
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
	public static void outputToSkreen(List<ReportItem> items){
        System.out.println("Output to Skreen");
        for(ReportItem item : items){
            System.out.format("show %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
    public static void outputToFile(List<ReportItem> items){
        System.out.println("Output to File");
        for(ReportItem item : items){
            System.out.format("save %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}