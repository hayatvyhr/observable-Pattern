public class displayAll implements observer{
    private int position ;
    private  String precision;
    @Override
    public void update (observable obs){
        precision = ((gps)obs).getPrecision();
        position = ((gps)obs).getPosition();

        System.out.println(
                "All Info: GPS Position - " + position +
                        ", Measurement Precision - " + precision
        );
    }
}
