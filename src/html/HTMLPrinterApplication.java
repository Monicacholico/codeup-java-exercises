package html;

public class HTMLPrinterApplication {
    public static void main(String[] args) {
        Paragraph p = new Paragraph("Some text");
        Span span = new Span("Some text");
        Anchor a = new Anchor("click me");

        Element[] elements = {p, span, a};
        printElements(elements);

        System.out.println(p.toHTML()); // <p>Some text </p>
        System.out.println(span.toHTML());
    }

    public static void printElements(Element [] elements){
        for(Element element: elements){
            System.out.println(element.toHTML());
        }

    }

}
