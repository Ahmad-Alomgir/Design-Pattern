abstract class Document {
    public abstract void process();
}

class PdfDocument extends Document {
    public void process() {
        System.out.println("Processing PDF document...");
        // Perform PDF document processing logic.
    }
}

@override

class WordDocument extends Document {
    public void process() {
        System.out.println("Processing Word document...");
        // Perform Word document processing logic.
    }
}

class ExcelDocument extends Document {
    public void process() {
        System.out.println("Processing Excel document...");
        // Perform Excel document processing logic.
    }
}
