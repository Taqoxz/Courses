package EnumTest;

public class Operations {
    public double arithmethicOperation(double Number1,double Number2,Constants operation){
        double result = 0.0;
        switch (operation){
            case ADD:
                result = Number1+Number2;
                break;
            case SUBSTRACT:
                result = Number1-Number2;
                break;
            case MULTIPLY:
                result = Number1*Number2;
                break;
            case DIVIDE:
                result = Number1/Number2;
                break;
            default:
                break;
        }
        return result;
    }

    public enum Constants {
        ADD,SUBSTRACT,DIVIDE,MULTIPLY;
    }
}
