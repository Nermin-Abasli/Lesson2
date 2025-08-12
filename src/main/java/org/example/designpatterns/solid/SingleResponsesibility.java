package org.example.designpatterns.solid;

public class SingleResponsesibility {
    //Bad example
    class Invoice {
        public void calculaTotal() {

        }

        public void printInvoice() {
            //print

        }

        public void savetoDb() {
            // save db

        }

    }

    // good example
    class Invoice1 {
        public void calculaTotal() {
        }

    }

    class InvoicePrinter {

        public void printInvoice() {
        }

    }

    class InvoiceSavDb {


        public void savetoDb() {
        }
    }
}