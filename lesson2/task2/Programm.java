class Programm{
    public static void main(String[] args){
        Report report = new Report();
        report.calculate();
        private List<ReportItem> items = report.output();
		
		PrintReport.outputToPrinter(items);
		PrintReport.outputToSkreen(items);
		PrintReport.outputToFile(items);	
		
    }
}