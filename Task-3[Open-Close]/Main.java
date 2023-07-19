public class Main {
    public static void main(String[] args) {
        Document pdfDoc = new PdfDocument();
        Document wordDoc = new WordDocument();
        Document excelDoc = new ExcelDocument();
        pdfDoc.process();
        wordDoc.process();
        excelDoc.process();
    }
}