public class GetOperationFactory {

    public Convertor getConvertor(String convertorType) {

        if (convertorType == null) {
            return null;
        }
        if (convertorType.equalsIgnoreCase("1")) {
            return new UpperCase();
        } else if (convertorType.equalsIgnoreCase("2")) {
            return new AlternateCase();
        } else if (convertorType.equalsIgnoreCase("3")) {
            return new CSVCase();
        }
        return null;
    }
}
