package org.example.creational;

public class Prototype {
}
interface Document extends Cloneable{
    Document cloneDocument();
    void setContent(String content);
    void print();
}
class PdfReport implements Document {
    private String content;

    public PdfReport(String content) {
        this.content = content;
    }
        @Override
        public Document cloneDocument () {
            try {
                return (Document) super.clone();
            } catch (CloneNotSupportedException e) {
                return null;
            }
        }
        @Override
        public void setContent (String content){
            this.content = content;
        }
        @Override
        public void print () {
            System.out.println("Printing" + content);
        }
        public static void main (String[]args){
            PdfReport orijinal = new PdfReport("Template Content");
            PdfReport copy1 = (PdfReport) orijinal.cloneDocument();
            copy1.setContent("Client A Data");
            PdfReport copy2 = (PdfReport) orijinal.cloneDocument();
            copy1.setContent("Client B Data");
            orijinal.print();
            copy1.print();
            copy2.print();
            orijinal.print();
        }
    }
