package html;

public class Element {
    private String  tag;
    private String text;
    protected Boolean isBlockLevel;
    private String [] attributes;

    public Element(String text, String tag){
        this.text = text;
        this.tag = tag;
    }

    public String toHTML(){
        return "<" + tag + ">" + text + "</" + tag + ">";
    }

}
