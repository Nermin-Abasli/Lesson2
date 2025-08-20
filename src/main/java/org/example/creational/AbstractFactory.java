package org.example.creational;

public class AbstractFactory {

interface Document{
    void print();
}
interface Footer{
    void printFooter();
}
class PdfDocument implements Document{
    @Override
    public void print() {
        System.out.println("Print PDF");
    }
}
class WordDocument implements Document {
    @Override
    public void print() {
        System.out.println("Printing Word");
    }

    class PdfFooter implements Footer {
        @Override
        public void printFooter() {
            System.out.println("Print PDF Footer");

        }
        class WordFooter implements Footer{
            @Override
            public void printFooter() {
                System.out.println("Printing Word Footer");
            }
            interface DocumentFactory{
                Document createDoucument();
                Footer createFooter();
            }
            class PdfFactory implements DocumentFactory{
                @Override
                public Footer createFooter() {
                    return new PdfFooter();
                }

                @Override
                public Document createDoucument() {
                    return new PdfDocument();

                }
                class WordFactory implements DocumentFactory{
                    @Override
                    public Document createDoucument() {
                        return new WordDocument();
                    }

                    @Override
                    public Footer createFooter() {
                        return new WordFooter();
                    }
                    public static void main(String[] args){
                        DocumentFactory factory=new PdfFactory();
                        Document document=factory.createDoucument();
                        Footer footer=factory.createFooter();
                        document.print();
                        footer.printFooter();
                    }

                }
            }

            }
        }
    }
}