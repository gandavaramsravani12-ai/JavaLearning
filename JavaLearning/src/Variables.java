import javax.lang.model.element.VariableElement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Variables {
    int id;
    String name;
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Variables v1=new Variables();
        v1.id=1;
        v1.name="sravani";
        Variables v2=new Variables();
        v2.id=2;
        v2.name="srinu";
        System.out.println(v1.id+" "+v1.name);
        System.out.println(v2.id+" "+v2.name);

    }
}